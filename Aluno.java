import java.util.Scanner;

class Alunos {
    String[] nome = new String[3];
    int[] matricula = new int[3];
    int[] idade = new int[3];
    float[] nota = new float[3];
    
    float media;
}

public class Aluno {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        int entrada = 0;
        int num_alunos = 0;
        int contAlunos = 0;
        
        Alunos[] alunos = null;
        
        while (entrada != 4) {
            System.out.println("1 - Para adicionar um aluno.");
            System.out.println("2 - Para acrescentar notas aos alunos.");
            System.out.println("3 - Para consultar os alunos.");
            System.out.println("4 - Sair.");
            
            System.out.print("Digite uma das opções: ");
            entrada = sn.nextInt();
            
            switch (entrada) {
                case 1:
                    System.out.println("Adicionando Alunos...");
                    
                    System.out.print("\nDigite a quantidade de alunos: ");
                    num_alunos = sn.nextInt();
                    
                    /*while(num_alunos < 0 || num_alunos > 100){
                        System.out.print("\nOpção inválida! Digite a quantidade de alunos: ");
                        num_alunos = sn.nextInt();
                    }*/
                    
                    alunos = new Alunos[num_alunos];
                    
                    for (int i = contAlunos; i < num_alunos; i++) {
                        Alunos al = new Alunos();
                        alunos[i] = al;
                        
                        System.out.print("\nDigite o nome do aluno: ");
                        al.nome[i] = sn.next();
                        
                        System.out.print("Digite o número de matricula do aluno: ");
                        al.matricula[i] = sn.nextInt();
                        
                        System.out.print("Digite a idade do aluno: ");
                        al.idade[i] = sn.nextInt();
                        
                        /*System.out.println("Digite a primeira nota do aluno:");
                        al.nota[0] = sn.nextFloat();
                        System.out.println("Digite a segunda nota do aluno:");
                        al.nota[1] = sn.nextFloat();
                        System.out.println("Digite a terceira nota do aluno:");
                        al.nota[2] = sn.nextFloat();
                        
                        al.media = (al.nota[0] + al.nota[1] + al.nota[2]) / 3;*/
                    
                        System.out.println("\nAluno adicionado com Sucesso!");
                    }
                    
                    contAlunos+= num_alunos;
                    
                    System.out.println("");
                    break;
                    
                case 2:
                    int checarMatricula = 0;
                    System.out.println("Acrescentando notas aos alunos...");
                    
                    System.out.print("Digite a matrícula do aluno: ");
                    checarMatricula = sn.nextInt();
                    
                    break;
                    
                    /*for(int i = 0; i < num_alunos; i++){
                        if(checarMatricula)
                    }*/
                    
                case 3:
                    System.out.println("Consultando Alunos.");

                    if (alunos != null && contAlunos > 0) {

                        for (int i = 0; i < contAlunos; i++) {
                            System.out.println("\n#### FICHA DO ALUNO " + (i+1) + " #####");
                            System.out.println("Nome: " + alunos[i].nome[i]);
                            System.out.println("Matrícula: " + alunos[i].matricula[i]);
                            System.out.println("Idade: " + alunos[i].idade[i]);
                            /*System.out.println("Nota 1: " + alunos[i].nota[0]);
                            System.out.println("Nota 2: " + alunos[i].nota[1]);
                            System.out.println("Nota 3: " + alunos[i].nota[2]);
                            System.out.println("Média: " + alunos[i].media);*/
                            
                            /*if (alunos[i].media >= 9) {
                                System.out.println("Excelente, aluno aprovado!");
                            } 
                            
                            else if (alunos[i].media >= 6) {
                                System.out.println("Aluno aprovado!");
                            } 
                            
                            else if (alunos[i].media >= 4) {
                                System.out.println("Aluno em recuperação!");
                            } 
                            
                            else {
                                System.out.println("Aluno reprovado!");
                            }*/
                            
                            System.out.println();
                        }
                    } 
                    
                    else {
                        System.out.println("Não há alunos para consultar.");
                    }
                    break;
                    
                case 4:
                    System.out.println("Bye Bye!");
                    break;
                    
                default:
                    System.out.println("Opção Inválida! Por favor, selecione uma das opções abaixo:\n");
            }
        }
    }
}
