import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        int entrada = 0;
        int num_alunos = 0;
        int contAlunos = 0;
        
        Alunos[] alunos = null;
        
        while (entrada != 6) {
            System.out.println("1 - Para adicionar alunos (e seus dados pessoais).");
            System.out.println("2 - Para acrescentar notas aos alunos.");
            System.out.println("3 - Para alterar notas dos alunos.");
            System.out.println("4 - Para consultar os alunos (e seus dados pessoais).");
            System.out.println("5 - Para consultar os alunos (e suas notas/médias).");
            System.out.println("6 - Sair.");
            
            System.out.print("Digite uma das opções: ");
            entrada = sn.nextInt();
            
            switch (entrada) {
                case 1:
                    System.out.println("Adicionando Alunos...");
                    
                    Aluno al = new Aluno();
                    al.add_aluno();
                    
                    num_alunos++;
                    
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.println("Acrescentando notas aos alunos...");
                    
                    if (alunos != null && num_alunos > 0) {
                        System.out.print("Digite a matrícula do aluno: ");
                        int checarMatricula = sn.nextInt();
                        
                        boolean alunoEncontrado = false;
                        for (int i = 0; i < contAlunos; i++) {
                            if (checarMatricula == alunos[i].matricula) {
                                System.out.print("Digite a nota do aluno: ");
                                float nota = sn.nextFloat();
                                alunos[i].addNota(nota);
                                alunoEncontrado = true;
                                break;
                            }
                        }
                        
                        if (!alunoEncontrado) {
                            System.out.println("Aluno não encontrado.");
                        }
                    } else {
                        System.out.println("Não há alunos para adicionar notas.");
                    }
                    
                    break;
                
                case 3:
                    System.out.println("Alterando notas dos alunos...");
                    if (alunos != null && num_alunos > 0) {
                        System.out.print("Digite a matrícula do aluno: ");
                        int checarMatricula = sn.nextInt();
                        
                        boolean alunoEncontrado = false;
                        for (int i = 0; i < contAlunos; i++) {
                            if (checarMatricula == alunos[i].matricula) {
                                System.out.println("Notas atuais do aluno:");
                                
                                for (int j = 0; j < alunos[i].notas.length; j++) {
                                    System.out.println("Nota " + (j + 1) + ": " + alunos[i].notas[j]);
                                }
                                
                                System.out.print("Digite o número da nota a ser alterada (1, 2, ou 3): ");
                                int notaIndex = sn.nextInt();

                                if (notaIndex >= 1 && notaIndex <= 3) {
                                    System.out.print("Digite a nova nota: ");
                                    float novaNota = sn.nextFloat();
                                    alunos[i].alterarNota(notaIndex - 1, novaNota);
                                    System.out.println("Nota alterada com sucesso!");
                                } else {
                                    System.out.println("Número de nota inválido.");
                                }
                                alunoEncontrado = true;
                                break;
                            }
                        }
                        if (!alunoEncontrado) {
                            System.out.println("Aluno não encontrado.");
                        }
                    } else {
                        System.out.println("Não há alunos para alterar notas.");
                    }
                    break;
                
                case 4:
                    /*System.out.println("\nConsultando dados pessoais dos alunos...");

                    if (alunos != null && contAlunos > 0) {
                        for (int i = 0; i < contAlunos; i++) {
                            System.out.println("\t\t\t\t\t\t#### DADOS PESSOAIS DO ALUNO " + (i + 1) + " #####");
                            alunos[i].mostrar_aluno();
                            System.out.println();
                        }
                    } 
                    else {
                        System.out.println("Não há alunos para consultar.");
                    }*/
                    break;

                    
                case 5:
                    System.out.println("Consultando notas/médias dos alunos...");
                    
                    if (alunos != null && contAlunos > 0) {
                        for (int i = 0; i < contAlunos; i++) {
                            System.out.println("\t\t\t\t\t\t#### NOTAS/MÉDIAS DO ALUNO " + (i+1) + " #####");
                            System.out.println("\t\t\t\t\t\tNome: " + alunos[i].nome);
                            System.out.println("\t\t\t\t\t\tMatrícula: " + alunos[i].matricula);
                            
                            float somaNotas = 0;
                            int numNotas = 0;
                            for (float nota : alunos[i].notas) {
                                if (nota != 0) {
                                    System.out.println("\t\t\t\t\t\tNota " + (numNotas + 1) + ": " + nota);
                                    somaNotas += nota;
                                    numNotas++;
                                }
                            }
                            
                            if (numNotas > 0) {
                                float media = somaNotas / numNotas;
                                System.out.println("\t\t\t\t\t\tMédia: " + media);
                            } else {
                                System.out.println("\t\t\t\t\t\tNenhuma nota registrada.");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Não há alunos para consultar notas/médias.");
                    }
                    break;
                
                case 6:
                    System.out.println("Bye Bye!");
                    break;
                    
                default:
                    System.out.println("Opção Inválida! Por favor, selecione uma das opções abaixo:\n");
            }
        }
    }
}
