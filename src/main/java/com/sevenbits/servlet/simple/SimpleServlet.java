package com.sevenbits.servlet.simple;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            PrintWriter writer = response.getWriter();
            writer.println("<html>\n" +
                    "<body>\n" +
                    "<h2>Hello World 1!</h2>\n" +
                    "</body>\n" +
                    "</html>");
        } catch(IOException e) {}
    }
}
