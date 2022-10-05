package Outros;

import java.util.Arrays;

public class P2_Solution {
    public int[] conjuntoMenor(int [][] conj) {
        System.out.println("------------------------------------------------");
        System.out.println("Conjunto inserido: " + Arrays.deepToString(conj));

        int valMen = conj[0][1];
        int valMai = conj[0][0];

        for (int i = 0; i < conj.length; i++) {
            if (valMai < conj[i][0]) {
                valMai = conj[i][1];
            }
            if (valMen > conj[i][1]) {
                valMen = conj[i][1];
            }
        }

        return new int[] {valMen, valMai};
    }
}
