public class Book {
    private int bookId;
    private String title;
    private String author;
    private String publisher;
    private int yearPublished;
    private boolean borrowed;
    
    public Book (int bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public int getBookId(){
        return bookId;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getPublisher(){
        return publisher;
    }

    public int getYearPublished(){
        return yearPublished;
    }

    public boolean getBorrowed(){
        return borrowed;
    }
}
