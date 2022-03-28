public class Aluno {

  private String nome, turma;
  private int aulasAssistidas, matricula;
  double desempenho;
  private int[] notas = new int[4];

  Aluno() {
    this.setup("Fulano", "", 0, new int[] {0, 0, 0, 0}, 0);
  }

  public Aluno(String nome, String turma, int aulasAssistidas, int[] notas, int matricula) {
    this.setup(nome, turma, aulasAssistidas, notas, matricula);
  }

  private void setup(String nome, String turma, int aulasAssistidas, int[] notas, int matricula) {
    this.definirNome(nome);
    this.definirTurma(turma);
    this.definirAulasAssistidas(aulasAssistidas);
    this.adicionarNotas(notas);
    this.definirMatricula(matricula);
  }

  public void definirAulasAssistidas(int aulasAssistidas) {
    this.aulasAssistidas = aulasAssistidas;
  }

  public void definirTurma(String turma) {
    this.turma = turma;
  }

  public void definirNome(String nome) {
    this.nome = nome;
  }
  
  public void alterarNota(int index, int nota) {
    this.notas[index] = nota;
  }

  public void adicionarNotas(int[] notas) {
    this.notas = notas;
  }

  public void definirMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String retornarNome() {
    return this.nome;
  }

  public Integer retornarAulasAssistidas() {
    return this.aulasAssistidas;
  }

  public String retornarTurma() {
    return this.turma;
  }

  public int retornarMatricula() {
    return this.matricula;
  }

  public int[] notas() {
    return this.notas;
  }

  public int somarNotas() {
    int response = 0;

    for (int i = 0; i < this.notas().length; i++) {
      response += this.notas()[i];
    }

    return response;
  }

  // public Double retornarDesempenho() {
  //   double soma = (double) this.somarNotas();
  //   return ((soma * PESO_NOTA) + (this.retornarAulasAssistidas() * PESO_FREQUENCIA)) / (PESO_NOTA + PESO_FREQUENCIA);
  // }

  

  
}
