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
		int preguntar = (int) (Math.random() * pregunta.size());
		boolean encontro = false;
		for (int i = 0; i <= preguntasRealizadas.length && !encontro; i++){
			if (preguntar == preguntasRealizadas[i]){
				encontro = true;
			}
		}
		return pregunta.get(preguntar);
	}
	
}