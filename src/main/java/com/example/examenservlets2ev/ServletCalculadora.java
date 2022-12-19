package com.example.examenservlets2ev;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/servlet-calculadora")
public class ServletCalculadora extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        String list = request.getParameter("list");
        Double num1 = Double.parseDouble(request.getParameter("num1"));
        Double num2 = Double.parseDouble(request.getParameter("num2"));
        Double resultado = 0.0;
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Resultados</title><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>El resultado es:</h2>");
        out.println("<br>");
        switch (list){
            case "sumar":{
                resultado = num1 + num2;
                out.println("<ul><li>El resultado de la <b>Suma</b> es: "+resultado+"</li></ul>");
                break;
            }
            case "restar":{
                resultado = num1 - num2;
                out.println("<ul><li>El resultado de la <b>Resta</b> es: "+resultado+"</li></ul>");
                break;
            }
            case "multiplicar":{
                resultado = num1 * num2;
                out.println("<ul><li>El resultado de la <b>Multiplicación</b> es: "+resultado+"</li></ul>");
                break;
            }
            case "dividir":{
                resultado = num1 / num2;
                out.println("<ul><li>El resultado de la <b>División</b> es: "+resultado+"</li></ul>");
                break;
            }
        }
        out.println("<br>");
        out.println("<a class='btn btn-primary' href=\"javascript: history.go(-1)\">Volver a la página de operaciones</a>\n");
        out.println("</body>");
        out.println("</html>");
    }
}