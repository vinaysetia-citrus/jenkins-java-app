import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void addTest( ){
        int answer = Main.add( 30, 43 );
        Assert.assertEquals( answer, 73 );
    }

    @Test
    public void multipleTest( ){
        int answer = Main.multiple( 20, 10 );
        Assert.assertEquals( answer, 200 );
    }

    @Test
    public void divideTest( ){
        int answer = Main.divide( 20, 10 );
        Assert.assertEquals( answer, 2 );
    }

}