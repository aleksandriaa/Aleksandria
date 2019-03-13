package items;

public class Book implements Item {

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

//    private int totalAmount;
//    private int howManyAvaible;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public boolean getIsAvaible() {
        return (true);
    }

    @Override
    public int getIndexNumber() {
        return indexNumber + 1; // nie można inkrementować indexNumber, trzeba jakos inaczej ogarnąć
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public void setIsAvaible(){
       // isAvaible = true;
    }
    @Override
    public void setIndexNumber(){

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
