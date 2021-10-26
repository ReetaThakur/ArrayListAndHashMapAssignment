import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAssigement {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        ArrayList<String> ree=new ArrayList<>();
        ree.add("reeta");
        ree.add("deeksha");
        ree.add("ruchi");
        ree.add("rani");
        ree.add("priyanka");
        System.out.println(ree);

        for (int i=0;i<ree.size();i++){
            int size=ree.get(i).length();
            if (size>5){
                System.out.print(ree.get(i)+" ");
            }
        }
        ree.remove(2);
        System.out.println(ree);

        ree.add(3,"Masai");
        System.out.println(ree);
    }
}
