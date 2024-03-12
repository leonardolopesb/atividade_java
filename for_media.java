import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a quantidade de notas: ");
		int n = scan.nextInt();

		System.out.print("Digite a quantidade de alunos: ");
		int x = scan.nextInt();

		float v[] = new float[n + 1];

		//String username [];

		for (int j = 1; j <= x; j++) {
			float soma = 0;

			Scanner nome = new Scanner(System.in);

			System.out.print("\nDigite o nome do aluno: ");
			String username = nome.nextLine();

			System.out.println("\n\n" + j + "º aluno");

			for (int i = 1; i <= n; i++) {
				System.out.print("Digite a " + i + "ª nota: ");
				v[i] = scan.nextFloat();

				soma += v[i];
			}

			float media[] = new float[n + 2];

			media[j] = soma / n;
			System.out.printf("\nA média de %s é %.2f", username, media[j]);

			if (media[j] >= 0 && media[j] < 4) {
				System.out.print("\nReprovado!");
			}

			else if (media[j] < 6) {
				System.out.print("\nRecuperação!");
			}

			else if (media[j] < 9) {
				System.out.print("\nAprovado!");
			}

			else {
				System.out.print("\nAluno aprovado com excelência!");
			}
		}
	}
}
