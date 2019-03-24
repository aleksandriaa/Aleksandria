import counter.Counter;
import items.Book;
import items.Item;
import items.genreOfBook;

import java.util.HashSet;
import java.util.Set;

public class AleksandriaLibrary {
    public static  Set<Item> allItems = new HashSet<>();

    public static void main(String[] args) {
        Counter id = new Counter();


        System.out.println("Witamy w naszej Aleksandrii :)");

        Book gamesOfThrones1 = new Book("Games of Thrones. Part 1", "George R.R. Martin", genreOfBook.FANTASTIC
                , "wojna o tron ojezu jak boli i wszycy giną", 652);


        Book gamesOfThrones2 = new Book("Games of Thrones. Part 2", "George R.R. Martin", genreOfBook.FANTASTIC,
                "wojna o tron ojezu jak boli i wszycy giną i krolowie walcza", 785);

        allItems.add(gamesOfThrones1);
        allItems.add(gamesOfThrones2);



        gamesOfThrones1.toBorrow();
        System.out.println("Get loan date: " + gamesOfThrones1.getLoanDate());
        gamesOfThrones1.isAvaible();
        gamesOfThrones1.toBorrow();
        gamesOfThrones1.isAvaible();
        gamesOfThrones1.toReturned();
        gamesOfThrones1.isAvaible();
        System.out.println(gamesOfThrones1.getGenre());
        System.out.println(gamesOfThrones1.toString());
        System.out.println(gamesOfThrones2.toString());


        System.out.println();
        System.out.println("Made by Tomasz i Maniuś");
    }
}
