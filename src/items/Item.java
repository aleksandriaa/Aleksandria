package items;

import counter.Counter;

import java.time.LocalDateTime;

public abstract class Item {
    public long id;

    public String title;
    public String author;
    public boolean isAvaiable = true;
    public int loanPeriod = 15;

    public LocalDateTime maxReturnedDate;
    public LocalDateTime loanDate;
    public LocalDateTime returnedDate;


    public long setId(){

        return this.id = Counter.get();
    }

    public long getId() {

        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getLoanPeriod() {
        return loanPeriod;
    }

    public LocalDateTime getMaxReturnedDate() {
        return maxReturnedDate;
    }

    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    public LocalDateTime getReturnedDate() {
        return returnedDate;
    }

    public void isAvaible() {
        if (this.isAvaiable == true) {
            System.out.println("Is avaible :) ");
        } else {
            System.out.println("Is borrowed, to be returned in " + maxReturnedDate);
        }

    }

    public void toBorrow() {
        if(isAvaiable == true) {
            this.loanDate = LocalDateTime.now();
            this.maxReturnedDate = this.loanDate.plusDays(this.loanPeriod);
            this.isAvaiable = false;
            System.out.println("You have borrow an item \"" + getTitle() + "\"");
        } else {
            System.out.println("Sorry, this item is not avaible, to be returned in " + maxReturnedDate);
        }
    }

    public void toReturned() {
        if (isAvaiable == false) {
            this.returnedDate = LocalDateTime.now();
            this.isAvaiable = true;
        } else {
            System.out.println("This item is avaible, you can not give it back");
        }

    }
}
