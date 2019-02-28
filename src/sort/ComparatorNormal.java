package sort;

import java.util.Comparator;

public class ComparatorNormal implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(o1.getClass() != o2.getClass()) throw new IllegalArgumentException("Cannot compare because 2 objects have different class");

        if(o1 instanceof Integer){
            return ((Integer) o1).compareTo((Integer) o2);
        }

        if(o1 instanceof Double){
            return ((Double) o1).compareTo((Double) o2);
        }

        if(o1 instanceof String){
            return ((String) o1).compareToIgnoreCase( (String) o2);
        }

        return 0;
    }
}
