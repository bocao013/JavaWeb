package br.com.fatecmogidascruzes.eletivaweb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OlaMundo extends HttpServlet {
    
    @Override
    public void service(HttpServletRequest requisicao, HttpServletResponse resposta)
    throws IOException, ServletException {
        
        String nome = requisicao.getParameter("nome");
        
        PrintWriter saida = resposta.getWriter();
        saida.println("<!doctype html>");
        saida.println("<html>");
        saida.println(" <head>");
        saida.println(" </head>");
        saida.println(" <body>");
        saida.println(" <h1>Olá, " + nome + "!</h1>");
        saida.println(" </body>");
        saida.println("</html>");
        
    }
    
}
