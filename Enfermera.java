/*
 * Modela las caracteristicas de una enfermera de una clinica pequeña
 */

/**
 * @author María Fernanda Lopez 17160, David Uriel Soto 17551
 * @version 23/09/2017
 */
public class Enfermera {
    //Atributos
    private String nombre;
    private String nit;
    private String dpi;
    private int dia;
    private int guardias;
    private double salario;
    private int experiencia;
    private boolean intensivista;
    
    /**
     * Constructor for objects of class Enfermera
     * @param nombre
     * @param nit
     * @param dpi
     * @param dia
     * @param guardias
     * @param salario
     * @param experiencia
     * @param intensivista
     */
    public Enfermera(String nombre, String nit, String dpi, String dia, int guardias, double salario, int experiencia, boolean intensivista){
        this.nombre=nombre;
        this.nit=nit;
        this.dpi=dpi;
        this.dia=dia;
        this.guardias=guardias;
        this.salario=salario;
        this.experiencia=experiencia;
        this.intensivista=intensivista;
    }
    
    public boolean getIntensivista(){
        return intensivista;
    }
    
    public void setGuardias(int guardias){
        this.guardias=guardias;
    }
    
    /**
     * Calcula el dinero a recibir por guardias extras que haya realizado la enfermera
     * @param guardias
     * @return salextra
     */
    public double calcularSalextra(int guardias){
        double salextra=0;
        if(guardias>4){
            int extras = guardias-4;
            salextra = 400*extras;
        }
        return salextra;
    }
    
    public void setSalario(double salextra){
        this.salario=salario+salextra;
    }
    
    
    
    
    
}
