package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private double numberOfStars;
    private String priceCategory;

    private ArrayList<Review> reviews;
    private int cummulReviews;
    private double cummulStars;
    private double avgRating;

    public Restaurant(String name, double avgRating, String priceCategory) {
        this.name = name;
        this.numberOfStars = numberOfStars;
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
        this.cummulReviews = 0;
        this.cummulStars = 0;
        this.avgRating = 0;
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

    public double getNumberOfStars() {
        return numberOfStars;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void addReview(Review review){
        if(review.getRestaurant() == this.getName()) {
            this.reviews.add(review);
            this.cummulReviews = getCummulReviews() + 1;
            double currentRating = review.getNumberOfStarsR();
            this.cummulStars = getCummulStars() + currentRating;
            this.avgRating = getCummulStars() / getCummulReviews();
        }else {
            System.out.println("Restaurants are not a match");
        }
    }

    public String toString() {
        return String.format("A restaurant named %s has a review average of %.1f out of %d reviews and is in the %s price range", this.name, this.avgRating, this.cummulReviews, this.priceCategory);
    }

}
