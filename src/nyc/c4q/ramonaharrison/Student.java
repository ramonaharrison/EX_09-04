package nyc.c4q.ramonaharrison;

/**
 * Created by Ramona Harrison
 * on 9/4/16
 *
 * Build out your Student class to contain private fields for a first name,
 * last name, ID number and favorite food. Create a getter and setter method
 * for each field.
 *
 * Create a constructor for your class.
 *
 * Write a static method called checkSameFavoriteFood which accepts as input
 * two Student instances and checks if they have the same favorite food. The
 * method should return a boolean value.
 *
 */

public class Student {

    private String firstName;

    private String lastName;

    private int id;

    private String favoriteFood;

    public Student(String firstName, String lastName, int id, String favoriteFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.favoriteFood = favoriteFood;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public static boolean checkSameFavoriteFood(Student studentOne, Student studentTwo) {
        return studentOne.getFavoriteFood().equalsIgnoreCase(studentTwo.getFavoriteFood());
    }
}
