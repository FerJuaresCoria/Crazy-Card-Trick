
public class Main {

	static Juego juego = new Juego();
	
	public static void main (String[] args){
		System.out.println("Crazy Card Game");
		separador();
		//saltoDeLinea();
		
		juego.hacerPregunta();
		juego.hacerPregunta();
		
		separador();
		
		juego.mostrarMazo();
		
		separador();
		
		juego.hacerPregunta();
		juego.generarMazoTrucado();
		
		separador();
		
		juego.mostrarMazo();
	}

	public static void separador(){
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
	public static void saltoDeLinea(){
		System.out.println("\n");
	}
}
