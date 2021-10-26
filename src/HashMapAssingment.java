import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapAssingment {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        HashMap<String,Integer> ree=new HashMap<>();
        ree.put("Reeta",1);
        ree.put("Deeksha Thakur",2);
        ree.put("shailee shrivastava",3);
        ree.put("Rupali Mishara",4);
        ree.put("Ritu Sharma",5);
        System.out.println(ree);
        Iterator<String> item= ree.keySet().iterator();
        while (item.hasNext()){
            String key= item.next();
            int length=key.length();
            if (length>5) System.out.print(ree.get(key)+" ");
        }
        System.out.println();
        while (item.hasNext()){
            String key= item.next();
            int length=key.length();
            if (length>=9){
                ree.remove(key);
            }
        }
        System.out.print(ree);
    }
}
