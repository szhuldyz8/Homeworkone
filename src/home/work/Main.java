package home.work;

public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[9];
        books[0] = new Book(1, "Romeo and Juliet", "William Shakespeare", "New folger", 2004, 800, 2500, "soft");
        books[1] = new Book(2, "Jane Eyre", "Charlotte Bronte", "Penguin", 1847, 507, 1500, "hard");
        books[2] = new Book(3, "Faranheit 451", "Ray Bredbury", "Penguin", 2006, 174, 1800, "soft");
        books[3] = new Book(4, "The minds of Billy Milligan", "Daniel Keyes", "Flower", 2000, 400, 1700, "hard");
        books[4] = new Book(5,"Flower for Algernon", "Daniel Keyes", "Sunrise", 1959, 850, 2900, "hard");
        books[5] = new Book(6, "The Master and Margarita", "Mikhail Bulgakov", "New Course", 1967, 1090, 2100, "hard");
        books[6] = new Book(7, "Pride and Prejudice", "Jane Austen", "Paperback", 1813, 279, 1300, "soft");
        books[7] = new Book(8, "The portrait of Dorian Grey", "Oscar Wilde", "Penguin", 1890, 510, 1100, "hard");
        books[8] = new Book(9, "Crime and Punishment", "Fyodor Dostoyevsky", "New Course", 2002, 671, 3000, "hard");

        for (int i = 0; i < 8; i++) {  // первое задание
            if (books[i].author == "Daniel Keyes")
                System.out.println(books[i].name);
        }


        for (int i = 0; i < 8; i++) { // второе задание
            if (books[i].publishing == "Penguin")
                System.out.println(books[i].name);
        }

        for (int i = 0; i<8; i++) {  // третье задание
        if (books[i].publication_date >= 2000)
            System.out.println(books[i].name + " " + books[i].author + " " + books[i].publishing + " " + books[i].publication_date );
        }
    }

}