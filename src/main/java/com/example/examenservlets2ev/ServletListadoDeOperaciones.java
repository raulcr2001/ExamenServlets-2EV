package com.example.examenservlets2ev;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/listado-operaciones")
public class ServletListadoDeOperaciones extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
        out.println("<title>Listado de Operaciones</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Listado de Operaciones</h1>");
        out.println("<br>");
        out.println("<ul>");
        out.println("<li>División</li>");
        out.println("<li>Resta</li>");
        out.println("<li>Suma</li>");
        out.println("<li>Producto</li>");
        out.println("</ul>");
        out.println("<br>");
        out.println("<a class='btn btn-primary' href=\"javascript: history.go(-1)\">Volver al inicio</a>\n");
        out.println("</body></html>");
    }
}
