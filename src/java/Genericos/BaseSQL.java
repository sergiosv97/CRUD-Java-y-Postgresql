/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

import java.util.List;

/**
 *
 * @author Usuario
 */
public interface BaseSQL <T>{
    
    public Boolean agregar(T dto);
    public Boolean modificar(T dto);
    public Boolean eliminar(T dto);
    public List<T> cosultarTodos();
    public T cosultarSegunId(Integer id);
    public T cosultarSegunCadena(String cadena);
    public String getMSj();
}
