import java.util.Scanner;
import java.util.Random;

public class Main
{
	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alunos: ");
		int quantidade = sc.nextInt();
        
        double maiorMedia = 0;
        double menorMedia = 0;
        double mediaTurma = 0;
        
        double[] medias = new double[quantidade];
        
		for(int i = 0; i < quantidade; i++) {
		
    		double nota1 = rd.nextInt(101)/10.0;
    		
    		double nota2 = rd.nextInt(101)/10.0;
    	    //System.out.printf("\nNota 1: %.1f \tNota2: %.1f \t", nota1, nota2);
    		
    		double media = (nota1+nota2)/2;
    		//System.out.printf("Media = %.1f  ", media);
    		
    		mediaTurma += media;
    		
    		if (media > maiorMedia) {
    		    maiorMedia = media;
    		}
    		
    		if (media < menorMedia || i == 0) {
    		    menorMedia = media;
    		}
    		
    		medias[i] = media;
    		
    		System.out.printf("\nMedia = %.1f\t", medias[i]);
    		if (media >= 9) {
    		    System.out.println("Excelente, aluno aprovado!");
    		} else if (media >=6) {
    		    System.out.println("Aluno aprovado!");
    		} else if (media >=4) {
    		    System.out.println("Aluno em recuperação, fazer N3.");
    		} else {
    		    System.out.println("Aluno reprovado.");
    		}
		}
		
		System.out.printf("\nA maior media = %.1f \n", maiorMedia);
		System.out.printf("A menor media = %.1f \n", menorMedia);
		System.out.printf("A media da turma = %.1f \n", mediaTurma/quantidade);
	}
}
