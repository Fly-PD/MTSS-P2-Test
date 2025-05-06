////////////////////////////////////////////////////////////////////
// [Filippo] [Panighello] [2111016]
// [Riccardo] [Manisi] [2111948]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void uno() {
        //arrange
        int input = 1;
        
        //act 
        String result = IntegerToRoman.convert(input);

        //assert
        assertEquals("I", result);
    }
    
    @Test
    public void due() {
        //arrange
        int input = 2;
        
        //act 
        String result = IntegerToRoman.convert(input);

        //assert
        assertEquals("II", result);
    }

    @Test
    public void tre() {
        //arrange
        int input = 3;
        //act
        String result = IntegerToRoman.convert(input);
        //assert
        assertEquals("III", result);    
    }

}
