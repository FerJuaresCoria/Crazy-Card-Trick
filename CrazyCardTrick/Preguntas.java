import java.util.ArrayList;
import java.util.List;

public class Preguntas {
	
	private List<String> pregunta;
	private int[] preguntasRealizadas;
	private int cantidadPreguntasRealizadas;
	
	public Preguntas(){
		AdministradorPreguntas.agregarPreguntas(pregunta);
		pregunta = new ArrayList<String>();
		cantidadPreguntasRealizadas = 0;
	}
	
	public String preguntar(){
		int preguntar;
		boolean encontro = false;
		
		do {
			preguntar = (int) (Math.random() * pregunta.size());
			encontro = false;
			for (int i = 0; i <= preguntasRealizadas.length && !encontro; i++){
				if (preguntar == preguntasRealizadas[i]){
					encontro = true;
				}
			}
			this.preguntasRealizadas[cantidadPreguntasRealizadas] = preguntar;
			this.cantidadPreguntasRealizadas++;
		} while (!encontro);
		
		return pregunta.get(preguntar);
	}
	
	public String obtenerPregunta(int numero){
		numero--;
		return this.pregunta.get(numero);
	}
}
