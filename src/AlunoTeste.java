import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoTeste {

  Aluno fulano;

  @BeforeEach
  public void setup() {
    fulano = new Aluno();
  }

  @Test
  public void testarConstructor() {
    assertEquals("Fulano", fulano.retornarNome());
    assertEquals("", fulano.retornarTurma());
    assertEquals(0, fulano.retornarAulasAssistidas());
  }

  @Test
  public void testarConstructorComParametros() {
    fulano = new Aluno("Luís", "15N", 18, new int[] {23, 21, 15, 23});

    assertEquals("Luís", fulano.retornarNome());
    assertEquals("15N", fulano.retornarTurma());
    assertEquals(18, fulano.retornarAulasAssistidas());
  }

  @Test
  public void adicionarNotasDoAluno() {
    assertArrayEquals(new int[] {23, 21, 15, 23}, fulano.notas());
  }

  @Test
  public void testarAlterarNota() {
    fulano.alterarNota(2, 18);
    assertArrayEquals(new int[] {23, 21, 18, 23}, fulano.notas());
  }

  @Test
  public void testarSomarNotas() {
    assertEquals(82, fulano.somarNotas());
  }  

}
