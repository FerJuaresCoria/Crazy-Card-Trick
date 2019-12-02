import java.util.ArrayList;
import java.util.List;

public class Preguntas {
	
	private List<String> pregunta;
	private List<Integer> preguntasRealizadas;
	//private int cantidadPreguntasRealizadas;
	
	public Preguntas(){
		pregunta = new ArrayList<String>();
		preguntasRealizadas = new ArrayList<Integer>();
		AdministradorPreguntas.agregarPreguntas(pregunta);
		//cantidadPreguntasRealizadas = 0;
	}
	
	public void preguntar(){
		int preguntar;
		boolean encontro = false;
		
		do {
			preguntar = (int) (Math.random() * pregunta.size());
			encontro = false;
			for (int i = 0; i < preguntasRealizadas.size() && !encontro; i++){
				if (preguntasRealizadas.get(i).equals(preguntar)){
					encontro = true;
				}
			}
			this.preguntasRealizadas.add(preguntar);
			//this.cantidadPreguntasRealizadas++;
		} while (!encontro);
		
		System.out.println(this.pregunta.get(preguntar));
	}
	
	public void obtenerPregunta(int numero){
		numero--;
		System.out.println(this.pregunta.get(numero));
	}
}
