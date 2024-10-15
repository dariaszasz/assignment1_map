public class Aufgabe4 {

    // 1.Metoda pt a gasi cea mai ieftina tastatura
    public int cheap(int[] keyboards) {
        int minPrice = keyboards[0];// Presupunem ca prima tastatura este cea mai ieftina
        for (int price : keyboards) {
            if (price < minPrice) {// Daca gasim o tastatura mai ieftina actualizam valoarea
                minPrice = price;
            }
        }
        return minPrice;
    }
}
