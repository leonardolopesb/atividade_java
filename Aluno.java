import java.util.Scanner;

interface Estudante {
    void addNota(float nota);
    void alterarNota(int index, float novaNota);
    void mostrar_dados();
    float[] getNotas();
    String getNome();
    int getMatricula();
}

abstract class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

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

    public abstract void mostrar_dados();
}

public class Aluno extends Pessoa implements Estudante {
    protected int matricula;
    protected float[] notas = new float[3];
    Scanner sn = new Scanner(System.in);

    public int getMatricula() {
        return matricula;
    }

    public float[] getNotas() {
        return notas;
    }

    public void add_aluno() {
        System.out.print("Digite o nome do aluno: ");
        this.nome = sn.next();
        
        System.out.print("Digite a idade do aluno: ");
        this.idade = sn.nextInt();
        
        System.out.print("Digite a matrícula do aluno: ");
        this.matricula = sn.nextInt();
    }
    
    public void mostrar_dados() {
        System.out.println();
        System.out.println("\t\t\t\t\t\t#### FICHA DO ALUNO");
        System.out.println("\t\t\t\t\t\t#### Nome: " + this.nome);
        System.out.println("\t\t\t\t\t\t#### Idade: " + this.idade);
        System.out.println("\t\t\t\t\t\t#### Número da Matrícula: " + this.matricula);
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
            System.out.println("Índice de nota inválido.");
        }
    }
}
