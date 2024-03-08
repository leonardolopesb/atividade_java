import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de notas: ");
		int n = scn.nextInt();
		
		System.out.print("Digite a quantidade de alunos: ");
		int x = scn.nextInt();
		
		float v[] = new float[n+1];
		
		for(int j = 1; j <= x; j++){
		    float soma = 0;
		    
		    System.out.println("\n\n"+j+ "º aluno");
		    
		    for(int i = 1; i <= n; i++){
		        System.out.print("Digite a "+i+"ª nota: ");
		        v[i] = scn.nextFloat();
		    
		        soma+= v[i];
		    }
		    
		    float media[] = new float[n+2];
		    
		    media[j] = soma/n;
		    System.out.printf("\nA média do aluno é %.2f",media[j]);
		
		    if(media[j] >= 0 && media[j] < 4){
                System.out.print("\nReprovado!");
            }
    
            else if(media[j] < 6){
                System.out.print("\nRecuperação!");
            }
    
            else if(media[j] < 9){
                System.out.print("\nAprovado!");
            }
    
            else{
                System.out.print("\nAluno aprovado com excelência!");
            }
		}
    }
}
