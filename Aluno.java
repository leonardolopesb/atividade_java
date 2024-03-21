class Aluno {
    String nome /* = null*/;
    int idade /* = 0*/;
    boolean situacao = true;
    float[] notas = new float[2];
}

public class Main
{
    private static void main(String[] args){
        Aluno a1 = new Aluno();
        
        a1.nome = "Leo";
        a1.idade = 22;
        a1.notas[0] = 6.7f;
        a1.notas[1] = 8.3f;
        
        System.out.printf("Nome: %s\n", a1.nome);
        System.out.printf("Idade: %d\n", a1.idade);
        System.out.printf("Situacao: %b\n", a1.situacao);
        System.out.printf("1ª nota: %.1f \t 2ª nota: %.1f", a1.notas[0], a1.notas[1]);
    }
}
