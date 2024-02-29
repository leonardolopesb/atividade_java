import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      
    Scanner nota = new Scanner(System.in);
    float n1, n2;
    
    System.out.print("Digite a primeira nota: ");
    n1 = nota.nextFloat();
    
    System.out.print("Digite a segunda nota: ");
    n2 = nota.nextFloat();
    
    float media = (n1 + n2) / 2;
    
    System.out.println("\nMédia do usuario: " + media);  
    
    if(media >= 0 && media < 4){
        System.out.println("Reprovado!");
    }
    
    else if(media < 6){
        System.out.println("Recuperação!");
    }
    
    else if(media < 9){
        System.out.println("Aprovado!");
    }
    
    else if (media >= 9){
        System.out.println("Aprovado com excelência!");
    }
  }
}
