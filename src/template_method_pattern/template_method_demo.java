package template_method_pattern;

public class template_method_demo {
	public static void main(String[] args) {
		
		TreinoNoInicioDaTemporada treino1 = new TreinoNoInicioDaTemporada();
		treino1.preparoFisico();
		treino1.jogoTreino();
		
		TreinoNoMeioDaTemporada treino2 = new TreinoNoMeioDaTemporada();
		treino2.preparoFisico();
		treino2.jogoTreino();
		
	}

}
