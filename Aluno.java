import java.util.Scanner;
public class Aluno extends Escola {
    String nome;
    String data_nascimento;
    String nome_pai;
    String nome_mae;
    int matricula;
    String contato;
    Scanner sn = new Scanner(System.in);
    
	public void add_aluno() {
	    Aluno al = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		al.nome = sn.next();
		System.out.println("Digite a data de nascimento do aluno: DD/MM/AAAA ");
		al.data_nascimento = sn.next();
		System.out.println("Digite o nome do pai do aluno: ");
		al.nome_pai = sn.next();
		System.out.println("Digite o nomeda mãe do aluno: ");
		al.nome_mae = sn.next();
		System.out.println("Digite o numero para contato do aluno: ");
		al.contato = sn.next();
		System.out.println("Digite a matricula do aluno: ");
		al.matricula = sn.nextInt();
	}
		public void mostrar_aluno() {
            System.out.println("****************************************************");
            
            System.out.println("FICHA DO ALUNO");
            System.out.println("Nome: " + this.nome);
	        System.out.println("Data de Nascimento: " + this.data_nascimento);
            System.out.println("Nome do pai: " + this.nome_pai);
            System.out.println("Nome da mãe: " + this.nome_mae);
            System.out.println("Numero para contotato: " + this.contato);
            System.out.println("Numero da Matrícula: " + this.matricula);
            
            System.out.println("****************************************************");
	   }
}
