package app;

import domain.Person;


public class App {

	/* tudo neste metodo é obrigatório, com exepção do nome do argumento. */
	public static void main(String[] args) {
		
		System.out.println("Hello world.");
		
		// se o args chegasse a null dava NullPointerException
		// neste caso o Java manda-nos sempre isso a vazio
		for ( String arg : args) {
			if ( arg.equals( args[ args.length-1 ] ) ){
				System.out.print(arg);
			} else {
				System.out.print(arg + ", ");
			}
		}
		
		System.out.println();
		for (int i = 0; i < args.length; i++) {
			// isto é possivel por causa do overloading
			System.out.print( args[i] + ( i ==  args.length-1 ? "" : 1 ) );
			
			// isto já não é possivel
			// String aux =  ( i ==  args.length-1 ? "" : 1 );
			
			// isto é possivel
			System.out.println( args[i] + ( i ==  args.length-1 ? new Person() : 1 ) );
			
			if ( i ==  args.length-1 ){
				System.out.print(args[i]);
			} else {
				System.out.print(args[i] + ", ");
			}
		}
		
	}
	
}
/*
 * funciona apenas para default e public
 */
class App2{
	
}