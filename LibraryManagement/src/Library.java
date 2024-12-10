import java.util.LinkedList;

public class Library{
    private String name;
    private String address;
    private int phoneNumber;
    private String email;
    private LinkedList<Book> books;

    public Library(String name, String address, int phoneNumber, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.books = new LinkedList<>();
    }

    public void findBook(int bookId){
        for (Book currentBook : this.books){
            if (currentBook.getBookId() == bookId){
                String formatted = String.format("The book you are looking for is: %s", currentBook.getTitle());
                System.out.println(formatted);
            }
        }
        System.out.println("The book that you entered was not found.");
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void removeBook(int bookId){
        for (Book currentBook : this.books){
            if (currentBook.getBookId() == bookId){
                this.books.remove(currentBook);
            }
        }
        System.out.println("The book that you are trying to remove is not in the library.");
    }

    public void borrowBook(int bookId){
        for (Book currentBook : this.books){
            if (currentBook.getBookId() == bookId){
                currentBook.setBorrowedBook();
            }
        }
        System.out.println("The book you have entered does not exist.");
    }
        
    public void returnBook(int bookId){
        for (Book currentBook : this.books){
            if (currentBook.getBookId() == bookId){
                currentBook.setUnborrowedBook();
            }
        }
        System.out.println("Are you sure you have borrowed this book?");
    }

    public void setLibraryName(String someName){
        name = someName;
    }

    public void setLibraryAddress(String someAddress){
        address = someAddress;
    }

    public void setLibraryPhoneNumber(int somePhoneNumber){
        phoneNumber = somePhoneNumber;
    }

    public void setEmail(String someEmail){
        if (EmailValidator.isValidEmail(someEmail) == true){
            email = someEmail;
        } else {
            System.out.println("The email that you have entered is not a valid email.");
        }
    }

    public String getLibraryName(){
        return name;
    }

    public String getLibraryAddress(){
        return address;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }    
}