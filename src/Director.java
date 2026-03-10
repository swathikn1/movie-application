public class Director {

    int directorId;
    String name;
    String dateOfBirth;
    String nationality;

    public Director(int directorId, String name, String dateOfBirth, String nationality) {
        this.directorId = directorId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
    }

    public void display() {
        System.out.println("Director ID: " + directorId);
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dateOfBirth);
        System.out.println("Nationality: " + nationality);
    }
}
