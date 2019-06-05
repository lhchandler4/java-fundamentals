package inheritance;

import java.util.*;

public class Theatre {
    private String name;
    private LinkedList<String> movies;
    private ArrayList<Review> reviews;
    private int cummulReviews;
    private double cummulStars;
    private double avgRating;

    public Theatre(String name, LinkedList movies){
        this.name = name;
        this.movies = movies;
        this.reviews = new ArrayList<>();
        this.cummulReviews = 0;
        this.cummulStars = 0;
        this.avgRating = 0;
    }

    public void addMovie(String movie){
        this.movies.add(movie);
    }

    public void removeMovie(String movie){
        this.movies.remove(movie);
    }

    public String getName() {
        return name;
    }

    public int getCummulReviews() {
        return cummulReviews;
    }

    public double getCummulStars() {
        return cummulStars;
    }

    public void addReview(Review review){
        if(review.getBusiness().equals(this.getName())) {
            this.reviews.add(review);
            this.cummulReviews = getCummulReviews() + 1;
            double currentRating = review.getNumberOfStarsR();
            this.cummulStars = getCummulStars() + currentRating;
            this.avgRating = getCummulStars() / getCummulReviews();
        }else {
            System.out.println("Shops are not a match");
        }
    }

    public String toString() {
        return String.format("A theatre named %s has a review average of %.1f out of %d reviews. This theatre is showing ", this.name, this.avgRating, this.cummulReviews, Arrays.toString(this.movies.toArray()));
    }
}
