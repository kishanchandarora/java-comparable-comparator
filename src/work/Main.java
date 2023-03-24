package work;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> marks = new ArrayList<>();
//        marks.add(12);
//        marks.add(34);
//        marks.add(6);
//        System.out.println(marks);
//        Collections.sort(marks);
//        System.out.println(marks);

        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Durgesh", "1234567890", 12));
        emps.add(new Emp("Ankit", "324", 11));
        emps.add(new Emp("Bhavesh", "977", 12));
        Collections.sort(emps, new IdComparator());
        System.out.println(emps);

        // comparable
        ArrayList<Emp> emps1 = new ArrayList<>(emps);
        Collections.sort(emps1, new Comparator<Emp>() {
            @Override
            public int compare(Emp emp, Emp t1) {
                return emp.getName().compareTo(t1.getName());
            }
        });
        System.out.println(emps1);

    }
}