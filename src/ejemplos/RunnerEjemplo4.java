
package ejemplos;

@FunctionalInterface
interface IMethod{

	void executeMethod();

}

class MethodApp{

	static void staticMethod(){
		System.out.println("Este es el método estático");
	}

	void instanceMethod(){
		System.out.println("Este es el método de instancia");
	}

}

public class RunnerEjemplo4{

	public static void main(String[] args){
		
		// Referencia de métodos - Método estático.
		IMethod sm = MethodApp::staticMethod;
		sm.executeMethod();
		
		// Referencia de métodos - Método de instancia.
		MethodApp methodApp = new MethodApp();
		IMethod im = methodApp::instanceMethod;
		im.executeMethod();
	}

}
