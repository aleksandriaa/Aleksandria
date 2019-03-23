import counter.Counter;
import items.Book;
import items.Item;

public class AleksandriaLibrary {
    public static void main(String[] args) {
        Counter id = new Counter();
        System.out.println("Witamy w naszej Aleksandrii :)");

        Book gamesOfThrones1 = new Book("Games of Thrones. Part 1","George R.R. Martin",
                "wojna o tron ojezu jak boli i wszycy giną", 652);


        Book gamesOfThrones2 = new Book("Games of Thrones. Part 2","George R.R. Martin",
                        "wojna o tron ojezu jak boli i wszycy giną i krolowie walcza", 785);


        gamesOfThrones1.toBorrow();
        System.out.println("Get loan date: " + gamesOfThrones1.getLoanDate());
        gamesOfThrones1.isAvaible();
        gamesOfThrones1.toBorrow();
        gamesOfThrones1.isAvaible();
        gamesOfThrones1.toReturned();
        gamesOfThrones1.isAvaible();


//        Item item = new Item();
////        item.isAvaible();
////        System.out.println("Loan date is: " + item.getLoanDate());
////        item.toBorrow(item);
////        item.isAvaible();
////        item.toReturned(item);
////        item.isAvaible();












        System.out.println();
        System.out.println("Made by Tomasz i Maniuś");
    }
}
