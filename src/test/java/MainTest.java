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
        int answer = Main.add( 20, 10 );
        Assert.assertEquals( answer, 200 );
    }

}