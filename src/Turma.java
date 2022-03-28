import java.util.ArrayList;
public class Turma {
  private static final int MAXIMO_DE_ALUNOS = 20;
  private static final int NUMERO_DE_ATIVIDADES = 4;
  private static final int TOTAL_DE_PONTOS = 100;
  private static final int NUMERO_DE_AULAS = 20;
  private static final int NOTA_MAXIMA = 25;
  private static final int PESO_NOTA = 8;
  private static final int PESO_FREQUENCIA = 2;

  private static int contador = 0;

  private int nivel, diaDaSemana, matriculas;
  private String turno, codigoTurma;

  private ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();

  Turma() {
    this.setup(0, 0, "");
  }

  Turma(int nivel, int diaDaSemana, String turno) {
    this.setup(nivel, diaDaSemana, turno);
  }

  private void setup(int nivel, int diaDaSemana, String turno) {
    this.definirNivel(nivel);
    this.definirDia(diaDaSemana);
    this.definirTurno(turno);
    this.definirCodigo();
  }

  private void definirCodigo() {
    this.codigoTurma = Integer.toString(this.nivelDaTurma()) + this.diaDaSemana() + this.turnoDaTurma();
  }

  public void definirNivel(int nivel) {
    this.nivel = nivel;
  }

  public void definirDia(int dia) {
    this.diaDaSemana = dia;
  }

  public void definirTurno(String turno) {
    this.turno = turno;
  }

  public int nivelDaTurma() {
    return this.nivel;
  }

  public int diaDaSemana() {
    return this.diaDaSemana;
  }

  public String turnoDaTurma() {
    return this.turno;
  }

  public String codigo() {
    return this.codigoTurma;
  }

  public int retornarNumeroDeAlunos() {
    return this.matriculas;
  }

  public void adicionarAluno(String nome, int frequencia, int[] notas) {
    this.adicionarMatricula();
    
    if (this.validarNotas(notas) && this.validarFrequencia(frequencia)) {
      Aluno novoAluno = new Aluno(nome, this.codigo(), frequencia,  notas, this.retornarNumeroDeAlunos());

      listaDeAlunos.add(novoAluno);
    } else {
      System.out.println("Não foi possível adicionar o aluno. Dados inválidos");
    }
  }

  private boolean validarFrequencia(int frequencia) {
    return frequencia <= NUMERO_DE_AULAS;
  }

  private boolean validarNotas(int[] notas) {
    boolean response = true;
    int soma = 0;
    for (int i = 0; i < NUMERO_DE_ATIVIDADES; i++) {
      if (!this.verificarNota(notas[i])) {
        response = false;
      }
      soma += notas[i];
    }

    if (!verificarSomaDeNotas(soma)) {
      response = false;
    }

    return response;
  }

  private boolean verificarSomaDeNotas(int soma) {
    return soma <= TOTAL_DE_PONTOS;
  }

  private boolean verificarNota(int nota) {
    return nota <= NOTA_MAXIMA;
  }

  private void adicionarMatricula() {
    if (this.matriculas <= MAXIMO_DE_ALUNOS) {
      contador++;

      this.matriculas = contador;
    }
  }

  public void exibirRelatorio() {
    for (Aluno aluno : listaDeAlunos) {
      System.out.println(aluno.retornarNome() + " | " + aluno.retornarMatricula());
    }
  }
  
}
