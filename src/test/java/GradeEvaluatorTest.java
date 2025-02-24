import org.example.GradeEvaluator;
import org.example.Student;
import org.junit.Test;


import static org.junit.Assert.*;

public class GradeEvaluatorTest {

    @Test
    public void shouldReturnExcelenteForGradesBetween90and100() {
        assertEquals("Excelente", GradeEvaluator.eval(new Student("Adrian", 100)));
        assertEquals("Excelente", GradeEvaluator.eval(new Student("Bruno", 95)));
        assertEquals("Excelente", GradeEvaluator.eval(new Student("Carlos", 90)));
    }
    @Test
    public void shouldReturnBomForGradesBetween75and89() {
        assertEquals("Bom", GradeEvaluator.eval(new Student("Daniel", 89)));
        assertEquals("Bom", GradeEvaluator.eval(new Student("Ester", 80)));
        assertEquals("Bom", GradeEvaluator.eval(new Student("Fabio", 75)));
    }
    @Test
    public void shouldReturnRegularForGradesBetween50and74() {
        assertEquals("Regular", GradeEvaluator.eval(new Student("Gabriel", 74)));
        assertEquals("Regular", GradeEvaluator.eval(new Student("Heitor", 70)));
        assertEquals("Regular", GradeEvaluator.eval(new Student("Isaias", 50)));
    }
    @Test
    public void shouldReturnInsuficienteForGradesBetween30And49() {
        assertEquals("Insuficiente", GradeEvaluator.eval(new Student("Julio", 49)));
        assertEquals("Insuficiente", GradeEvaluator.eval(new Student("Kaiane", 35)));
        assertEquals("Insuficiente", GradeEvaluator.eval(new Student("Lucas", 30)));
    }
    @Test
    public void shouldReturnReprovadoForGradesBelow30() {
        assertEquals("Reprovado", GradeEvaluator.eval(new Student("Marcos", 29)));
        assertEquals("Reprovado", GradeEvaluator.eval(new Student("Natan", 15)));
    }
}
