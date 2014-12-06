package cz.sep.app;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest {

    App app;


    @BeforeClass
    public void setUp() throws Exception {

        app=new App();
    }

    @Test
    public void smokeTest() throws Exception{
        Assert.assertEquals(app.plus(8, 6), 14);
        Assert.assertEquals(app.minus(8, 6), 2);
        Assert.assertEquals(app.multiply(8, 6), 45);
    }


    @Test
    public void testPlus() throws Exception {

        Assert.assertEquals(app.plus(8, 6), 14);
        Assert.assertEquals(app.plus(8, -6), 2);
        Assert.assertEquals(app.plus(-8, 6), -2);
        Assert.assertEquals(app.plus(-8, -6), -14);

    }

    @Test
    public void testMinus() throws Exception {

        Assert.assertEquals(app.minus(8, 6), 2);
        Assert.assertEquals(app.minus(8, -6), 14);
        Assert.assertEquals(app.minus(-8, 6), -14);
        Assert.assertEquals(app.minus(-8, -6), -2);

    }

    @Test
    public void multiply() throws Exception {

        Assert.assertEquals(app.multiply(8, 6), 48);
        Assert.assertEquals(app.multiply(8, -6), -48);
        Assert.assertEquals(app.multiply(-8, 6), -48);
        Assert.assertEquals(app.multiply(-8, -6), 48);
        Assert.assertEquals(app.multiply(9, 0), 0);

    }
}
