package Outros;

import java.util.ArrayList;

public class P1_Solution {
    public boolean teamsEnemies(int[][] num) {
        ArrayList<Integer> group = new ArrayList<>();
        ArrayList<Integer> group1 = new ArrayList<>();
        ArrayList<Integer> group2 = new ArrayList<>();
        boolean aux = false;
        boolean aux2 = false;

        for (int i = 0; i < num.length; i++) {
            group.add(i);
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (group1.contains(num[i][j])) {
                    aux = true;
                }
                if (group2.contains(num[i][j])) {
                    aux2 = true;
                }
            }
            if (aux) {
                if (!aux2) {
                    group2.add(i);
                }
            } else {
                group1.add(i);
            }

            aux = false;
            aux2 = false;
        }

        System.out.println("*--------------------------------------------*");
        if (group1.size() > 1 && group2.size() > 1) {
            System.out.println(group1);
            System.out.println(group2);
            return true;
        } else {
            System.out.print(group1);
            System.out.print("\nSem grupos: ");
            for (int i = 0; i < group.size(); i++) {
                if (!group1.contains(group.get(i))) {
                    System.out.printf("%d ",group.get(i));
                }
            }
            System.out.println();
            return false;
        }
    }
}
