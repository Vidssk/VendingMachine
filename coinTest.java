import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class coinTest {


    @Test 
    public void TestPath1()
    {
        StringBuffer choc = new StringBuffer ("xx");
        vendingMachine v = new vendingMachine ();
        v.addChoc ("c1");
        v.addChoc ("c2");
        v.addChoc ("c2");
        v.addChoc ("c4");
        v.addChoc ("c3");
        v.coin(100);
        v.coin(5);
        choc.replace (0, choc.length(), "c1"); // choose a specific chocolate
        int change = v.getChoc(choc);
        System.out.println ("Second get, chocolate type: " + choc + ", change: " + change + "\n");
        assertEquals(10, change);
    }
    @Test
    public void TestPath2()
    {
        StringBuffer choc = new StringBuffer ("xx");
        vendingMachine v = new vendingMachine ();
        v.addChoc ("c1");
        v.addChoc ("c2");
        v.addChoc ("c2");
        v.addChoc ("c4");
        v.addChoc ("c3");
        v.coin(10);
        v.coin(10);
        v.coin(10);
        v.coin(10);
        v.coin(50);
        choc.replace (0, choc.length(), "c1"); // choose a specific chocolate
        int change = v.getChoc(choc);
        System.out.println ("Second get, chocolate type: " + choc + ", change: " + change + "\n");
        assertEquals(0, change);
    }
    @Test
    public void TestPath3()
    {
        StringBuffer choc = new StringBuffer ("xx");
        vendingMachine v = new vendingMachine ();
        v.addChoc ("c1");
        v.addChoc ("c2");
        v.addChoc ("c2");
        v.addChoc ("c4");
        v.addChoc ("c3");
        v.coin(25);
        v.coin(25);
        v.coin(50);
    
        choc.replace (0, choc.length(), "c1"); // choose a specific chocolate
        int change = v.getChoc(choc);
        System.out.println ("Second get, chocolate type: " + choc + ", change: " + change + "\n");
        assertEquals(85, change);
    }
}
