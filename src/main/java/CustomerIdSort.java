import java.util.Comparator;
import java.util.TreeSet;

class Customer implements Comparable
{
    int custId;
    String custName;

    public Customer(int custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                '}';
    }
    @Override
    public int compareTo(Object o) {
        int custId1 = this.custId;
        Customer c = (Customer)o;
        int custId2 = c.custId;
        if (custId1<custId2)
            return -1;
        else  if (custId1>custId2)
            return +1;
        else
            return 0;
    }
}

public class CustomerIdSort {
    public static void main(String[] args) {
        Customer c1 = new Customer(11, "Om");
        Customer c2 = new Customer(21, "Jai");
        Customer c3 = new Customer(111, "Ram");
        Customer c4 = new Customer(51, "Ganesh");
        Customer c5 = new Customer(25, "Sai");

        /*TreeSet t = new TreeSet();
        t.add(c1);
        t.add(c2);
        t.add(c3);
        t.add(c4);
        t.add(c5);*/

        TreeSet t1 = new TreeSet(new MyComparator());
        t1.add(c1);
        t1.add(c2);
        t1.add(c3);
        t1.add(c4);
        t1.add(c5);

        System.out.println(t1);
    }
}
class MyComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        Customer c1 = (Customer)o1;
        Customer c2 = (Customer)o2;

        String s1 = c1.custName;
        String s2 = c2.custName;

        return  s1.compareTo(s2);
    }
}