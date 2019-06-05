package inheritance;

public class Review {
    private String author;
    private double numberOfStarsR;
    private String body;
    private String business;
    private String movieName;

    public Review(String author, double numberOfStarsR, String body, String business) {
        this.author = author;
        this.numberOfStarsR = numberOfStarsR;
        this.body = body;
        this.business = business;
    }

    public Review(String author, double numberOfStarsR, String body, String business, String movieName) {
        this.author = author;
        this.numberOfStarsR = numberOfStarsR;
        this.body = body;
        this.business = business;
        this.movieName = movieName;
    }

    public String getAuthor() {
        return author;
    }

    public String getBusiness() {
        return business;
    }

    public double getNumberOfStarsR() {
        return numberOfStarsR;
    }

    public String getBody() {
        return body;
    }

    public String toString() {
        return String.format("%s reviewed this business and give it a review of %.1f. This is what they had to say: %s", this.author, this.numberOfStarsR, this.body);
    }
}
