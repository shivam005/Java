package ObjectComposition;

public class Library {

    Book book;
    Reviews reviews;

    public Library(Book book, Reviews reviews) {
        this.book = book;
        this.reviews = reviews;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reviews getReviews() {
        return reviews;
    }

    public void setReviews(Reviews reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Library{" +
                "book=" + book +
                ", reviews=" + reviews +
                '}';
    }
}
