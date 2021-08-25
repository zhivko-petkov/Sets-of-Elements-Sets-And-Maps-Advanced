package EXERCISES;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        
        LinkedHashSet <Integer> firstList = new LinkedHashSet<>(n);
        LinkedHashSet <Integer> lastList = new LinkedHashSet<>(m);

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.nextLine());
            firstList.add(a);
        }

        for (int j = 0; j < m; j++) {
            int a = Integer.parseInt(sc.nextLine());
            lastList.add(a);
        }

        firstList.retainAll(lastList);
        for (var a: firstList) {
            System.out.print(a + " ");
        }
    }
}
