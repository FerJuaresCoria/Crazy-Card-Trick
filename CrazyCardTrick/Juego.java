import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Juego {
	
	private Preguntas preguntas;
	private List<Carta> mazo;
	
	public Juego(){
		preguntas = new Preguntas();
		mazo = new ArrayList<Carta>();
		generarMazo();
		mezclarMazo();
	}
	
	public void generarMazo(){
		int numeroDeCartas = 6;
		int numeroCarta;
		Palo paloCarta;
		for (int i = 0; i < (numeroDeCartas/2); i++){
			numeroCarta = (int) (Math.random() * 12) + 1;
			paloCarta = generarPaloAlAzar();
			this.mazo.add(new Carta(numeroCarta, paloCarta));
			this.mazo.add(new Carta(numeroCarta, cambiarPaloEscencial(paloCarta)));
		}
	}
	
	private Palo generarPaloAlAzar(){
		Palo palo = null;
		switch((int) (Math.random() * 4)){
			case 0:
				palo = Palo.CORAZON;
				break;
			case 1:
				palo = Palo.DIAMANTE;
				break;
			case 2:
				palo= Palo.PICA;
				break;
			case 3:
				palo= Palo.TREBOL;
				break;
		}
		
		return palo;
	}
	
	private Palo cambiarPaloEnBaseAlColor(Palo palo){
		switch(palo){
			case CORAZON:
				palo = Palo.DIAMANTE;
				break;
			case DIAMANTE:
				palo = Palo.CORAZON;
				break;
			case PICA:
				palo= Palo.TREBOL;
				break;
			case TREBOL:
				palo= Palo.DIAMANTE;
				break;
		}
		return palo;
	}
	
	private Palo cambiarPaloEscencial(Palo palo){
		switch(palo){
		case CORAZON:
			palo = Palo.PICA;
			break;
		case DIAMANTE:
			palo = Palo.TREBOL;
			break;
		case PICA:
			palo= Palo.DIAMANTE;
			break;
		case TREBOL:
			palo= Palo.CORAZON;
			break;
	}
	return palo;
	}
	
	private void mezclarMazo(){
		Random rndm = new Random();
        Collections.shuffle(this.mazo, rndm);
	}
}
