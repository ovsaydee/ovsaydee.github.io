import java.util.Scanner;
import java.io.*;

public class EjercicioUno {

    public static void main(String args[]){
        //creamos el objeto Scanner que nos va a permitir utilizar los metodos de captura
        Scanner entrada = new Scanner(System.in);
        //declaramos las variables en las que vamos a meter los valores
        String frase1;
        String frase2;

        //Mandamos por pantalla los mensajes correspondientes al usuario
        System.out.println("Introduce frase 1: ");
        //utilizamos el objeto entrada de tipo Scanner que previamente creamos e invocamos al metodo next()
        //esto nos permitira capturar una cadena. Luego asignamos esa cadena a la variable frase 1
        frase1=entrada.next();

        System.out.println("Introduce frase 2: ");
        //utilizamos el objeto entrada de tipo Scanner que previamente creamos e invocamos al metodo next()
        //esto nos permitira capturar una cadena. Luego asignamos esa cadena a la variable frase 2
        frase2=entrada.next();

        System.out.println(frase1+" "+frase2);

        int[] arrInt = new int[256];

        for (int i=0; i<256; i++){
            arrInt[i]=0;
        }

        for (int i=0; i<frase1.length(); i++){
            if (Character.isLetter(frase1.charAt(i)))
                 arrInt[frase1.charAt(i)]++;
        }

        for (int i=0; i<frase2.length(); i++){
            if (Character.isLetter(frase2.charAt(i)))
                 arrInt[frase2.charAt(i)]--;
        }
        int i;
        for (i=0; i<256; i++){   
            if(arrInt[i]!=0){
                System.out.println(" Las frases no son anagramas entre si");
                i=257;
            }

        }
        if(i==256){
                System.out.println("Las frases son anagramas entre si");
            }






    }
}