package items;

public class Book {

    private String title;
    private String description;
    private String author;
    private int pages;

    private enum genre {
        Fantasy,
        Westerns,
        Romance,
        Thriller,
        Mystery,
        Memoir,
        Biography,
        Musical,
        Satire,
        Haiku,
        Horror,
        DoItYorselfe,
        Dictionary;
    }

    private int totalAmount;
    private int howManyAvaible;


}
