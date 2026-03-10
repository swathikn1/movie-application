public class Actor {
    int actorId;
    String name;
    String dateOfBirth;
    String nationality;

    public Actor(int actorId, String name, String dateOfBirth, String nationality) {
        this.actorId = actorId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
    }

    public void display() {
        System.out.println("Actor ID: " + actorId);
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dateOfBirth);
        System.out.println("Nationality: " + nationality);
    }
}