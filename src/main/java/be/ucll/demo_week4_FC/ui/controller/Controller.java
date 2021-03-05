package be.ucll.demo_week4_FC.ui.controller;

import be.ucll.demo_week4_FC.domain.db.DierDB;
import be.ucll.demo_week4_FC.domain.model.Dier;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
    private DierDB db = new DierDB();

    public Controller() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String command = "home";
        if (request.getParameter("command") != null) {
            command = request.getParameter("command");
        }
        String destination;
        switch (command) {
            case "home":
                destination = home(request, response);
                break;
            case "overview":
                destination = overview(request, response);
                break;
            case "add":
                destination = add(request, response);
                break;
            case "deleteConfirmation":
                destination = getDeleteConfirmation();
                break;
            case "delete":
                destination = delete(request, response);
                break;
            default:
                destination = home(request, response);
        }
        request.getRequestDispatcher(destination).forward(request, response);
    }

    private String getDeleteConfirmation() {
        return "deleteConfirmation.jsp";
    }

    private String home(HttpServletRequest request, HttpServletResponse response) {
        Dier meestHongerigeDier = db.getMeestHongerigeDier();
        request.setAttribute("meestHongerige", meestHongerigeDier);
        return "index.jsp";
    }

    private String overview(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("dieren", db.getAlle());
        return "overview.jsp";
    }

    private String add(HttpServletRequest request, HttpServletResponse response) {
        String naam = request.getParameter("naam");
        String soort = request.getParameter("soort");
        String voedsel = request.getParameter("voedsel");
        if (!naam.isEmpty() && !soort.isEmpty() && !voedsel.isEmpty()) {
            Dier dier = new Dier(naam, soort, Integer.parseInt(voedsel));
            db.voegToe(dier);
            return overview(request, response);
        } else {
            return "add.jsp";
        }
    }

    private String delete(HttpServletRequest request, HttpServletResponse response) {
        String naam = request.getParameter("naam");
        db.verwijder(naam);
        return overview(request, response);
    }

}
