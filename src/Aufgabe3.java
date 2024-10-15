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

    // 2.Calcularea diferentei a doua numere mari
    public int[] diff_big_numbers(int[] num1, int[] num2) {
        int[] result = new int[num1.length];// Cream un array pentru rezultat
        int borrow = 0; // Variabila pt imprumut

        // Incepem de la ultima cifra
        for (int i = num1.length - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - borrow; // Scadem cifra curenta si imprumutul
            if (diff < 0) { // Daca diferenta este negativa
                diff += 10; // Adaugam 10 pt a imprumuta de la urm cifra
                borrow = 1; // Setam imprumutul la 1
            } else {
                borrow = 0; // Resetam imprumutul daca diferenta nu e negativa
            }
            result[i] = diff; // Stocam diferenta calculata
        }

        return result;
    }

    // 3.Inmultirea unui numar mare cu o cifra
    public int[] multiply_big_numbers(int[] num1, int multiplier) {
        int[] result = new int[num1.length + 1];// Cream un array de rezultat care poate avea o cifra in plus din cauza carry-ului
        int carry = 0; // Variabila pt transport

        // Incepem de la ultima cifra a numarului
        for (int i = num1.length - 1; i >= 0; i--) {
            int product = num1[i] * multiplier + carry; // Inmultim cifra curenta si adaugam carry-ul
            result[i + 1] = product % 10; // Stocam cifra unitatilor
            carry = product / 10; // Calculam carry-ul
        }

        result[0] = carry;// Stocam transportul ramas pe prima poz

        // Daca nu avem transport returnam array-ul fara prima poz
        if (result[0] == 0) {
            int[] finalResult = new int[num1.length];
            System.arraycopy(result, 1, finalResult, 0, num1.length); // Copiem datele
            return finalResult; // Returnam rezultatul fara cifra suplimentara
        }

        return result;
    }

    // 4.Impartirea unui numar mare la o cifra
    public int[] divide_big_numbers(int[] num1, int divisor) {
        int[] result = new int[num1.length];// Cream un array pt rezultat
        int remainder = 0; // Variabila pt restul impartirii

        // Incepem de la prima cifra
        for (int i = 0; i < num1.length; i++) {
            // Calculam cifra curenta tinand cont de restul anterior
            int current = remainder * 10 + num1[i];
            result[i] = current / divisor; // Stocam catul impartirii
            remainder = current % divisor; // Calculam noul rest
        }

        return result;
    }


}
