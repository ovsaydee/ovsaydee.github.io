import java.io.*;
public class Ingresos_mensuales {

	float sueldo;
	float honorarios;
	float horas_extras;
	int num_horas;
	float comisiones; 

	  public void sueldoMens(float cantidad){ 
	  	this.sueldo=0;
	  	this.sueldo = cantidad;
    }

    public void getHonorarios(float cantidad)	{
    	this.honorarios=0;
    	this.honorarios = cantidad;

    }
    public void horasExtras( int horas, float cantidad){
    	this.horas_extras = cantidad;
    	this.num_horas = horas;

    	
    }
    public void getComisiones(float cantidad){
    	this.comisiones=0;
    	this.comisiones = cantidad;
    }
}