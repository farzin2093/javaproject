package fourthpackage;

import java.util.Hashtable;

public class HashTablePractice {
    public static void main(String[] args) {

        Hashtable<Integer,String> studentTable = new Hashtable<>();

        studentTable.put(1,"Tanzina");
        studentTable.put(2,"Thamina");
        studentTable.put(3,"Julia");

        System.out.println(studentTable);

    }
}
