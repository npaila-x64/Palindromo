import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoMejoradoTest {

    @Test
    void esPalindromoTest() {
        assertTrue(PalindromoMejorado.esPalindromo("saippuakuppinippukauppias"));
    }

    @Test
    void esPalindromoSiContieneEspacioTest() {
        assertTrue(PalindromoMejorado.esPalindromo("sata no scill atemy me tallicso nat as "));
    }

    @Test
    void esPalindromoSiContieneMayusculaTest() {
        assertTrue(PalindromoMejorado.esPalindromo("WassamaSsaw"));
    }

    @Test
    void esPalindromoSiContieneNumeroTest() {
        assertTrue(PalindromoMejorado.esPalindromo("madam 1881 madam"));
    }

    @Test
    void esPalindromoSiContienePuntuacionTest() {
        assertTrue(PalindromoMejorado.esPalindromo("11/11/11 11:11 11/11/11"));
    }

    @Test
    void esPalindromoSiContieneTildeTest() {
        assertTrue(PalindromoMejorado.esPalindromo("sabás"));
    }

    @Test
    void esPalindromoFallaTest() {
        assertFalse(PalindromoMejorado.esPalindromo("palindromo"));
    }

    @Test
    void esPalindromoFallaSiEsVacioTest() {
        assertFalse(PalindromoMejorado.esPalindromo(""));
    }

    @Test
    void esPalindromoFallaSiEsBlancoTest() {
        assertFalse(PalindromoMejorado.esPalindromo("    \n  "));
    }
}