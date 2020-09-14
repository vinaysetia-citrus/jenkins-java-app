import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void addTest( ){
        int answer = Main.add( 30, 43 );
        Assert.assertEquals( answer, 73 );
    }

}