import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {

    @Test
    void esPalindromoTest() {
        assertTrue(Palindromo.esPalindromo("saippuakuppinippukauppias"));
    }

    @Test
    void esPalindromoSiContieneEspacioTest() {
        assertTrue(Palindromo.esPalindromo("sata no scill atemy me tallicso nat as "));
    }
    @Test
    void esPalindromoSiContieneMayusculaTest() {
        assertTrue(Palindromo.esPalindromo("WassamaSsaw"));
    }

    @Test
    void esPalindromoSiContieneNumeroTest() {
        assertTrue(Palindromo.esPalindromo("madam 1881 madam"));
    }

    @Test
    void esPalindromoSiContienePuntuacionTest() {
        assertTrue(Palindromo.esPalindromo("11/11/11 11:11 11/11/11"));
    }

    @Test
    void esPalindromoSiContieneTildeTest() {
        assertTrue(Palindromo.esPalindromo("sabás"));
    }

    @Test
    void esPalindromoFallaTest() {
        assertFalse(Palindromo.esPalindromo("palindromo"));
    }

    @Test
    void esPalindromoFallaSiEsVacioTest() {
        assertFalse(Palindromo.esPalindromo(""));
    }

    @Test
    void esPalindromoFallaSiEsBlancoTest() {
        assertFalse(Palindromo.esPalindromo("    \n  "));
    }
}