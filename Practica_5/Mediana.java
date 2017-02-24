import java.io.*;  //Estamos cargando todas las clases relacionadas a los flujos,(input-output)
public class Mediana  {


public static void main(String[] args)  throws IOException {

System.out.println("Introduce un número impar:");//Solicitamos un número impar al usuario y este será el tamaño del array
   String input="";//Declaramos nuestra variable de tipo string llamada input

    InputStreamReader isr = new InputStreamReader(System.in);//Las líneas 10 y 11 nos van a permitir leer  y guardar en 
    BufferedReader flujoE = new BufferedReader(isr); //un espacio en memoria lo que ingresará el usuario.

   input=flujoE.readLine(); //la función readline es para leer lo almacenado y asignarlo a input de manera temporal.
   int numValores=Integer.parseInt(input);// Estamos convirtiendo el valor de input a int 
                                         //y almacenandolo en la variable numValores.

  if (numValores<1){  //1ra validación.
        System.out.println("Introduce un número mayor");
        return;
    }

   if (numValores%2==0){//"2da validación: ¿el residuo de ese número dividido entre 2 es 0?"
        System.out.println("Tu número es par");
        return;
    }


    int arr1[]= new int [numValores]; //Estamos declarando y creando nuestro arreglo de tipo entero, tamaño numValores.
    int elemento=0;  //elemento = en esta variable vamos a almacenar lo que tiene input.
    for(int i=0;i<numValores;i++){ 
        System.out.println("Introduce un valor");//Solicitaremos loa valores al usuario de acuerdo al tamaño del array.
        input=flujoE.readLine();
        elemento=Integer.parseInt(input); //vamos a convertir a int lo ingresado a input y lo vamos a asignar a la v: elemento.
        arr1[i]=elemento; //el valor de i se estará almacenando en elemento.
    }

    int aux=0;//Declaro una variable auxiliar inicializada en 0.
    for (int i=0;i<numValores;i++){ //Vamos a ordenar los valores de arr1 utilizando el método de burbuja.
        
        for (int j=0;j<numValores-i;j++){ 
            
            if ( j+1 < numValores && arr1[j] >= arr1[j+1] ) { 
                aux=arr1[j]; 
                arr1[j]=arr1[j+1]; 
                arr1[j+1]=aux; 
                //break;
            } 

        }

    }
    
    
    
    
    System.out.println("===El arreglo ===");//Una vez ordenado nuestro arreglo lo vamos a imprimir.
    for (int i=0;i<numValores;i++){
        System.out.println(arr1[i]);
    }
    System.out.println("=================");

    
    int mediana=(numValores/2);//Vamos a dividir entre 2 la variable de numValores para conocer la mitad de nuestro arreglo 
    System.out.println("La mediana del arreglo es:"+arr1[mediana]);//Y finalmente imprimimos la mediana de arr1 es: 

}
}



