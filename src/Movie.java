import java.util.List;

public class Movie {
    int movieId;
    String title;
    int releaseYear;
    double rating;
    int duration;
    int directorId;
    List<Integer> actorIds;

    public Movie(int movieId,String title,int releaseYear,double rating,int duration,int durationId,List<Integer>actorIds){
        this.movieId=movieId;
        this.title=title;
        this.releaseYear=releaseYear;
        this.rating=rating;
        this.duration=duration;
        this.directorId=durationId;
        this.actorIds=actorIds;
    }

    public void display() {
        System.out.println("Movie ID: " + movieId);
        System.out.println("Title: " + title);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Duration: " + duration);
        System.out.println("Director ID: " + directorId);
        System.out.println("Actor IDs: " + actorIds);
    }
}
