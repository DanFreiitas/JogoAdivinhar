import java.util.Scanner;

public class JogoAdivinhacao {
	public static void main(String[] args) {
		int chances = 10;
		int numero = 60;

		System.out.println("Tente advinhar o número escolhido de 0 a 100");
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 11; i++) {
			System.out.println("Digite o número desejado: ");
			int numeroDigitado = entrada.nextInt();

			if (numeroDigitado < 0 || numeroDigitado > 100) {
				System.out.println("Valor inválido!");
			} else {
				if (numeroDigitado != numero && chances > 0) {
					System.out.println("Resposta errada, tente novamente!");
					chances--;
					System.out.println("Você possui mais " + chances + " tentativas.");

				} else if (chances == 0) {
					System.out.println("Você perdeu todas as chances. =/");
					break;
				} else {
					System.out.println("Você venceu! =D");
					break;
				}
			}
		}
		System.out.println("..:: Fim! ::..");

		entrada.close();

	}
}
