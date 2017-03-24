import java.io.*;
public class DatosAdm {
	

	private String nombre;
	private int fecha_nacimiento;
	private String ocupacion;
	private int edad;
	private int dia;
	private int mes;
	private int anio;

public int[] obtenerFecha(int[] fecha) {
		fecha[0] = this.dia;
		fecha[1] = this.mes;
		fecha[2] = this.anio;

		return fecha;
	}
	 public String getNombre(String name){
        this.nombre = name;
        return this.nombre;

        }
        public String getOcupacion(String name){
        this.ocupacion = name;
        return this.nombre;

        }
        public int getEdad(int anios){
        	this.edad = anios;
        	return this.edad;
        }



}
