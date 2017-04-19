package setup.test;

import org.junit.Test;
import org.junit.Assert;
import setup.Hookup;
import static org.mockito.Mockito.mock;

public class HookupTest {

    @Test
    public void isThisWorking() throws Exception {
        Hookup h =  mock(Hookup.class);
        Assert.assertTrue(h instanceof Hookup);
    }
}
