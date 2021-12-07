package java;

import com.example.entity.Player;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    private Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player();
    }

    @After
    public void tearDown() throws Exception {
        player = null;
    }

    @Test
    public void setThrusting() {
        player.setThrusting(true);
        assertTrue(player.getThrusting());
    }

    @Test
    public void setRotateLeft() {
        player.setRotateLeft(true);
        assertTrue(player.getRotateLeft());
    }

    @Test
    public void setRotateRight() {
        player.setRotateRight(true);
        assertTrue(player.getRotateRight());
    }

    @Test
    public void setFiring() {
        player.setFiring(true);
        assertTrue(player.getFiring());
    }

    @Test
    public void setFiringEnabled() {
        player.setFiringEnabled(false);
        assertFalse(player.getFiringEnabled());
    }
}