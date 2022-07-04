import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netologe.Calculator;

class CalculatorTest {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    @Test
    public void plus() {
        Calculator calculator = new Calculator();
        int x = 5, y = 5, result = 10;
        int plus = calculator.plus.apply(x, y);
        if (plus != result) {
            System.out.println(ANSI_RED + "Fails " + ANSI_RED);
        }
        Assertions.assertEquals(result, plus);
        System.out.println(ANSI_GREEN + "Passed" + ANSI_GREEN);
    }
}
