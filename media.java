import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      
    Scanner nota = new Scanner(System.in);
    
    float n1, n2;
    
    System.out.print("Digite uma primeira nota: ");
    n1 = nota.nextFloat();
    
    while(n1 < 0 || n1 > 10){
        System.out.print("Digite uma primeira nota válida: ");
        n1 = nota.nextFloat();
    }
    
    System.out.print("\nDigite uma segunda nota: ");
    n2 = nota.nextFloat();
    
    while(n2 < 0 || n2 > 10){
        System.out.print("Digite uma segunda nota válida: ");
        n2 = nota.nextFloat();
    }
    
    float media = (n1 + n2) / 2;
    
    System.out.println("\nPrimeira nota: "+n1);
    System.out.println("Segunda nota: "+n2);
    System.out.println("\nMédia do usuário: " + media);  
    
    if(media >= 0 && media < 4){
        System.out.println("Reprovado!");
    }
    
    else if(media < 6){
        System.out.println("Recuperação!");
    }
    
    else if(media < 9){
        System.out.println("Aprovado!");
    }
    
    else{
        System.out.println("Aprovado com excelência!");
    }
  }
}
