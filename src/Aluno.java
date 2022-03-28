public class Aluno {
  static final int NOTA_MAXIMA = 25;
  static final int PESO_NOTA = 8;
  static final int PESO_FREQUENCIA = 2;

  private String nome, turma;
  private int aulasAssistidas;
  double desempenho;
  private int[] notas = new int[4];

  Aluno() {
    this.setup("Fulano", "", 0, new int[] {0, 0, 0, 0});
  }

  public Aluno(String nome, String turma, int aulasAssistidas, int[] notas) {
    this.setup(nome, turma, aulasAssistidas, notas);
  }

  private void setup(String nome, String turma, int aulasAssistidas, int[] notas) {
    this.definirNome(nome);
    this.definirTurma(turma);
    this.definirAulasAssistidas(aulasAssistidas);
    this.adicionarNotas(notas);
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

  public String retornarNome() {
    return this.nome;
  }

  public Integer retornarAulasAssistidas() {
    return this.aulasAssistidas;
  }

  public String retornarTurma() {
    return this.turma;
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
