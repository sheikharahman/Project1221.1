package JavaArrayPackage;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        List<String> istLst = new ArrayList<String>();
        istLst.add("MN");
        istLst.add("CA");
        istLst.add("PA");
        istLst.add("TX");
        for(String ag:istLst){
            System.out.println(ag);
        }
    }
}
