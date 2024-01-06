import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Book> list = new LinkedList<Book>();
        list.add(new Book("CodZela",25.0));
        list.add(new Book("AliPapa",70.50));
        list.add(new Book("Ala Adin",60.2));
        list.add(new Book("Gogo",50.32));
        Collections.sort(list);
//        for (Book book : list)
//        {
//            System.out.println(book.TotalPrice());
//        }
        Iterator<Book> itr = list.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
