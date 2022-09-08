import java.text.Normalizer;

public class PalindromoMejorado {

    /*
        Definición de palíndromo
        Un palíndromo es una palabra, verso, sentencia,
        o número que se lee igual al revés y al derecho
        https://www.merriam-webster.com/dictionary/palindrome
     */

    public static boolean esPalindromo(String cadena) {
        if (cadena.isBlank()) {
            return false;
        }
        cadena = Normalizer.normalize(cadena, Normalizer.Form.NFD)
                .replaceAll("\\p{M}|/|\\:|-|\\s", "")
                .toLowerCase();
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
        return cadenaInvertida.equals(cadena);
    }
}