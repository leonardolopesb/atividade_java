class Alunos extends Escola {
    public String nome;
    public int matricula;
    public int idade;
    public float[] notas = new float[3];
    
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
        }
    }
}
