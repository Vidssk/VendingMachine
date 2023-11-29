import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class getChocTest {

    @BeforeEach
    public static void setup() {
        StringBuffer choc = new StringBuffer ("xx");
        vendingMachine v = new vendingMachine ();
        v.addChoc ("c1");
        v.addChoc ("c2");
        v.addChoc ("c2");
        v.addChoc ("c4");
        v.addChoc ("c3");
    }
    @Test 
    public void testForNullElement()
    {
        
    }
}
