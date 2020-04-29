package ru.job4j.dream.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GreetingServletJSON extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json");
        String name = req.getParameter("name");
        PrintWriter writer = new PrintWriter(resp.getOutputStream());
        writer.append("{\"greeting\" : \"Nice to meet you, "  + name + "\"}");
        writer.flush();
    }
}