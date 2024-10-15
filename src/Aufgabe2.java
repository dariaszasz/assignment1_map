public class Aufgabe2 {
    private int[] numbers;

    // Constructor
    public Aufgabe2(int[] numbers) {
        this.numbers = numbers;
    }

    // 1.Metoda pentru gasirea numarului maxim
    public int max_nr() {
        int max = numbers[0]; // se alege primul numar ca fiind maximul
        for (int num : numbers) {
            if (num > max) {// Daca nr curent este mai mare decat valoarea curenta a lui max
                max = num;// Actualizam valoarea lui max cu nr curent
            }
        }
        return max;
    }

    // 2.Metoda pt gasirea numarului minim
    public int min_nr() {
        int min = numbers[0]; // Se alege primul numar ca fiind cel mai mic
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // 3.Metoda pt gasirea sumei maxima a n-1 numere
    public int max_sum() {
        int sum = 0;
        int min = min_nr(); // Gasirea numarului cel mai mic folosind metoda de mai sus

        for (int num : numbers) {
            sum += num;
        }

        // Suma maxima = Suma totala - cel mai mic numar
        return sum - min;
    }

    // 4.Methoda pt calcularea sumei minime a n-1 numere
    public int min_sum() {
        int sum = 0;
        int max = max_nr(); // Gasirea numarului maxim folosind metoda de mai sus

        for (int num : numbers) {
            sum += num;
        }

        // Suma minima = Suma totala - nr maxim
        return sum - max;
    }



}
