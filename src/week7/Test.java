package week7;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        arr.add("e");
        arr.add("g");

        List newList = arr.subList(0, 3);
        ArrayList<String> newArr = new ArrayList<>(newList);

    }
}
