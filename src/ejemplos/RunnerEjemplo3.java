
package ejemplos;

import java.util.function.*;

public class RunnerEjemplo3{

	public static void main(String[] args){
		
		FuntionApp fun = new FuntionApp();
		
		System.out.println("El valor devuelto por function es: " + fun.function.apply(5));
		System.out.println("El valor devuelto por biFunction es: " + fun.biFunction.apply(2, 5));
		fun.consumer.accept("Cinco");
		System.out.println("Dos es un número par: " + fun.predicate.test(2));
		
	}

}

class FuntionApp{

	// Funtion recibe un Integer y devuelve un String. Su método principal es apply
	Function<Integer, String> function = (valor) -> String.valueOf(valor);
	
	// BiFunction recibe dos Integer y devuelve un String. Su método principal es apply
	BiFunction<Integer, Integer, String> biFunction = (valor1, valor2) -> String.valueOf(valor1 + valor2);
	
	// Consumer recibe un String y no devuelve nada. Su método principal es accept
	Consumer<String> consumer = (mensaje) -> System.out.println("El valor devuelto por consumer es: " + mensaje);
	
	// Predicate recibe un Integer y devuelve un boolean. Su métod principal es test
	Predicate<Integer> predicate = (v) -> (v % 2 == 0);

}
