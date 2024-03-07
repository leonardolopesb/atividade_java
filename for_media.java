import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner nota = new Scanner(System.in);
		
		float soma = 0;
		
		for(int i = 1; i <= 3; i++){
		    
		    float n[] = new float[3];
		    
		    System.out.print("Digite a "+i+"ª nota: ");
		    n[i] = nota.nextFloat();
		    
		    soma+= n[i];
		    
		    System.out.print(soma+ "\n");
		}
		
		float media = soma / 3;
		
		System.out.print("A média do aluno é "+media);
}
}
