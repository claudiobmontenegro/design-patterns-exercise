package observer_pattern;

public class Demonstration_Observer {
	public static void main(String[] args) {
		// Cria o Observer e o Subject
		AgenciaDeNoticias agenciaDeNoticias = new AgenciaDeNoticias();
		Radio radio = new Radio();

		// Registra o Observer com o Subject
		agenciaDeNoticias.registrar(radio);

		// Agora adicionamos algumas not�cias
		agenciaDeNoticias.adicionaNoticia("INTZ fora do mundial.");
		agenciaDeNoticias.adicionaNoticia("Ap�s humilha��o hist�rica INTZ demite seu t�cnico.");
		agenciaDeNoticias.adicionaNoticia("Torcida brasileira ataca time da PaiN");
	}
}
