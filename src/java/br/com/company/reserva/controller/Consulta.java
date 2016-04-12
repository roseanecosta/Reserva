package br.com.company.reserva.controller;

import br.com.company.reserva.model.RetornaHotel;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Roseane
 */
@WebServlet(name = "Consulta", urlPatterns = {"/Consulta"})
public class Consulta extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        processRequest(request, response);

        RetornaHotel verificaTaxa = new RetornaHotel();
        ArrayList<Date> datas = new ArrayList<Date>();
        String tipoCliente = request.getParameter("tipoCliente");

        try {
            datas.add(new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("data1")));
            datas.add(new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("data2")));
            datas.add(new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("data3")));

            request.setAttribute("hotelIndicado", verificaTaxa.retornarHotel(datas, tipoCliente));
            request.getRequestDispatcher("/index.jsp").forward(request, response);

        } catch (ParseException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
