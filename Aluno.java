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
		
		System.out.println("Digite o nome da mãe do aluno: ");
		al.nome_mae = sn.next();
		
		System.out.println("Digite o numero para contato do aluno: ");
		al.contato = sn.next();
		
		System.out.println("Digite a matricula do aluno: ");
		al.matricula = sn.nextInt();
	}
}
