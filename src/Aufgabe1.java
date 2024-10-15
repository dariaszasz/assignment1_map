public class Aufgabe1{
    private int[] grades;

    // Constructor
    public Aufgabe1(int[] grades) {
        this.grades = grades;
    }

    // 1. Metoda pentru notele insuficiente (sub 40)
    public int[] getFailingGrades() {
        // Calculăm numărul de note insuficiente
        int count = 0;
        for (int grade : grades) {
            if (grade < 40) {
                count++;
            }
        }

        // Cream un tablou pt notele insuficiente
        int[] failingGrades = new int[count];
        int index = 0;
        for (int grade : grades) {
            if (grade < 40) {
                failingGrades[index++] = grade;
            }
        }
        return failingGrades;
    }

    // 2. Metoda pt calcularea mediei
    public double medie() {
        if (grades.length == 0) {// Verificam daca array-ul de note este gol
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;// Adaugam fiecare nota la variabila sum
        }
        return Math.round((double) sum / grades.length * 100.0) / 100.0;
        // Calculam media aritmetică prin impartirea sumei notelor la nrl total de note
        // Convertim suma la tipul double
        // Math.round() rotunjește rezultatul la 2 zecimale (multiplicam si impartim cu 100.0)
    }

    // 3. Metoda pt obținerea notelor rotunjite
    public int[] rotunjire() {
        int[] roundedGrades = new int[grades.length];// Crearea unui nou array pt a stoca notele rotunjite
        for (int i = 0; i < grades.length; i++) {// Parcurgem fiecare nota din array-ul original
            int grade = grades[i];// Extragem nota curenta
            // Verificam daca nota poate fi rotunjita
            if (grade >= 38 && (grade % 5) >= 3) {// nota trebuie să fie de cel puțin 38
                                                    //diferenta dintre nota curenta si urm multiplu de 5 trb să fie mai micam de 3

                // Daca ambele conditii sunt indeplinite rotunjim nota la urm multiplu de 5
                // Calculam urm multiplu de 5 prin adaugarea diferentei
                roundedGrades[i] = grade + (5 - grade % 5);
            } else {
                roundedGrades[i] = grade;// Daca nu se indeplinesc conditiile se pastreaza nota originala
            }
        }
        return roundedGrades;
    }



}