package fourthpackage;

import java.util.ArrayList;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(101);
        numberList.add(102);

        ArrayList<Object> objectList = new ArrayList<>();
        objectList.add("name");
        objectList.add("true");
        objectList.add(100);



        for(int i=0;i<numberList.size();i++){
            int number = numberList.get(i);
            System.out.println(number);
        }
    }
}
