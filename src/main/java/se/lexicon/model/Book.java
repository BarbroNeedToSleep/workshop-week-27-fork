package se.lexicon.model;

import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {

    //fix for branch push
    private Person borrower;

    private String Id;
    private String titel;
    private String author;
    private boolean available;

    public Book (String titel, String author){
        this.Id = generateId();
        this.titel = titel;
        this.author = author;
        this.borrower = null;
        this.available = true;

    }

    public Book (String titel, String author, Person borrower){
        this.Id = generateId();
        setTitel(titel);
        setAuthor(author);
        this.borrower = borrower;
        this.available = (borrower) == null;

    }

    //Getters

    public String getId() {
        return Id;
    }

    public String getTitle() {

        return titel;
    }

   public String getAuthor() {

        return author;
    }

    public Person getBorrower() {
        return borrower;
    }

    public boolean isAvailable() {
        return available;
    }

    //Setters

    public void setTitel(String titel){

        if (titel == null){
            throw new IllegalArgumentException("First name cannot be null");
        }

        this.titel = titel;
    }

    public void setAuthor(String author){

        if (author == null){
            throw new IllegalArgumentException("First name cannot be null");
        }

        this.author = author;
    }
    public void setBorrower(Person borrower) {
        if(borrower == null) {
            available = true;
        }
        else {
            available = false;
        }
        this.borrower = borrower;

    }

    private static String generateId(){
        return UUID.randomUUID().toString().substring(0,8).toUpperCase();
    }

    public String getBookInformation(){

        StringBuilder info = new StringBuilder();
        info.append("Book information -  Id umber: ").append(Id)
                .append(", Book titel: ").append(titel)
                .append(", Book author: ").append(author)
                .append(", Available: ").append(available ? "Yes, " : "No, ")
                .append(borrower != null ? borrower.getPersonInformation() : " Loner: none");


        return info.toString();
    }


}