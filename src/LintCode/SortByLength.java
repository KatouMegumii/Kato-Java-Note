package LintCode;

import java.util.Arrays;
import java.util.Comparator;

public class SortByLength {
    public void sortByLength(String[] strArr) {
        Arrays.sort(strArr, Comparator.comparing(String::length));
        Arrays.stream(strArr).forEach(System.out::println);
    }
}



