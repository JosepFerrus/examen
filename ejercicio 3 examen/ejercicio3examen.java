
public class ejercicio3examen {

	public ejercicio3examen() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	//introducimos las variables
		String mensaje="";
		String mensajeaCodificado = "APUQTI OSEE  LIT OAM SUGPA OUQ EOCONCZO";
		String temporal="";
		//recorremos mensajeCodificado
		for(int i = 0; i<mensajeaCodificado.length();i=i+2){
			
			
			if(i+1==mensajeaCodificado.length()){
				//introducimos el caracter en la posicion
				temporal = temporal + mensajeaCodificado.charAt(i);
			}else{ 
				temporal = temporal + mensajeaCodificado.charAt(i+1) + mensajeaCodificado.charAt(i); 
			}
				
		}
		//pasamos la frase a minuscula
		mensaje = temporal.toLowerCase();
		System.out.println(mensaje);
	

}
}
