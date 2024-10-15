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

    // 4.Metoda pt a gasi suma maxima pe care Markus o poate cheltui pe o tastatura si un USB
    public int buget_max(int[] keyboards, int[] usbDrives, int budget) {
        int maxSpent = -1;// Initial presupunem ca nu poate cumpara nimic

        // Parcurgem toate combinatiile de tastaturi si USB-uri
        for (int keyboardPrice : keyboards) {
            for (int usbPrice : usbDrives) {
                // Calculam suma totala pentru o tastatura și un USB
                int total = keyboardPrice + usbPrice;
                if (total <= budget && total > maxSpent) {// Daca suma totala este in buget si mai mare decat suma maxima actuala o actualizam
                    maxSpent = total;
                }
            }
        }
        return maxSpent;
    }

    // Testare metode
    public static void main(String[] args) {
        Aufgabe4 shopping = new Aufgabe4();

        int[] keyboards1 = {40, 35, 70, 15, 45};
        int[] keyboards2 = {15, 20, 10, 35};
        int[] usbDrives = {20, 15, 40, 15};
        int[] prices = {15, 45, 20};
        int[] keyboards3 = {40, 50, 60};
        int[] usbDrives3 = {8, 12};

        int budget1 = 30;
        int budget2 = 60;

        // 1.Gasim cea mai ieftina tastatura
        System.out.println("Cea mai ieftina tastatura: " + shopping.cheap(keyboards1));

        // 2.Gasim cel mai scump obiect dintre tastaturi si USB-uri
        System.out.println("Cel mai scump obiect: " + shopping.expensive_obiect(keyboards2, usbDrives));

        // 3.Gasim cel mai scump USB pe care Markus il poate cumpara in functie de buget
        System.out.println("Cel mai scump USB in buget: " + shopping.buget_USB(prices, budget1));

        // 4.Gasim suma maxima pe care Markus o poate cheltui pe o tastatura si un USB
        System.out.println("Suma maxima cheltuita: " + shopping.buget_max(keyboards3, usbDrives3, budget2));
    }

}
