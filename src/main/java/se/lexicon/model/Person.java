package se.lexicon.model;
/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    // todo: needs completion

    private static int personIdCounter = 0;

    private int Id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.Id = getNextId();
        setFirstName(firstName);
        setLastName(lastName);

    }

    //Getter

    private int getNextId() {
        return ++personIdCounter;}


    private String getFirstName(){
        return firstName;
    }

    private String getLastName() {
        return lastName;
    }

    //setters

        private void setFirstName(String firstName){

        if (firstName == null || firstName.trim().isEmpty()){
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
       this.firstName = firstName;
    }

        private void setLastName(String lastName){

        if (lastName == null || lastName.trim().isEmpty()){
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        this.lastName = lastName;
    }


    public boolean loanBook(Book book) {
        if(book.isAvailable()) {
            book.setBorrower(this);
            System.out.println("Book has been loaned.");
            return true;
        }
        System.out.println("You cannot loan this book.");
        return false;
    }

    public boolean returnBook(Book book) {
        if(!book.isAvailable()) {
            book.setBorrower(null);
            System.out.println("The book has been returned.");
            return true;
        }
        System.out.println("We could not return the book.");
        return false;
    }





    public String getPersonInformation(){

        StringBuilder info = new StringBuilder();
        info.append("Book loner - Account Number: ").append(Id)
                .append(", First name: ").append(firstName)
                .append(", Last name: ").append(lastName);

        return info.toString();
    }

}