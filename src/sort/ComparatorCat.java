package sort;

import java.util.Comparator;

public class ComparatorCat implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        int com = o1.getName().length() - o2.getName().length();
        if(com == 0) return o1.getName().compareToIgnoreCase(o1.getName());
        return com;
    }
}
