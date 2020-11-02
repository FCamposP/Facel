/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.EstudianteDaoImp;
import entidades.Conexion;
import entidades.Estudiante;
import java.sql.SQLException;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author fabry
 */
@Named(value = "pruebaJSFManagedBean")
@RequestScoped
public class PruebaJSFManagedBean {

    /**
     * Creates a new instance of PruebaJSFManagedBean
     */
            private String texto1="";
    private String texto2="";
   private Estudiante estu;

    public Estudiante getEstu() {
        return estu;
    }

    public void setEstu(Estudiante estu) {
        this.estu = estu;
    }
    public PruebaJSFManagedBean() {
    }
    
    public String getTexto1() {
        return texto1;
    }

    public void setTexto1(String texto1) {
        this.texto1 = texto1;
    }

    public String getTexto2() {
        return texto2;
    }

    public void setTexto2(String texto2) {
        this.texto2 = texto2;
        
    }
    
    
    public String redireccionar(){
         this.texto2="Fabricio";
        return "result";
                
    }
    
    public void mostrar(){
        this.texto2=this.texto1;
        this.texto2="fa";
    }
    
    public String guardar(){
        
        double  esperado=24;
     double ress=   Mult(4,6);
        Estudiante prueba= new Estudiante(5l,"dddddd");
                try{
                    estu= new Estudiante(2l,this.texto1);
                    EstudianteDaoImp daoEst= new EstudianteDaoImp();
                    daoEst.insertar(estu);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return "result";
    }
    
    public double Mult(double x, double y){
        
        double resultado=0;
        
        return resultado;
    }
}


