/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author María Fernanda Lopez 17160, David Uriel Soto 17551
 * @version 23/09/2017
 */
public class Medico {
    //Atributos 
    private String nombre;
    private String nit;
    private String dpi;
    private double sueldo;
    private boolean especialista;
    private int guardias;
    private String colegiado;
    
    /**
     * Constructor for objects of class Medico
     * @param nombre
     * @param nit
     * @param dpi
     * @param sueldo
     * @param especialista
     * @param guardias
     * @param colegiado
     */
    public Medico(String nombre, String nit, String dpi, double sueldo, boolean especialista, int guardias, String colegiado){
        this.nombre=nombre;
        this.nit=nit;
        this.dpi=dpi;
        this.sueldo=sueldo;
        this.especialista=especialista;
        this.guardias=guardias;
        this.colegiado=colegiado;
    }
    
    public boolean getEspecialista(){
        return especialista;
    }
    
    /**
     * Metodo para calcular el salario extra de un medico y actualizar su sueldo
     * @param guardias 
     */
    public void setSueldo(int guardias){
        double salextra=0;
        if(guardias>2){
            int extras = guardias-2;
            salextra = extras * 900;
        }
        sueldo = sueldo + salextra;
    }
    
    public int getGuardias(){
        return guardias;
    }
    
    
    
}
