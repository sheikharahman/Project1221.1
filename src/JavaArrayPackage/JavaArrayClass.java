package JavaArrayPackage;

import java.util.Random;
public class JavaArrayClass {
    public static void main(String[]args){
        int num =12;
        int [] array;// this array takes place into the stag
        array = new int[10];
        Random rdm = new Random();
        for(int i=0; i<array.length; i++){
            array[i]= rdm.nextInt(bound:100);

        }
        for (int j=0;j<array.length;j++){
            System.out.println(array[j]);
        }

    }
}
