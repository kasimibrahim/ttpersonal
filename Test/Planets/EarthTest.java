package Planets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EarthTest {

    @Test
    public void testSingletonEarth(){
        Assert.assertEquals(Earth.getInstance(), Earth.getInstance());
    }

}