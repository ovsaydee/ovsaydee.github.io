import java.io.*;
public class Calculadora {
	
double dato1=0;
double dato2=0;
double resultado;
double a=0;
double b=0;






		InputStreamReader isr = new InputStreamReader(System.in);
    	BufferedReader flujoE = new BufferedReader(isr);
    	String input="";


	public void suma (){
			try{
			System.out.println("Dato 1:");
    	  	input = flujoE.readLine(); 
    		dato1 = Double.parseDouble(input);

    		System.out.println("Dato 2:");
    		input = flujoE.readLine(); 
    		dato2 = Double.parseDouble(input);
			}catch(IOException ex){}
				this.resultado=dato1+dato2;
		System.out.println("Resultado:"+resultado);
	}

	public void resta(){
			try{
			System.out.println("Dato 1:");
    	  	input = flujoE.readLine(); 
    		dato1 = Double.parseDouble(input);

    		System.out.println("Dato 2:");
    		input = flujoE.readLine(); 
    		dato2 = Double.parseDouble(input);
			}catch(IOException ex){}
			this.resultado=dato1-dato2;

		System.out.println("Resultado:"+resultado);	
}
	
public void division(){
			try{
			System.out.println("Dato 1");
    	  	input = flujoE.readLine(); 
    		dato1 = Double.parseDouble(input);

    		System.out.println("Dato 2");
    		input = flujoE.readLine(); 
    		dato2 = Double.parseDouble(input);
			}catch(IOException ex){}


				if (dato2!=0){
				this.resultado=dato1/dato2;

		System.out.println("Resultado:"+resultado);
				}
				else{
					System.out.println("No es posible realizar la operación");
					return;
				}

}
	
public void multiplicacion(){
			try{
			System.out.println("Dato 1");
    	  	input = flujoE.readLine(); 
    		dato1 = Double.parseDouble(input);

    		System.out.println("Dato 2");
    		input = flujoE.readLine(); 
    		dato2 = Double.parseDouble(input);
			}catch(IOException ex){}

			this.resultado=dato1*dato2;
		System.out.println("Resultado:"+resultado);	


}


public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
		int a=0;
		String input;

		InputStreamReader isr = new InputStreamReader(System.in);
    	BufferedReader flujoE = new BufferedReader(isr);
    		do{
    	   System.out.println("\n===¿Que operación deseas realizar?===");
    	   System.out.println("\n1.-Sumar\n2.-Restar\n3.-Multiplicar\n4.-Dividir\n5.-Salir");

    	   		try{
					input = flujoE.readLine();
					a = Integer.parseInt(input);
					}catch(IOException ex){}


    	   	
    			 switch(a){
						case 1:
								System.out.println("Realiza una suma:\n");
								calculadora.suma();

								break;


						case 2:
								System.out.println("Realiza una resta");
								calculadora.resta();
		

								break;


						case 3:
								System.out.println("Realiza una multiplicacion");
								calculadora.multiplicacion();
		
								break;

						case 4:
								System.out.println("Realiza una división");
								calculadora.division();
		
								break;

						case 5:
								System.out.println("¡Hasta Luego!");

								break;
							}

				}while(a != 5);
	}		
}
