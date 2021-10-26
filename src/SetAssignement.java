import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetAssignement {
    public static void main(String[] args) {
        Set<String> ree=new HashSet<>();
        ree.add("India");
        ree.add("Pak");
        ree.add("china");
        ree.add("India");
        ree.add("Aus");
        ree.add("Pak");
        ree.add("Jap");
        System.out.println(ree);
        Iterator<String> item=ree.iterator();
        while (item.hasNext()){
            String country=item.next();
            if (country.length()>=3) System.out.print(country+" ");
        }
        System.out.println();
        ree.remove("India");
        System.out.println(ree);
    }
}
