package JavaArrayPackage;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class JavaArrayList {
    public static void main(String[]args){
        int limit =10;
        List<Integer> list = new ArrayList<Integer>();
        //List is a interface implemented by ArrayList video class Seven 2:00
        Random random = new Random();
        for(int i=0; i<list.size();i++){
            list.add(random.nextInt(bound:100));// video 2:51
        }
        for (int j=0; j<list.size();j++){
            System.out.println(list.get(j));
        }
    }
}

