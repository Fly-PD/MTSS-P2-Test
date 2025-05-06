////////////////////////////////////////////////////////////////////
// [Filippo] [Panighello] [2111016]
// [Riccardo] [Manisi] [????]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        String result = "";
        while( number != 0 ) {
            result += "I";
            number--;
        }
        return result;
    }
}