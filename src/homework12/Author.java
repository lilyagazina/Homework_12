package homework12;

public class Author {
    private String firstName;
    private String space;
    private String lastName;
    public String author;

    public Author(String firstName, String space, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.space = space;
        this.author = firstName + space + lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSpace() {
        return this.space;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAuthor() {
        return this.author;
    }

}
