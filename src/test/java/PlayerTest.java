import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netologe.Player;

class PlayerTest {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    @Test
    void shotWithWeapon() {
        Player player = new Player();
        int namberGun = 5;
        int result = player.getSlotsCount();
        if (namberGun != result) {
            System.out.println(ANSI_RED + "Fails " + ANSI_RED);
        }
        Assertions.assertSame(namberGun, result);
        System.out.println(ANSI_GREEN + "Passed" + ANSI_GREEN);
    }
}