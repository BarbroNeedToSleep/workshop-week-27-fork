package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {

        Person lina = new Person("Lina", "Katt" );
        Person alfred = new Person("Alfred", "Katt");

        System.out.println(lina.getPersonInformation());
        System.out.println(alfred.getPersonInformation()+ "\n");

        Book fish = new Book ("Svenska fiskar","Sten Sture");
        Book bird = new Book("Birds of the world", "Ugglan Tore");
        Book sleep = new Book("Best places to sleep", "John Blund", alfred);

        System.out.println(fish.getBookInformation());
        System.out.println(bird.getBookInformation());
        System.out.println(sleep.getBookInformation()+ "\n");

        lina.loanBook(fish);
        System.out.println(fish.getBookInformation()+ "\n");


        lina.loanBook(sleep);
        System.out.println(sleep.getBookInformation()+ "\n");

        lina.returnBook(fish);
        System.out.println(fish.getBookInformation()+ "\n");

        alfred.returnBook(sleep);
        System.out.println(sleep.getBookInformation()+ "\n");

    }

}
