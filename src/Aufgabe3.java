public class Aufgabe3 {

    // 1.Calcularea sumei a doua numere mari
    public int[] add_big_numbers(int[] num1, int[] num2) {
        int[] result = new int[num1.length + 1];// Cream un array de rezultat care poate avea o cifra in plus in cazul unui carry
        int carry = 0; // Variabila pt cand suma depaseste 9

        // Incepem de la ultima cifra a numerelor
        for (int i = num1.length - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry; // Adunam cifrele curente si carry-ul
            result[i + 1] = sum % 10; // Stocam cifra unitatilor in rezultat
            carry = sum / 10; // Calculam daca exista carry
        }

        // Stocam carry-ul ramas pe prima poz a rezultatului
        result[0] = carry;

        // Daca nu a ramas niciun carry returnam array-ul fara prima poz
        if (result[0] == 0) {
            int[] finalResult = new int[num1.length];
            System.arraycopy(result, 1, finalResult, 0, num1.length); // Copiem elementele
            return finalResult; // Returnam rezultatul fara cifra suplimentara
        }

        return result; // Returnam rezultatul complet cu carry daca exista
    }
}
