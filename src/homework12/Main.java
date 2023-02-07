package homework12;

public class Main {

    public static void main(String[] args) {
        Author dostoevsky = new Author("Fedor", "Dostoevsky");
        System.out.println("Author: " + dostoevsky.getFirstName() + " " + dostoevsky.getLastName() + ".");
        Author bradbury = new Author("Ray", "Bradbury");
        System.out.println("Author: " + bradbury.getFirstName() + " " + bradbury.getLastName() + ".");
        Book crimeAndPunishment = new Book("Crime and Punishment", dostoevsky, 1866);
        System.out.println("BookName - " + "\"" + crimeAndPunishment.getBookName() + "\"" + ", " + "author - " + dostoevsky.getAuthor() +
                ", " + "publishingYear - " + crimeAndPunishment.getPublishingYear() + ".");
        Book deathIsALonelyBusiness = new Book("Death is a lonely business", bradbury, 1985);
        System.out.println("BookName - " + "\"" + deathIsALonelyBusiness.getBookName() + "\"" + ", " + "author - " + bradbury.getAuthor() +
                ", " + "publishingYear - " + deathIsALonelyBusiness.getPublishingYear() + ".");
        crimeAndPunishment.setPublishingYear(1865);
        System.out.println("PublishingYear \"Crime and Punishment\": " + crimeAndPunishment.getPublishingYear() + ".");

    }
}

