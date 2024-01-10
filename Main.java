import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(12.2,"red");
        Circle c2 = new Circle(15.5,"yellow");
        Circle c3 = new Circle(20.20,"black");
        LinkedList<Circle> list = new LinkedList<Circle>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.sort(new AreaComparator());
        ListIterator itr = list.listIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
