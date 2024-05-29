import java.util.Scanner;

interface Estudante {
    void addNota(float nota);
    void alterarAluno();
    void alterarNota(int index, float novaNota);
    void mostrar_dados();
    float[] getNotas();
    String getNome();
    int getMatricula();
}

abstract class Pessoa {
    protected String nome;
    protected int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

public class Aluno extends Pessoa implements Estudante {
    protected int matricula;
    protected float[] notas = new float[3];
    protected int turma;
    Scanner sn = new Scanner(System.in);

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public float[] getNotas() {
        return notas;
    }
    
    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public void add_aluno() {
        System.out.print("Digite o nome do aluno: ");
        this.nome = sn.next();
        
        System.out.print("Digite a idade do aluno: ");
        this.idade = sn.nextInt();
        
        System.out.print("Digite a matrícula do aluno: ");
        this.matricula = sn.nextInt();
        
        System.out.print("Digite o ano e a turma do aluno: ");
        this.turma = sn.nextInt();
    }
    
    public void mostrar_dados() {
        System.out.println();
        System.out.println("\t\t\t\tFICHA DO ALUNO");
        System.out.println("\t\t\t- Nome: " + this.nome);
        System.out.println("\t\t\t- Idade: " + this.idade);
        System.out.println("\t\t\t- Número da Matrícula: " + this.matricula);
        System.out.println("\t\t\t- Turma: " + this.turma);
    }

    public void addNota(float nota) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == 0) {
                if(nota < 0 || nota > 10){
                   System.out.println("Nota inválida!\n");
                   break;
                }
                else{
                    notas[i] = nota;
                    System.out.println("Nota adicionada com sucesso!\n");
                    return;
                }
            }
            
            if(notas[i] == 3){
                System.out.println("Limite de notas atingido (máximo 3 notas).\n");
            }
        }
    }
    
    public void alterarNota(int index, float novaNota) {
        if (index >= 0 && index < notas.length) {
            notas[index] = novaNota;
        } else {
            System.out.println("Índice de nota inválido.\n");
        }
    }

    public void alterarAluno() {
        System.out.println("\n1 - Alterar Nome");
        System.out.println("2 - Alterar Idade");
        System.out.println("3 - Alterar Matrícula");
        System.out.println("4 - Alterar Turma\n");
        System.out.print("Escolha a informação a alterar: ");
        int info = sn.nextInt();
        switch (info) {
            case 1:
                System.out.print("\nDigite o novo nome: ");
                String novoNome = sn.next();
                this.setNome(novoNome);
                System.out.println("Nome alterado com sucesso!\n");
                break;
            case 2:
                System.out.print("Digite a nova idade: ");
                int novaIdade = sn.nextInt();
                this.setIdade(novaIdade);
                System.out.println("Idade alterada com sucesso!\n");
                break;
            case 3:
                System.out.print("Digite a nova matrícula: ");
                int novaMatricula = sn.nextInt();
                this.setMatricula(novaMatricula);
                System.out.println("Matrícula alterada com sucesso!\n");
                break;
            case 4:
                System.out.print("Digite a nova turma: ");
                int novaTurma = sn.nextInt();
                this.setTurma(novaTurma);
                System.out.println("Turma alterada com sucesso!\n");
                break;
            default:
                System.out.println("Opção inválida.\n");
        }
    }
}
