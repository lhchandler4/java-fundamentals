package inheritance;

public class Review {
    private String author;
    private double numberOfStarsR;
    private String body;
    private String restaurant;

    public Review(String author, double numberOfStarsR, String body, String restaurant) {
        this.author = author;
        this.numberOfStarsR = numberOfStarsR;
        this.body = body;
        this.restaurant = restaurant;
    }

    public String getAuthor() {
        return author;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public double getNumberOfStarsR() {
        return numberOfStarsR;
    }

    public String getBody() {
        return body;
    }

    public String toString() {
        return String.format("%s reviewed this restaurant and give it a review of %.1f. This is what they had to say: %s", this.author, this.numberOfStarsR, this.body);
    }
}
