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

        // Creăm un tablou pentru notele insuficiente
        int[] failingGrades = new int[count];
        int index = 0;
        for (int grade : grades) {
            if (grade < 40) {
                failingGrades[index++] = grade;
            }
        }
        return failingGrades;
    }

}