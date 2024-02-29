import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      
    Scanner x1 = new Scanner(System.in);
    float n1;
    
    System.out.print("Digite a primeira nota: ");
    n1 = x1.nextFloat();
    
    
    Scanner x2 = new Scanner(System.in);
    float n2;
    
    System.out.print("Digite a segunda nota: ");
    n2 = x2.nextFloat();
    
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
