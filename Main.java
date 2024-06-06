import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        int entrada = 0;
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        while (entrada != 8) {
            System.out.println("1 - Para adicionar alunos (e seus dados pessoais).");
            System.out.println("2 - Para acrescentar notas aos alunos.");
            System.out.println("3 - Para alterar dados pessoais dos alunos.");
            System.out.println("4 - Para alterar notas dos alunos.");
            System.out.println("5 - Para consultar os alunos (e seus dados pessoais).");
            System.out.println("6 - Para consultar os alunos (e suas notas/médias).");
            System.out.println("7 - Para excluir alunos.");
            System.out.println("8 - Sair.");
            
            System.out.print("\nDigite uma das opções: ");
            entrada = sn.nextInt();
            
            switch (entrada) {
                case 1:
                    System.out.println("\nAdicionando Alunos...");
                    Aluno al = new Aluno();
                    boolean matriculaValida = false;
        
                    while (!matriculaValida) {
                        al.add_aluno();
            
                        boolean matriculaExistente = false;
                        for (Aluno aluno : alunos) {
                            if (al.getMatricula() == aluno.getMatricula()) {
                                matriculaExistente = true;
                                System.out.println("Matrícula já existente! Por favor, insira outra matrícula.\n");
                                break;
                            }
                        }
            
                        if (!matriculaExistente) {
                            matriculaValida = true;
                            alunos.add(al);
                            System.out.println("\nAluno adicionado com sucesso!\n");
                        }
                    }
                    break;
                    
                case 2:
                    System.out.println("\nAcrescentando notas aos alunos...");
                    if (!alunos.isEmpty()) {
                        System.out.print("Digite a matrícula do aluno: ");
                        int checarMatricula = sn.nextInt();
                        
                        boolean alunoEncontrado = false;
                        for (Aluno aluno : alunos) {
                            if (checarMatricula == aluno.getMatricula()) {
                                System.out.println("\nAluno referenciado: " + aluno.getNome());
                                System.out.print("Digite a nota do aluno: ");
                                float nota = sn.nextFloat();
                                aluno.addNota(nota);
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
                    System.out.println("\nAlterando dados pessoais dos alunos...");
                    if (!alunos.isEmpty()) {
                        System.out.print("Digite a matrícula do aluno: ");
                        int checarMatricula = sn.nextInt();
                        
                        boolean alunoEncontrado = false;
                        for (Aluno aluno : alunos) {
                            if (checarMatricula == aluno.getMatricula()) {
                                aluno.alterarAluno(alunos);
                                alunoEncontrado = true;
                                break;
                            }
                        }
                        if (!alunoEncontrado) {
                            System.out.println("Aluno não encontrado.\n");
                        }
                    } else {
                        System.out.println("Não há alunos para alterar dados pessoais.\n");
                    }
                    break;

                case 4:
                    System.out.println("\nAlterando notas dos alunos...");
                    if (!alunos.isEmpty()) {
                        System.out.print("Digite a matrícula do aluno: ");
                        int checarMatricula = sn.nextInt();
                        
                        boolean alunoEncontrado = false;
                        for (Aluno aluno : alunos) {
                            if (checarMatricula == aluno.getMatricula()) {
                                System.out.println("Aluno referenciado: " + aluno.getNome());
                                System.out.println("\nNotas atuais do aluno:");
                                
                                for (int j = 0; j < aluno.getNotas().length; j++) {
                                    System.out.println("Nota " + (j + 1) + ": " + aluno.getNotas()[j]);
                                }
                                
                                System.out.print("Digite o número da nota a ser alterada (1, 2, ou 3): ");
                                int notaIndex = sn.nextInt();

                                if (notaIndex >= 1 && notaIndex <= 3) {
                                    System.out.print("Digite a nova nota: ");
                                    float novaNota = sn.nextFloat();
                                    aluno.alterarNota(notaIndex - 1, novaNota);
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
                
                case 5:
                    System.out.println("\nConsultando dados pessoais dos alunos...");
                    if (!alunos.isEmpty()) {
                        for (Aluno aluno : alunos) {
                            System.out.println("\n\t\t\tDados pessoais do aluno com matrícula: " + aluno.getMatricula());
                            aluno.mostrar_dados();
                            System.out.println();
                        }
                    } else {
                        System.out.println("Não há alunos para consultar.\n");
                    }
                    break;

                case 6:
                    System.out.println("\nConsultando notas/médias dos alunos...");
                    if (!alunos.isEmpty()) {
                        for (Aluno aluno : alunos) {
                            System.out.println("\n\t\t\tNotas e média do aluno com matrícula " + aluno.getMatricula() + "\n");
                            float somaNotas = 0;
                            int numNotas = 0;
                            for (float nota : aluno.getNotas()) {
                                if (nota != 0) {
                                    System.out.println("\t\t\tNota " + (numNotas + 1) + ": " + nota);
                                    somaNotas += nota;
                                    numNotas++;
                                }
                            }
                            if (numNotas > 0) {
                                float media = somaNotas / numNotas;
                                System.out.printf("\n\t\t\tMédia:  %.2f \n", media);
                            } else {
                                System.out.println("\t\t\tNenhuma nota registrada.\n");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Não há alunos para consultar notas/médias.\n");
                    }
                    break;

                case 7:
                    System.out.println("\nExcluindo aluno...");
                    if (!alunos.isEmpty()) {
                        System.out.print("Digite a matrícula do aluno a ser excluído: ");
                        int checarMatricula = sn.nextInt();

                        boolean alunoEncontrado = false;
                        for (int i = 0; i < alunos.size(); i++) {
                            if (checarMatricula == alunos.get(i).getMatricula()) {
                                alunoEncontrado = true;
                                alunos.remove(i);
                                System.out.println("Aluno excluído com sucesso!\n");
                                break;
                            }
                        }

                        if (!alunoEncontrado) {
                            System.out.println("Aluno não encontrado.\n");
                        }
                    } else {
                        System.out.println("Não há alunos para excluir.\n");
                    }
                    break;
                
                case 8:
                    System.out.println("\nBoas férias!");
                    break;
                    
                default:
                    System.out.println("Opção Inválida! Por favor, selecione uma das opções abaixo:\n");
            }
        }
        sn.close();
    }
}
