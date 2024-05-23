import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        int entrada = 0;
        int num_alunos = 0;
        
        Estudante[] alunos = new Estudante[1000];
        
        while (entrada != 6) {
            System.out.println("1 - Para adicionar alunos (e seus dados pessoais) + correlacionar às turmas.");
            System.out.println("2 - Para acrescentar notas aos alunos.");
            System.out.println("X - Para alterar dados pessoais dos alunos.");
            System.out.println("3 - Para alterar notas dos alunos.");
            System.out.println("4 - Para consultar os alunos (e seus dados pessoais).");
            System.out.println("5 - Para consultar os alunos (e suas notas/médias).");
            System.out.println("Y - Para excluir alunos");
            System.out.println("6 - Sair.");
            
            System.out.print("\nDigite uma das opções: ");
            entrada = sn.nextInt();
            
            switch (entrada) {
                case 1:
                    System.out.println("\nAdicionando Alunos...");
                    
                    Aluno al = new Aluno();
                    al.add_aluno();
                    
                    alunos[num_alunos] = al;
                    num_alunos++;
                    
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.println("\nAcrescentando notas aos alunos...");
                    
                    if (num_alunos > 0) {
                        System.out.print("Digite a matrícula do aluno: ");
                        int checarMatricula = sn.nextInt();
                        
                        boolean alunoEncontrado = false;
                        for (int i = 0; i < num_alunos; i++) {
                            if (checarMatricula == alunos[i].getMatricula()) {
                                System.out.println("\nAluno referenciado: " + alunos[i].getNome());
                                System.out.print("Digite a nota do aluno: ");
                                float nota = sn.nextFloat();
                                alunos[i].addNota(nota);
                                alunoEncontrado = true;
                                break;
                            }
                        }
                        
                        if (!alunoEncontrado) {
                            System.out.println("Aluno não encontrado.\n");
                        }
                    } else {
                        System.out.println("Não há alunos para adicionar notas.\n");
                    }
                    
                    break;
                
                case 3:
                    System.out.println("\nAlterando notas dos alunos...");
                    if (num_alunos > 0) {
                        System.out.print("Digite a matrícula do aluno: ");
                        int checarMatricula = sn.nextInt();
                        
                        boolean alunoEncontrado = false;
                        for (int i = 0; i < num_alunos; i++) {
                            if (checarMatricula == alunos[i].getMatricula()) {
                                System.out.println("Aluno referenciado: " + alunos[i].getNome());
                                System.out.println("\nNotas atuais do aluno:");
                                
                                for (int j = 0; j < alunos[i].getNotas().length; j++) {
                                    System.out.println("Nota " + (j + 1) + ": " + alunos[i].getNotas()[j]);
                                }
                                
                                System.out.print("Digite o número da nota a ser alterada (1, 2, ou 3): ");
                                int notaIndex = sn.nextInt();

                                if (notaIndex >= 1 && notaIndex <= 3) {
                                    System.out.print("Digite a nova nota: ");
                                    float novaNota = sn.nextFloat();
                                    alunos[i].alterarNota(notaIndex - 1, novaNota);
                                    System.out.println("Nota alterada com sucesso!\n");
                                } else {
                                    System.out.println("Número de nota inválido.\n");
                                }
                                alunoEncontrado = true;
                                break;
                            }
                        }
                        if (!alunoEncontrado) {
                            System.out.println("Aluno não encontrado.\n");
                        }
                    } else {
                        System.out.println("Não há alunos para alterar notas.\n");
                    }
                    break;
                
                case 4:
                    System.out.println("\nConsultando dados pessoais dos alunos...");

                    if (num_alunos > 0) {
                        for (int i = 0; i < num_alunos; i++) {
                            System.out.println("\t\t\tDados pessoais do aluno com matrícula: " + alunos[i].getMatricula());
                            alunos[i].mostrar_dados();
                            System.out.println();
                        }
                    } 
                    else {
                        System.out.println("Não há alunos para consultar.\n");
                    }
                    break;

                    
                case 5:
                    System.out.println("\nConsultando notas/médias dos alunos...");
                    
                    if (num_alunos > 0) {
                        for (int i = 0; i < num_alunos; i++) {
                            System.out.println("\t\t\tNotas e média do aluno com matrícula " + alunos[i].getMatricula());
                            
                            float somaNotas = 0;
                            int numNotas = 0;
                            for (float nota : alunos[i].getNotas()) {
                                if (nota != 0) {
                                    System.out.println("\n\t\t\tNota " + (numNotas + 1) + ": " + nota);
                                    somaNotas += nota;
                                    numNotas++;
                                }
                            }
                            
                            if (numNotas > 0) {
                                float media = somaNotas / numNotas;
                                System.out.println("\n\t\t\tMédia: " + media);
                            } else {
                                System.out.println("\t\t\tNenhuma nota registrada.\n");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Não há alunos para consultar notas/médias.\n");
                    }
                    break;
                
                case 6:
                    System.out.println("\nBye Bye!");
                    break;
                    
                default:
                    System.out.println("Opção Inválida! Por favor, selecione uma das opções abaixo:\n");
            }
        }
        sn.close();
    }
}
