/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

import javax.servlet.http.HttpServletRequest;

public class Util {

    public static enum ACCION {

        AGREGAR, MODIFICAR, ELIMINAR, CONSULTAR, LISTAR
    }

    public static int getIntRequest(String cadena) {
        return (cadena == null ? 0 : Integer.parseInt(cadena.trim()));
    }

    public static String getStrRequest(String cadena) {
        return (cadena == null ? "" : (cadena.trim()));
    }

    public static ACCION getACCION(HttpServletRequest request) {
        ACCION accion;

        if (request.getParameter("agregar") != null) {
            accion = ACCION.AGREGAR;
        } else if (request.getParameter("modificar") != null) {
            accion = ACCION.MODIFICAR;
        } else if (request.getParameter("eliminar") != null) {
            accion = ACCION.ELIMINAR;
        } else if (request.getParameter("consultar") != null) {
            accion = ACCION.CONSULTAR;
        } else {
            accion = ACCION.LISTAR;
        }

        return accion;
    }
}
