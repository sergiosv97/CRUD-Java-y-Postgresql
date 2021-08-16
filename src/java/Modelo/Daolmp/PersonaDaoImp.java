
package Modelo.Daolmp;

import Genericos.ConexionDB;
import Modelo.Dao.PersonaDao;
import Modelo.Dto.PersonaDto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDaoImp implements PersonaDao{
    
    private String query, msj;
    private PreparedStatement ps;
    private ResultSet rs;
    private ConexionDB conexion;

    public PersonaDaoImp() {
        conexion = new ConexionDB();
    }
    
    

    @Override
    public Boolean agregar(PersonaDto dto) {
        try {
            conexion.Transaccion(ConexionDB.TR.INICIAR);
            query= "INSERT INTO public.personas(nro_documento, nombres, apellidos)VALUES (?, ?, ?);";
            ps = conexion.obtenerConexion().prepareStatement(query);
            ps.setInt(1, dto.getNroDocumento());
            ps.setString(2, dto.getNombres());
            ps.setString(3, dto.getApellidos());
            if (ps.executeUpdate() > 0) {
                conexion.Transaccion(ConexionDB.TR.CONFIRMAR);
                return true;
                
            } else {
                conexion.Transaccion(ConexionDB.TR.CANCELAR);
                return false;
            }             
        } catch (SQLException ex) {
            msj = "Error durante la inserSION " + ex.getMessage();
            conexion.Transaccion(ConexionDB.TR.CANCELAR);
            Logger.getLogger(PersonaDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        finally{
            conexion.cerrarConexion();
        }
    }


    @Override
    public Boolean modificar(PersonaDto dto) {
             try {
            conexion.Transaccion(ConexionDB.TR.INICIAR);
            query= "UPDATE public.personas SET  nro_documento=?, nombres=?, apellidos=? WHERE id=?;";
            ps = conexion.obtenerConexion().prepareStatement(query);
            ps.setInt(1, dto.getNroDocumento());
            ps.setString(2, dto.getNombres());
            ps.setString(3, dto.getApellidos());
            ps.setInt(4, dto.getId());
            if (ps.executeUpdate() > 0) {
                conexion.Transaccion(ConexionDB.TR.CONFIRMAR);
                return true;
                
            } else {
                conexion.Transaccion(ConexionDB.TR.CANCELAR);
                return false;
            }             
        } catch (SQLException ex) {
            msj = "Error durante la modificación " + ex.getMessage();
            conexion.Transaccion(ConexionDB.TR.CANCELAR);
            Logger.getLogger(PersonaDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        finally{
            conexion.cerrarConexion();
        }
    }

    @Override
    public Boolean eliminar(PersonaDto dto) {
             try {
            conexion.Transaccion(ConexionDB.TR.INICIAR);
            query= "DELETE FROM public.personas WHERE id=?;";
            ps = conexion.obtenerConexion().prepareStatement(query);
            ps.setInt(1, dto.getId());
            if (ps.executeUpdate() > 0) {
                conexion.Transaccion(ConexionDB.TR.CONFIRMAR);
                return true;
                
            } else {
                conexion.Transaccion(ConexionDB.TR.CANCELAR);
                return false;
            }             
        } catch (SQLException ex) {
            msj = "Error durante la eliminación " + ex.getMessage();
            conexion.Transaccion(ConexionDB.TR.CANCELAR);
            Logger.getLogger(PersonaDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        finally{
            conexion.cerrarConexion();
        }
    }

    @Override
    public List<PersonaDto> cosultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonaDto cosultarSegunId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonaDto cosultarSegunCadena(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMSj() {
        return msj;
    }
    
}
