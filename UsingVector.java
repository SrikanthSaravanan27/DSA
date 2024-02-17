import java.util.List;
import java.util.Vector;

public class UsingVector {
    public static void main(String[] args) {
        List<Integer> list = new Vector<>();
        list.add(12);
        list.add(15);
        list.add(27);
        list.add(7);
        list.add(63);
        System.out.println(list);
    }
}
