import java.util.Scanner;

abstract class Aluno {
    public String nome;
    public int idade;
    protected int matricula;
    protected float[] notas = new float[3];
    Scanner sn = new Scanner(System.in);

    public void add_aluno() {
        System.out.print("Digite o nome do aluno: ");
        this.nome = sn.next();
        
        System.out.print("Digite a idade do aluno: ");
        this.idade = sn.nextInt();
        
        System.out.print("Digite a matrícula do aluno: ");
        this.matricula = sn.nextInt();
    }


    public void mostrar_aluno() {
        System.out.println();
        System.out.println("\t\t\t\t\t\t#### FICHA DO ALUNO");
        System.out.println("\t\t\t\t\t\t#### Nome: " + this.nome);
        System.out.println("\t\t\t\t\t\t#### Idade: " + this.idade);
        System.out.println("\t\t\t\t\t\t#### Número da Matrícula: " + this.matricula);
    }

    public void addNota(float nota) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == 0) {
                notas[i] = nota;
                System.out.println("Nota adicionada com sucesso!\n");
                return;
            }
        }
        System.out.println("Limite de notas atingido (máximo 3 notas).\n");
    }

    public void alterarNota(int index, float novaNota) {
        if (index >= 0 && index < notas.length) {
            notas[index] = novaNota;
        } else {
            System.out.println("Índice de nota inválido.");
        }
    }
}

class AlunoRegular extends Aluno {
    @Override
    public void add_aluno() {
        System.out.print("Digite o nome do aluno: ");
        this.nome = sn.next();

        System.out.print("Digite a idade do aluno: ");
        this.idade = sn.nextInt();

        System.out.print("Digite a matrícula do aluno: ");
        this.matricula = sn.nextInt();
    }
}
