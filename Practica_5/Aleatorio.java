import java.io.*;//Estamos cargando todas las clases relacionadas a los flujos,(input-output)
import java.util.Random; //Vamos a importar la clase de random para extraer números aleatorios
public class Aleatorio{ 


public static void main(String[] args)  throws IOException {

   System.out.println("Introduce un número de elementos:");//Solicitamos la cantidad de números aleatorios que usaremos.
   String input="";//Declaramos nuestra variable de tipo string llamada input
   InputStreamReader isr = new InputStreamReader(System.in);//Las líneas 10 y 11 nos van a permitir leer  y guardar en 
   BufferedReader flujoE = new BufferedReader(isr);//un espacio en memoria lo que ingresará el usuario.
   input=flujoE.readLine();//la función readline es para leer lo almacenado y asignarlo a input de manera temporal.
   int numValores=Integer.parseInt(input);// Estamos convirtiendo el valor de input a int 
                                         //y almacenandolo en la variable numValores.

   if (numValores<=0){
        System.out.println("El número debe ser mayor");//1ra validación, si el número no debe ser menor o igual que 0.
        return;
    }
    
    int arr1[]= new int [numValores];//Estamos declarando y creando nuestro arreglo de tipo entero, tamaño numValores.
    Random rand = new Random();// estamos creando un objeto de tipo random.
    int randomNum = 0;//declaramos una variable de tipo int randomNum inicializada en 0.
    
    for(int i=0;i<numValores;i++){//Con este for llenamos nuestro array con números aleatorios entre 1 y 300.
        randomNum = rand.nextInt(300)+1;
        arr1[i]=randomNum; 
    }
//Solicitamos al usuario el dígito con el que deben finalizar los valores que quiero ver en pantalla
    System.out.println("Introduce el dígito en el que deban finalizar:");
    input=flujoE.readLine();
    char digitoDeseado = input.charAt(0);//charAt va ir a buscar los valores con la terminación solicitada y la 
    //asignará a la v: digitoDeseado de tipo char.
    
    
    if ( ! Character.isDigit(digitoDeseado)  ){//1ra val. Utilizo la función isDigit para validar que lo que ingresó el 
        //usuario efectivamente sea un dígito, de lo contrario se lo hará saber.
        System.out.println("Opción inválida, no es un dígito");
        return;
    }
    
    if ( input.length()!=1  ){//2da val. Validamos que unicamente sea ingresado un dígito
        System.out.println("Opción inválida, no es un dígito");
        return;
    }
    
    
    System.out.println("Se van a buscar aquellos números que terminen en "+digitoDeseado);
    int digitos=0; //Variable dígitos de tipo int
    char ultimoDigito=0;//Declaramos nuestra variable de tipo char y la inicializamos en 0;
    int sizeNuevoArreglo=0;//Aquí guardaremos el tamaño de nuestro segundo array.
    // con este ciclo vamos a clasificar nuestros valores de acuerdo al número de dígitos que tiene cada uno
    for(int i=0;i<numValores;i++){
        if (arr1[i]<10){
            digitos=1;
        }
        if(arr1[i]>=10 && arr1[i]<100){
            digitos=2;
        }
        if(arr1[i]>=100){
            digitos=3;
        }

        ultimoDigito=String.valueOf(arr1[i]).charAt(digitos-1);//
       // charAt irá a buscar a la variable dígitos -1 para conocer el último dígito de cada valor

        if (ultimoDigito==digitoDeseado){//preguntará si el último dígito es igual a digitoDeseado y esto determinará 
            // el tamaño de el segundo array.
            sizeNuevoArreglo++;
        }
            //System.out.println("Termina en "+digitoDeseado);     
    }
    
    int nuevoArreglo[]=new int[sizeNuevoArreglo]; //Declaramos nuestro segundo arreglo.
    int j=0;
    for(int i=0;i<numValores;i++){
        if (arr1[i]<10){
            digitos=1;
        }
        if(arr1[i]>=10 && arr1[i]<100){
            digitos=2;
        }
        if(arr1[i]>=100){
            digitos=3;
        }

        ultimoDigito=String.valueOf(arr1[i]).charAt(digitos-1);

        if (ultimoDigito==digitoDeseado){//Validamos los valores que tenemos de acuerdo al número de dígitos
            //y validamos si terminan con el dígito que pide el usuario
            nuevoArreglo[j]=arr1[i];
            j++;
        }  
    }
    
    System.out.println("Los números aleatorios terminados en "+digitoDeseado+" son:");
    //Y entonces imprimimos los valores solicitados.
    
    for(int i=0; i<sizeNuevoArreglo;i++){
        System.out.println(nuevoArreglo[i]);
    }
    
    
}
}
