
public class ejercicio2examen {

	public ejercicio2examen() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		//declaramos las variables
		String mensaje="Paquito es el tio mas guapo que conozco";
		String mensajeCodificado="";
		String temporal="";
		//Pasamos el mensaje a mayusculas
		mensajeCodificado=mensaje.toUpperCase();
		//cambiamos de posicion cada una de las letras

		for(int i=0;i<mensaje.length();i=i+2){
		if(i+1==mensaje.length()){
		temporal=temporal+mensajeCodificado.charAt(i);
		}else{
		temporal=temporal+mensajeCodificado.charAt(i+1)+mensajeCodificado.charAt(i);
		}

		}
		mensajeCodificado=temporal;
		System.out.println(mensajeCodificado);

	}
}
