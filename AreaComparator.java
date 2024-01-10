import java.util.Comparator;

public class AreaComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.CalculateArea()> c2.CalculateArea())
        return 1;
        else
            return -1;
    }
}
