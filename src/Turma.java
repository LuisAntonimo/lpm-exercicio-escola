public class Turma {
  private int nivel, diaDaSemana, aulasMinistradas, pontosPorProva;
  private String turno;


  Turma(int nivel, int diaDaSemana, String turno) {
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
