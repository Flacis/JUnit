import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netologe.DayInYear;

public class DayInYearTest {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    @Test
    public void DayInYearTest() {

        DayInYear diy = new DayInYear();
        int y = 2005, result = 365;
        int result1 = DayInYear.qtyDaysInYear(y);

        if (result1 != result) {
            System.out.println(ANSI_RED + "Fails " + ANSI_RED);
        }

        Assertions.assertEquals(result1, result);
        System.out.println(ANSI_GREEN + "Passed" + ANSI_GREEN);
    }
}