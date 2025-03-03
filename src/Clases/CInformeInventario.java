/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Objetos.OArticulos;
import Objetos.OCatArticulos;
import Objetos.OError;
import Objetos.OInformeInventario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodka
 */
public class CInformeInventario extends OInformeInventario {

    private final String TagCodigoClase = "CIVentaPack - %s";
    private OError Error = new OError();


    public CInformeInventario(OArticulos Articulo, OCatArticulos categoria) {
        super(Articulo, categoria);
    }

    public CInformeInventario() {
        super();
    }

    public OError getError() {
        return Error;
    }
    
    
    
    public List<OCatArticulos> ListarActivos(String Tipo) {
        
     

        
        String sql = "";
        PreparedStatement Preparando = null;
        ResultSet Resultado = null;
        List<OCatArticulos> Listado = new ArrayList();
        CMysqlHelp Sql = new CMysqlHelp();
        Error = Sql.Conectar();
        if (Error.isConfirma()) {
            try {
                
                switch (Tipo) {
                    case "Activos":
                        sql = "SELECT * FROM Categoria WHERE CAT_ESTADO = true";
                        break;
                    default:
                        sql = "SELECT * FROM Categoria";
                        break;
                }
                Preparando = Sql.getCon().prepareStatement(sql);
                Resultado = Preparando.executeQuery();

                while (Resultado.next()) {
                    Listado.add(new OCatArticulos(Resultado.getInt(1), Resultado.getString(2), Resultado.getBoolean(3)));
                }
                Error = new OError(String.format(TagCodigoClase, 10), "Operación Realizada Corectamente", null, true);

                Resultado.close();
                Preparando.close();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex);
                Error = new OError(String.format(TagCodigoClase, 11), String.format("<html>%s (Codigo %s)</html>", ex, String.format(TagCodigoClase, 11)), null, false);
            } finally {
                Sql.Desconectar();
            }
        }
        return Listado;
    }
    
    /* public List<OInformeInventario> Listar(){
    PreparedStatement Preparando = null;
    ResultSet Resultado = null;
    List<OInformeInventario> Listado = new ArrayList();
    CMysqlHelp Sql = new CMysqlHelp();
    OError Error = Sql.Conectar();
    if(Error.isConfirma()){
    try {
    Preparando = Sql.getCon().prepareStatement("SELECT * FROM Articulo A inner join Categoria C on A.CAT_ID_CATEGORIA = C.CAT_ID_CATEGORIA");
    Resultado = Preparando.executeQuery();
    
    while(Resultado.next()){
    
    OCatArticulos cat = new OCatArticulos(Resultado.getInt(7),Resultado.getString(8),Resultado.getBoolean(9));
    //Listado.add(new OArticulos(Resultado.getInt(1), Resultado.getString(2), Resultado.getInt(3),Resultado.getString(4), Resultado.getBoolean(5), cat));
    OArticulos art = new OArticulos(Resultado.getInt(1), Resultado.getString(2), Resultado.getInt(3),Resultado.getString(4), Resultado.getBoolean(5), cat);
    Listado.add(new OInformeInventario (art,cat));
    }
    Error = new OError(String.format(TagCodigoClase, 10), "Consulta Realizada Corectamente", null, true);
    
    Resultado.close();
    Preparando.close();
    } catch (SQLException ex) {
    System.out.println("Error: " + ex);
    Error = new OError(String.format(TagCodigoClase, 11), String.format("<html>%s (Codigo %s)</html>", ex, String.format(TagCodigoClase, 11)), null, false);
    }
    finally{
    Sql.Desconectar();
    }
    }
    return Listado;
    }*/
    
     public List<OArticulos> Listar(){
        PreparedStatement Preparando = null;
        ResultSet Resultado = null;
        List<OArticulos> Listado = new ArrayList();
        CMysqlHelp Sql = new CMysqlHelp();
        OError Error = Sql.Conectar();
        if(Error.isConfirma()){
            try {
                Preparando = Sql.getCon().prepareStatement("SELECT * FROM Articulo A inner join Categoria C on A.CAT_ID_CATEGORIA = C.CAT_ID_CATEGORIA");
                Resultado = Preparando.executeQuery();
                
                while(Resultado.next()){
                    OCatArticulos cat = new OCatArticulos(Resultado.getInt(7),Resultado.getString(8),Resultado.getBoolean(9));
                    Listado.add(new OArticulos(Resultado.getInt(1), Resultado.getString(2), Resultado.getInt(3),Resultado.getString(4), Resultado.getBoolean(5), cat));
                }
                Error = new OError(String.format(TagCodigoClase, 10), "Consulta Realizada Corectamente", null, true);
                
                Resultado.close();
                Preparando.close();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex);
                Error = new OError(String.format(TagCodigoClase, 11), String.format("<html>%s (Codigo %s)</html>", ex, String.format(TagCodigoClase, 11)), null, false);
            }
            finally{
                Sql.Desconectar();
            }
        }
        return Listado;
    }

}
