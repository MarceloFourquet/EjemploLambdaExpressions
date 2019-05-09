
package ejemplos;

@FunctionalInterface
interface Comportamiento{
	int calcular(int a, int b);
}

class App{
	public void run(int a, int b, Comportamiento c){
		int value = c.calcular(a, b);
		System.out.println("El valor retornado es: " + value);
	}
}

public class RunnerEjemplo1{

	public static void main(String[] args){
		
		App myApp = new App();
		
		Comportamiento c = new Comportamiento(){
			@Override
			public int calcular(int a, int b){
				return (a + b) * 2;
			}
		};
		myApp.run(12, 14, c);
		
		myApp.run(12, 14, new Comportamiento(){
			@Override
			public int calcular(int a, int b){
				return (a + b) * 2;
			}
		});
		
		myApp.run(12, 14, (int a, int b) -> {
				return (a + b) * 2;
			}
		);
		
		myApp.run(12, 14, (a, b) -> {
				return (a + b) * 2;
			}
		);

		myApp.run(12, 14, (a, b) -> (a + b) * 2);			
		
	}

}
