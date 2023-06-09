package demo.TH3.test;

import demo.TH3.Cylinder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CylinderTest {
    @Test
    @DisplayName("testing getVolume(0,0)")
    void testGetVolume0And0(){
        int radius = 0;
        int height = 0;
        double expected = 0;
        double result = Cylinder.getVolume(radius,height);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("testing getVolume(1,2)")
    void testGetVolume1And2(){
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;
        double result = Cylinder.getVolume(radius,height);
        assertEquals(expected,result);
    }
}
