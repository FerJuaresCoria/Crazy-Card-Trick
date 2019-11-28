
public class Carta {
	private int numero;
	private Palo palo;
	
	public Carta(int numero, Palo palo){
		this.numero = numero;
		this.palo = palo;
	}
	
	public void setPalo(Palo palo){
		this.palo = palo;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public Palo getPalo(){
		return this.palo;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
}