import java.io.*;
public class Alumnos{

	public static void main(String[] args) {
	
        int numAlumnos=10; //El tamaño de nuestro arreglo es 10 (alumnos).
        InputStreamReader isr = new InputStreamReader(System.in); //Las líneas 19 y 20 nos van a permitir leer  y guardar en 
        BufferedReader flujoE = new BufferedReader(isr); 		  //un espacio en memoria lo que ingresará el usuario.
        String input=""; // ¿Para que uso input?
	
	
        String arr1[]=new String [numAlumnos];//Estamos declarando y creando nuestro segundo arreglo de tipo string[numAlumnos] 
        for(int j=0;j<numAlumnos;j++){
            System.out.println("Introduce el nombre del alumno "+(j+1)+":");
            try{
                input=flujoE.readLine();
            }catch(IOException e){
                e.printStackTrace();
            }
            arr1[j]=new String(input);
        }
	
	
	
        int arr2[]= new int [numAlumnos];//Estamos declarando y creando nuestro arreglo.
        for(int i=0;i<numAlumnos;i++){
            System.out.println("Introduce la calificacíon de "+arr1[i]+":");//Pedimos al usuario las calificaciones de los alumnos.1x1

			try{
   				input=flujoE.readLine(); //la función readline es para leer lo almacenado y asignarlo a input de manera temporal.
			}catch(IOException e){
				e.printStackTrace();
			}
            arr2[i]=Integer.parseInt(input);	
        }


		
        String arr3[]= new String [numAlumnos];//Estamos declarando y creando nuestro arreglo.
        String evaluacion="";
        for(int i=0;i<numAlumnos;i++){
        
            if (arr2[i]<4.99)
                evaluacion="suspenso";
        
        
            if (arr2[i]>=5&&arr2[i]<=6.99)
                evaluacion="bien";
            
            if (arr2[i]>=5&&arr2[i]<=6.99)
                evaluacion="bien";
        
        
            if (arr2[i]>=7&&arr2[i]<=8.99)
                evaluacion="notable";
        
            if (arr2[i]>=9&&arr2[i]<=10)
                evaluacion="sobresaliente";
        
        
            arr3[i]=new String(evaluacion);	
        }
    
        for(int i=0;i<numAlumnos;i++){
            System.out.println(arr1[i]+", Calif: "+arr2[i]+", "+arr3[i]);
        }

    }



}
