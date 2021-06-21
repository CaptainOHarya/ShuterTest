import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestWeapon {


    @Test
    public void testGetSlotsCount() {
        Player player = new Player();
        int expected = player.getSlotsCount();
        int actual = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShotWithWeaponTrue() {
        Player player = new Player();
        String expected = player.shotWithWeapon(2);
        String actual = "Бух-бух";
        Assert.assertSame(expected, actual);
    }

    @Test
    public void testShotWithWeaponFalse() {
        Player player = new Player();
        String expected = player.shotWithWeapon(1);
        String actual = "Пив-пав";
        Assert.assertNotSame(expected, actual);
    }

}
