import java.io.*;
public class Alumnos{

    public static void main(String[] args) {
    
     int numAlumnos=10; //El tamaño de nuestro arreglo es 10 (alumnos).
        InputStreamReader isr = new InputStreamReader(System.in); //Las líneas 6 y 7 nos van a permitir leer  y guardar en 
        BufferedReader flujoE = new BufferedReader(isr);          //un espacio en memoria lo que ingresará el usuario.
        String input="";

 String arr1[]=new String [numAlumnos];//Estamos declarando y creando nuestro primer arreglo de tipo string[numAlumnos] 
        for(int j=0;j<numAlumnos;j++){
            System.out.println("Introduce el nombre del alumno "+(j+1)+":");
            try{
                input=flujoE.readLine();
            }catch(IOException e){
                e.printStackTrace();
            }

            arr1[j]=new String(input);


        }

   float arr2[]= new float [numAlumnos];//Estamos declarando y creando nuestro segundo arreglo de tipo float.
        for(int i=0;i<numAlumnos;i++){
            System.out.println("Introduce la calificacíon de "+arr1[i]+":");//Pedimos al usuario las calificaciones de los alumnos.1x1

            try{
                input=flujoE.readLine(); //la función readline es para leer lo almacenado y asignarlo a input de manera temporal.
            }catch(IOException e){
                e.printStackTrace();    
            }
            
            
            try{
            arr2[i]=Float.parseFloat(input);// Estamos convirtiendo el valor de input a float y almacenandolo 
            //en la posición [i] de nuestro arreglo 2
            }
            catch (NumberFormatException e){//Si no es un número imprimirá la siguiente excepción
                System.out.println("No es un número");
                return;
            }
            
            if(arr2[i]<0 || arr2[i]>10){//Validamos que las calificaciones ingresadas sean entre 0 y 10
                System.out.println("El rango de calificación debe ser entre 0 y 10");
                return;
            }
        
        }                                   

  String arr3[]= new String [numAlumnos];//Estamos declarando y creando nuestro tercer arreglo de tipo String.
        String evaluacion="";
        for(int i=0;i<numAlumnos;i++){

            //A continuación haremos las validaciones para determinar que tipo de nota tendrá cada alumno.
            if (arr2[i]>0 && arr2[i]<4.99)
                evaluacion="reprobado";       
        
            if (arr2[i]>=5&&arr2[i]<=6.99)
                evaluacion="bien";  
        
            if (arr2[i]>=7&&arr2[i]<=8.99)
                evaluacion="notable";
        
            if (arr2[i]>=9&&arr2[i]<=10)
                evaluacion="sobresaliente";
            
        
            arr3[i]=new String(evaluacion); 
            
            

        }
        //Finalmente vamos a imprimir la información contenida en nuestros 3 arrays.
    
        for(int i=0;i<numAlumnos;i++){
            System.out.println(arr1[i]+", Calif: "+arr2[i]+", "+arr3[i]);
        }

    }



}
