package nyc.c4q.ramonaharrison;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student ramona = new Student("Ramona", "Harrison", 1, "sushi");
        Student leigh = new Student("Leigh", "Douglas", 2, "sushi");

        System.out.println(Student.checkSameFavoriteFood(ramona, leigh));

    }
}
