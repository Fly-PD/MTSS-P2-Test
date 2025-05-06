////////////////////////////////////////////////////////////////////
// [Filippo] [Panighello] [2111016]
// [Riccardo] [Manisi] [????]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void uno() {
        assertEquals("I", IntegerToRoman.convert(1));
    }
    
    @Test
    public void due() {
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    public void tre() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void quattro() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }
  



}
