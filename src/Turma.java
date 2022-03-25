public class Turma {
  static final int MAXIMO_DE_ALUNOS = 20;
  static final int NUMERO_DE_ATIVIDADES = 4;
  static final int TOTAL_DE_PONTOS = 100;
  static final int NUMERO_DE_AULAS = 20;
  private int nivel, diaDaSemana;
  private String turno;

  Turma() {
    this.setup(0, 0, " ");
  }

  Turma(int nivel, int diaDaSemana, String turno) {
    this.setup(nivel, diaDaSemana, turno);
  }

  private void setup(int nivel, int diaDaSemana, String turno) {
    this.definirNivel(nivel);
    this.definirDia(diaDaSemana);
    this.definirTurno(turno);
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
  
}
