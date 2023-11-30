import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class getChocTest {
    //Test path:[1,2]
    @Test
    public void ChocTestPath1() {
        StringBuffer choc = new StringBuffer ("xx");
        vendingMachine v = new vendingMachine ();
        v.addChoc ("c1");
        v.addChoc ("c2");
        v.addChoc ("c2");
        v.addChoc ("c3");
        v.coin(25);
        v.coin(25);
        v.coin(25);

        
        choc.replace (0, choc.length(), "c1"); // choose a specific chocolate
        int change = v.getChoc(choc);
        System.out.println ("Second get, chocolate type: " + choc + ", change: " + change + "\n");
        assertEquals(75, change);
    }
    //Test Path: [1,3,2]
    @Test
    public void ChocTestPath2() {
        StringBuffer choc = new StringBuffer ("xx");
        vendingMachine v = new vendingMachine ();
        v.addChoc ("c2");
        v.addChoc ("c2");
        v.addChoc ("c3");
        v.coin(100);

        
        choc.replace (0, choc.length(), "c1"); // choose a specific chocolate
        int change = v.getChoc(choc);
        System.out.println ("Second get, chocolate type: " + choc + ", change: " + change + "\n");
        assertEquals(100, change);
    }
    //Test Path: [1,3,4]
    @Test
    public void ChocTestPath3() {
        StringBuffer choc = new StringBuffer ("xx");
        vendingMachine v = new vendingMachine ();
        v.addChoc ("c1");
        v.addChoc ("c2");
        v.addChoc ("c2");
        v.addChoc ("c3");
        v.coin(100);

        
        choc.replace (0, choc.length(), "c1"); // choose a specific chocolate
        int change = v.getChoc(choc);
        System.out.println ("Second get, chocolate type: " + choc + ", change: " + change + "\n");
        assertEquals(10, change);
    }
}
