import java.util.Scanner;

class Aluno extends Escola{
    public String nome;
    public int matricula;
    public int idade;
    public float[] notas = new float[3];
    public String data_nascimento;
    public String nome_pai;
    public String nome_mae;
    public String contato;
    Scanner sn = new Scanner(System.in);

    public void add_aluno() {
        System.out.println("Digite o nome do aluno: ");
        this.nome = sn.next();
        System.out.println("Digite a data de nascimento do aluno: DD/MM/AAAA ");
        this.data_nascimento = sn.next();
        System.out.println("Digite o nome do pai do aluno: ");
        this.nome_pai = sn.next();
        System.out.println("Digite o nome da mãe do aluno: ");
        this.nome_mae = sn.next();
        System.out.println("Digite o número para contato do aluno: ");
        this.contato = sn.next();
        System.out.println("Digite a matrícula do aluno: ");
        this.matricula = sn.nextInt();
    }
    
    public void mostrar_aluno() {
        System.out.println("****************************************************");
        System.out.println("FICHA DO ALUNO");
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.data_nascimento);
        System.out.println("Nome do pai: " + this.nome_pai);
        System.out.println("Nome da mãe: " + this.nome_mae);
        System.out.println("Número para contato: " + this.contato);
        System.out.println("Número da Matrícula: " + this.matricula);
        System.out.println("****************************************************");
    }

    public void addNota(float nota) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == 0) {
                notas[i] = nota;
                System.out.println("Nota adicionada com sucesso!");
                return;
            }
        }
        System.out.println("Limite de notas atingido (máximo 3 notas).");
    }
    
    public void alterarNota(int index, float novaNota) {
        if (index >= 0 && index < notas.length) {
            notas[index] = novaNota;
        } else {
            System.out.println("Índice de nota inválido.");
        }
    }
}
