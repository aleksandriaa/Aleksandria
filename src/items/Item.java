package items;

public interface Item {
    String title;
    String author;
    boolean isAvaible;
    int indexNumber;

    String getTitle();
    String getAuthor();
    boolean getIsAvaible();
    int getIndexNumber();

    void setTitle(String title);
    void setAuthor(String author);
    void setIsAvaible();
    void setIndexNumber();

}
