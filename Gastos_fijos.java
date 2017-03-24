import java.io.*;
public class Gastos_fijos{

	private int renta;
	private int gas;
	private int luz;
	private int agua;
	private int colegiatura;


	public int getRenta(int cantidad){
		this.renta=0;
		this.renta=cantidad;
		return this.renta;
	}
	
	public int getGas(int cantidad){
		this.gas = 0;
		this.gas = cantidad;
		return this.gas;

	}
	public int getLuz(int cantidad){
		this.luz = 0;
		this.luz = cantidad;
		return this.luz;

	}
	public int getAgua(int cantidad){
		this.agua = 0;
		this.agua = cantidad;
		return this.agua;

	}
	public int getColegiatura(int cantidad){
		this.colegiatura = 0;
		this.colegiatura = cantidad;
		return this.colegiatura;

	}
}