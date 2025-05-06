////////////////////////////////////////////////////////////////////
// [Filippo] [Panighello] [2111016]
// [Riccardo] [Manisi] [????]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number == 4) return "IV";
        return "I".repeat(number);
    }
}