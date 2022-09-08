public class Palindromo {

    /*
        Definición de palíndromo
        Un palíndromo es una palabra, verso, sentencia,
        o número que se lee igual al revés y al derecho
        https://www.merriam-webster.com/dictionary/palindrome
     */

    public static boolean esPalindromo(String cadena) {
        String resultado = new StringBuilder(cadena).reverse().toString();
        return resultado.equals(cadena);
    }
}