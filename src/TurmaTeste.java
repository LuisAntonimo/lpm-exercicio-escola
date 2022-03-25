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

}
