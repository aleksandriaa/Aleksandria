package items;


public class Book extends Item {


    private String descript;
    private int numberOfPages;
    private String genre;



    public Book (String title, String author,genreOfBook genre, String descript, int numberOfPages){

        this.title = title;
        this.author = author;
        this.descript = descript;
        this.numberOfPages = numberOfPages;
        this.id = setId();
        this.genre = genre.toString();


    }

    public String getDescript() {
        return descript;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                " id=" + id +
                ", title= '\"" + title + '\"' +
                ", author= '" + author + '\'' +
                ", genre= '" + genre + '\'' +
                ", descript= '" + descript + '\'' +
                ", numberOfPages= " + numberOfPages +
                ", isAvaiable= " + isAvaiable +
                ", loanPeriod= " + loanPeriod +
                ", maxReturnedDate= " + maxReturnedDate +
                ", lastLoanDate= " + loanDate +
                ", lastReturnedDate= " + returnedDate +
                '}';
    }
}