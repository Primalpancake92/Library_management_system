/*
 * This class defines the base class attributes and methods for other class objects.
 */

public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private boolean userRegistered = false;

    public User(int userId, String firstName, String lastName, int age, String email){
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    // These are the getter methods

    public int getUserID(){
        /*
         * This method fetches and returns the current userId.
         */
        return userId;
    }

    public String getFirstName(){
        /*
         * This method fetches and returns the current firstName of the user.
         */
        return firstName;
    }
    
    public String getLastName(){
        /*
         * This method fetches and returns the last name of the user.
         */
        return lastName;
    }

    public int getAge(){
        /*
         * This method fetches and returns the age of the user.
         */
        return age;
    }

    public String getEmail(){
        /*
         * Thie method fetches and returns the email of the user.
         */
        return email;
    }

    public void setUserId(int someUserId){
        userId = someUserId;
    }

    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }

    public void setLastName(String newLastName){
        lastName = newLastName;
    }

    public void setAge(int newAge){
        if (newAge > 10 && newAge <= 100){
            age = newAge;
        }
        else {
            if (newAge <= 10){
                System.out.println("You are not of age to be registered in the library's system.");
            }
            else {
                System.out.println("This is a non-sensical age.");
            }
        }
    }

    public void setEmail(String newEmail){
        if (EmailValidator.isValidEmail(newEmail) == true){
            email = newEmail;
        }
        else{
            System.out.println("This is not a valid email.");
        }
    }

    public void setRegistration(){
        if (this.getUserID() > 0 && this.getFirstName() != null 
        && this.getLastName() != null && this.getAge() > 10 && 
        this.getAge() <= 100 && this.getEmail() != null){
            userRegistered = true;
            System.out.println("The user has been successfully registered into the system.");
        } 
        else{
            System.out.println("User registration has failed. Please check alll fields.");
        }
    }
}
