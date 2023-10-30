import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;
    @Before
    public void before(){

        waterBottle = new WaterBottle(100);
    }

    @Test
    public void getVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkFunction(){
        assertEquals(90, waterBottle.drinkFunction());
    }

    @Test
    public void bigGulp(){
        assertEquals(0, waterBottle.bigGulp());
    }

    @Test
    public void fillUp(){
        assertEquals(100, waterBottle.fillUp());
    }
}






