package JavaArrayPackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class iterator {
    public static void mian (String[]args){  //video: 2:55 class 7
        List <String> stList = new ArrayList<String>();
        stList.add("NY");
        stList.add("NJ");
        stList.add("PA");
        stList.add("CT");
        Iterator it = stList.listIterator();// listIterator is a method here/class
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
