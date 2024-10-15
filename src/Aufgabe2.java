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



}
