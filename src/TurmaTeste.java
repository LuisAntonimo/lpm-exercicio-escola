import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TurmaTeste {
  
  Turma turma;

  @BeforeEach
  public void setup() {
    turma = new Turma();

    turma.definirDia("qua");
    turma.definirTurno("M");
    turma.definirAtividades(4);
  }

  @Test
  public void retornarDiaDaSemana() {
    assertEquals("qua", turma.diaDaSemana());
  }

}
