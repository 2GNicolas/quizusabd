/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encrip;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LabingXEON
 */
public class construcor extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rq = request.getRequestDispatcher("index.jsp");

        String texto, resultado = null;
        int numero;
        texto = request.getParameter("TEXTO");
        numero = Integer.parseInt(request.getParameter("NUMERO"));
        System.out.println("ESTA ENTRANDOOO");

        if (request.getParameter("encriptar") != null) {
            resultado = Cesar(texto, numero);
            
            request.setAttribute("resultado", resultado);
            rq.forward(request, response);
        }
        ;

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public String Cesar(String texto, int numero) {
        int Cifra = numero;
        String resultado = "";
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] arreglo = texto.toCharArray();
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < alfabeto.length; j++) {
                char letraArreglo = arreglo[i];
                char letraAlfabeto = alfabeto[j];
                if (letraArreglo == letraAlfabeto) {
                    //System.out.println(j);
                    int p = j;
                    int c = (p + Cifra) % 26;
                    System.out.print(alfabeto[c] + " ");
                    resultado = resultado + alfabeto[c];
//                     System.out.println(resultado);
                }
            }
        }

        return resultado;
    }
}
