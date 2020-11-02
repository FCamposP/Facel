/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import entidades.Estudiante;
import interfaces.DaoEstudiante;

/**
 *
 * @author fabry
 */
public class EstudianteDaoImp extends Conexion implements DaoEstudiante{

   
    final String Insert= "Insert into estudiante (nombre) values (?)";

    public EstudianteDaoImp() {
      
    }

    @Override
    public void insertar(Estudiante a) throws Exception {
try{
    this.conectar();
  PreparedStatement st=  this.conexion.prepareStatement(Insert);
    st.setString(1, a.getNombre());
    st.executeUpdate();
}   catch(Exception e){
    throw e;
}   finally{
    this.cerrar();
    
}
    }

    @Override
    public void modificar(Estudiante a) throws Exception {
      try{
    this.conectar();
   
  PreparedStatement st=  this.conexion.prepareStatement( "UPDATE estudiante set nombre where id=?");
    st.setLong(1, a.getIdEstudiante());
    st.executeUpdate();
}   catch(Exception e){
    throw e;
}   finally{
    this.cerrar();
    
}    }

    @Override
    public void eliminar(Estudiante a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Estudiante> obtenerRegistros() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estudiante obtener(Long id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
