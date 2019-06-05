package inheritance;

import java.util.*;

public class Shop {
    private String name;
    private String description;
    private String priceCategory;

    private ArrayList<Review> reviews;
    private int cummulReviews;
    private double cummulStars;
    private double avgRating;

    public Shop(String name, String description, String priceCategory) {
        this.name = name;
        this.description = description;
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

    public String getPriceCategory() {
        return priceCategory;
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
        return String.format("A shop named %s has a review average of %.1f out of %d reviews and is in the %s price range. This shop is %s", this.name, this.avgRating, this.cummulReviews, this.priceCategory, this.description);
    }
}
