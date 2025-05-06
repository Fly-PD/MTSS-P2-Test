////////////////////////////////////////////////////////////////////
// [Filippo] [Panighello] [2111016]
// [Riccardo] [Manisi] [????]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;


public class App 
{
    public static void main( String[] args ) {
        // Controllo della validità degli argomenti
        if ( args.length != 1 ) {
            System.out.println( "Usage: java -jar roman-number.jar <number>" );
            System.exit( 1 );
        }
        int number = 0;
        try {
            number = Integer.parseInt( args[0] );
            if ( number < 1 || number > 1000 ) {
                System.out.println( "Il numero deve essere compreso fra 1 e 1000" );
                System.exit( 1 );
            }
        } catch ( NumberFormatException e ) {
            System.out.println( "Il numero deve essere un intero compreso fra 1 e 1000" );
            System.exit( 1 );
        }

        // Conversione e stampa dell'asciiArt del numero romano
        String output = RomanPrinter.print( number );
        System.out.println( output );
    }
}
