/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anthony
 */
public class ChangeTest {
    /**
     * Test of getIdCounter method, of class Change.
     * idCounter starts at 1, and is incremented by one in the method
     */
    @Test
    public void testGetIdCounter() {
        System.out.println("getIdCounter");
        int expResult = 2;
        int result = Change.getIdCounter();
        assertEquals(expResult, result);
    }
}
