package exercicios_aula;


public class BalancoTrimestral {

	
	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000	;
		int gastosAbril = 12300;
		int gastosMaio = 17600;
		int gastosJunho = 15250;
		int gastosJulho = 19200;
		int gastosAgosto= 15002;
		int gastosSetembro = 18200;
		int gastosOutubro = 1700;
		int gastosNovembro = 22200;
		int gastosDezembro = 15200;
		
		gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		gastosSegundoTrimestre=gastosAbril+gastosMaio+gastosJunho;
		gastosTerceiroTrimestre=gastosJulho+gastosAgosto+gastosSetembro;
		gastosQuartoTrimestre=gastosOutubro+gastosNovembro+gastosDezembro;
		gastosPrimeiroSemestre=gastosPrimeiroTrimestre+gastosSegundoTrimestre;
		gastosSegundoSemestre=gastosTerceiroTrimestre+gastosQuartoTrimestre;
		gastoAnual=gastosPrimeiroSemestre+gastosSegundoSemestre;
		
		System.out.println("O gasto total da empresa no primeiro trimestre foi de R$ "+ gastosPrimeiroTrimestre);
		System.out.println("O gasto total da empresa no segundo trimestre foi de R$ "+ gastosSegundoTrimestre);
		System.out.println("O gasto total da empresa no terceiro trimestre foi de R$ "+ gastosTerceiroTrimestre);
		System.out.println("O gasto total da empresa no quarto trimestre foi de R$ "+ gastosQuartoTrimestre);
		System.out.println("O gasto total da empresa no primeiro semestre foi de R$ "+ gastosPrimeiroSemestre);
		System.out.println("O gasto total da empresa no segundo semestre foi de R$ "+ gastosSegundoSemestre);
		System.out.println("O gasto total da empresa no ano foi de R$ "+ gastoAnual);
	}
	
	// metodos 
	
	public float somarPrimeiroS() {
		float gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.printf("O balanço trismestral foi de %d", gastosTrimestre);
	}
	public float somarSegundoS() {
		float gastosTrimestre = gastosAbril + gastosMaio + gastosJunho;
		System.out.printf("O balanço trismestral foi de %d", gastosTrimestre);
	}
	public float somarTerceiroS() {
		float gastosTrimestre = gastosJulho + gastosAgosto + gastosSetembro;
		System.out.printf("O balanço trismestral foi de %d", gastosTrimestre);
	}
}
