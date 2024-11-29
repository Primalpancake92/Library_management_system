public final class Book {
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

    public void setBookId (int newBookId){
        if (String.valueOf(newBookId).length() == 10){
            bookId = newBookId;
            System.out.println("Book ID number has been set.");
        } else {
            System.out.println("The Book ID must be 10 digits long to register.");
        }
    }

    public void setTitle (String titleEntered){
        if (!titleEntered.trim().isEmpty() && titleEntered.trim() != null) {
            title = titleEntered;
        } else {
        System.out.println("There was no title entered.");
        }
    }

    public void setAuthor(String authorEntered){
        if (!authorEntered.trim().isEmpty() && authorEntered.trim() != null){
            author = authorEntered;
        } else {
        System.out.println("There was no author entered.");
        }
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

    public String toString(){
        return String.format("Book ID: %d\nBook Title: %s\nAuthor: %s", this.getBookId(), this.getTitle(), this.getAuthor());
    }
    /* 
    public static void main(String[] args){
        String author = "";
        int bookID = 123895;
        String title = "The Chamber of Secrets";

        Book book1 = new Book(bookID, title, author);
        book1.setBookId(1748348450);
        book1.setAuthor("JK. Rowling");
        System.out.println(book1);
    }
    */
}
