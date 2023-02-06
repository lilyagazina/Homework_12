package homework12;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;
    public final String author;

    public Author(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.author = firstName + lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author1 = (Author) o;
        return Objects.equals(firstName, author1.firstName) && Objects.equals(lastName, author1.lastName) && Objects.equals(author, author1.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, author);
    }

    @Override
    public String toString() {
        return firstName + lastName;
    }
}
