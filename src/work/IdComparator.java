package work;

import java.util.Comparator;

public class IdComparator implements Comparator<Emp> {

    @Override
    public int compare(Emp emp, Emp t1) {
        return emp.getEmpId() - t1.getEmpId();
    }
}
