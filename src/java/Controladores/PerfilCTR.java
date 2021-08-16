/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Dao.PerfilDao;

import Modelo.Dto.PerfilDto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
public class PerfilCTR extends HttpServlet {

    private Integer id;
    private String descrip, comentario, accion, msj;
    private PerfilDto dto;
    private PerfilDao dao;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8"); //para respetar los tipos de caracter
        request.getSession();
        
        
        if (request.getParameter("agregar") != null) {
            accion = "esAgregar";
        } else if (request.getParameter("modificar") != null) {
            accion = "esModificar";
        } else {
            accion = "esEliminar";
        }

        //sintaxis para recuperar un name
        id = Integer.parseInt(request.getParameter("id_perfil").trim()); //trim quita espacios
        descrip = request.getParameter("des_perfil").trim();
        comentario = request.getParameter("com_perfil").trim();

        dto = new PerfilDto();
        dto.setId(id);
        dto.setDescripcion(descrip);
        dto.setComentario(comentario);

//        dao = new PerfilDaoImp();
//        switch (accion) {
//            case "esAgregar":
//                if (dao.agregar(dto) == true) {
//                    //aviso ok
//                    request.setAttribute("msj", "(\"Good job!\", \"You clicked the button!\", \"success\")");
//                } else {
//                    //aviso error
//                    request.setAttribute("msj", "(\"Good job!\", \"You clicked the button!\", \"error\")");
//                }
//            break;
//            case "esModificar":
//                if (dao.modificar(dto) == true) {
//                    //aviso ok
//                } else {
//                    //aviso error
//                }
//            break;
//              case "esEliminar":
//                if (dao.eliminar(dto) == true) {
//                    //aviso ok
//                } else {
//                    //aviso error
//                }
//            break; 
//        }

        request.getRequestDispatcher("/Perfil.jsp").forward(request, response);
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
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

}

