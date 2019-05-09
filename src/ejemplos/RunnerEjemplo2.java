
package ejemplos;

import java.util.*;
import java.util.stream.Collectors;

public class RunnerEjemplo2{

	public static void main(String[] args){
		
		Random rnd = new Random();
		
		List<Integer> numeros = new ArrayList<>();
		for(int i = 0; i < 100; i++){
			numeros.add(rnd.nextInt(101) + 1);
		}
		
		List<String> numerosPares = numeros
			.stream()
			.filter(n -> n % 2 == 0)
			.map(String::valueOf)
			.collect(Collectors.toList());
		
		List<Integer> numerosImpares = numeros
			.stream()
			.filter(n -> n % 2 != 0)
			.collect(Collectors.toList());
		
		System.out.println("Numeros: " + numeros.size());
		System.out.println("Numeros pares " + numerosPares.size());
		System.out.println("Numeros impares " + numerosImpares.size());
		
		// findFirst devuelve un tipo de dato Optional por lo que puede no devolver ningún valor.
		numerosImpares.stream().findFirst().ifPresent((valor) -> System.out.println("El primer número impar es: " + valor));
		
	}

}
