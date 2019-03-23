package items;

import java.time.LocalDateTime;

public class Book extends Item {

    private String descript;
    private int numberOfPages;

    public Book (String title, String author, String descript, int numberOfPages){
        this.title = title;
        this.author = author;
        this.descript = descript;
        this.numberOfPages = numberOfPages;
        this.id = setId();
    }



}