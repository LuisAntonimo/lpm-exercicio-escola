import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TurmaTeste {
  
  Turma turma;

  @BeforeEach
  public void setup() {
    turma = new Turma(1, 4, "M");
  }

  @Test
  public void verificarDadosDoConstructor() {
    assertEquals(1, turma.nivelDaTurma());
    assertEquals(4, turma.diaDaSemana());
    assertEquals("M", turma.turnoDaTurma());
  }

  @Test
  public void verificarConstructor() {
    turma = new Turma();
    assertEquals(0, turma.nivelDaTurma());
    assertEquals(0, turma.diaDaSemana());
    assertEquals("", turma.turnoDaTurma());
  }

  @Test
  public void retornarCodigoDaTurma() {
    assertEquals("14M", turma.codigo());
  }

}
