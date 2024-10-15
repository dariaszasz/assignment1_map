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

    // 2.Metoda pt a gasi cel mai scump obiect(tastatura sau USB)
    public int expensive_obiect(int[] keyboards, int[] usbDrives) {
        int maxPrice = keyboards[0];// Presupunem ca prima tastatura este cea mai scumpa
        // Parcurgem lista de tastaturi pt a gasi cea mai scumpa
        for (int price : keyboards) {
            if (price > maxPrice) {
                maxPrice = price; // Actualizam daca gasim o tastatura mai scumpă
            }
        }
        // Parcurgem lista de USB-uri pt a vedea daca este unul mai scump decat cea mai scumpa tastatura gasita
        for (int price : usbDrives) {
            if (price > maxPrice) {
                maxPrice = price; // Actualizam dacă gasim un USB mai scump
            }
        }
        return maxPrice;
    }

    // 3.Metoda pt a gasi cel mai scump USB pe care Markus il poate cumpara in functie de buget
    public int buget_USB(int[] usbDrives, int budget) {
        int maxPrice = -1;// Initial presupunem ca nu poate cumpara nimic
        // Parcurgem lista de USB-uri pt a gasi cel mai scump care se incadrează in buget
        for (int price : usbDrives) {

            if (price <= budget && price > maxPrice) {// Daca pretul este in buget si mai mare decat prețul maxim actual actualizam
                maxPrice = price;
            }
        }
        return maxPrice;
    }
}
