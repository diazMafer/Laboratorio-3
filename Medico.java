/*
 * Modela las caracteristicas de un medico de una clinica pequeña
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
    private int dia;
    private int guardias;
    private double salario;
    private int colegiado;
    private boolean especialista;

    //Constructor
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
    public Medico(String nombre, String nit, String dpi, int dia, int guardias, double salario, Strings colegiado, boolean especialista){
    	this.nombre = nombre;
    	this.nit = nit;
    	this.dpi = dpi;
    	this.dia = dia;
    	this.guardias = guardias;
    	this.salario = salario;
    	this.colegiado = colegiado;
    	this.especialista = especialista;
    }

    /**
    *Regresa el nombre del medico
    * @return Nombre del medico
	*/
	public String getNombre(){
		return nombre;
	}

	/**
    *Regresa el nit del medico
    * @return Nit del medico
	*/
	public String getNit(){
		return nit;
	}

	/**
    *Regresa el dpi del medico
    * @return Dpi del medico
	*/
	public String getDpi(){
		return dpi;
	}

	/**
    *Regresa el salario del medico
    * @return Salario del medico
	*/
	public double getSalario(){
		return salario;
	}

	/**
    *Regresa el numero de colegiado del medico
    * @return Colegiado del medico
	*/
	public String getColegiado(){
		return colegiado;
	}

	/**
    *Regresa si el medico es especialista o no
    * @return Si el medico es especialista o no
	*/
	public boolean getEspecialista(){
		return especialista;
	}

	/**
    *Ingresa las guardias que ha hecho un medico
    * @param guardias
	*/
    public void setGuardias(int guardias){
        this.guardias=guardias;
    }


    /**
     * Calcula el dinero a recibir por guardias extras que haya realizado la enfermera
     * @param guardias
     * @return salextra
     */
    public double setSalextra(int guardias){
        double salextra=0;
        if(guardias>2){
            int extras = guardias-2;
            salextra = 900*extras;
        }
        return salextra;
    }

	/**
    *Ingresa el salario de un medico
    * @param salextra
	*/    
    public void setSalario(double salextra){
        this.salario=salario+salextra;
    }    
}