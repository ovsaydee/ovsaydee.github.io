public class PracticaDos  {

/*estamos declarando variables globales, se declaran antes de nuestro main,
como son variables de tipo global el compilador las inicializa.
*/
static byte _var_byte;
static short _var_short; 
static int _var_int; 
static long _var_long;
static double _var_double; 
static char _var_char; 
static boolean _var_boolean;
static String _var_string;

	public static void main(String[] args) {


		System.out.println("byte var:"+ _var_byte);
		System.out.println("short var:"+ _var_short);
		System.out.println("int var:"+ _var_int);
		System.out.println("long var:"+ _var_long+"L");
		System.out.println("double var:"+ _var_double+"d");
		System.out.println("char var:"+ _var_char);
		System.out.println("boolean var:"+ _var_boolean);
		System.out.println("string var:"+ _var_string);




	}
}
