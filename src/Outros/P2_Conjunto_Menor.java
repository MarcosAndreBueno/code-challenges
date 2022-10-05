/**
 Este problema foi solicitado pelo Google.

 Dado um conjunto de intervalos fechados, encontre o menor conjunto de números que cobre todos os intervalos. Se houver vários conjuntos menores, retorne qualquer um deles.

 Por exemplo, dados os intervalos [0, 3], [2, 6], [3, 4], [6, 9], um conjunto de números que cobre todos esses intervalos é {3, 6}.
 */

package Outros;

import java.util.Arrays;

public class P2_Conjunto_Menor {
    public static void main(String[] args) {
        System.out.println("menor conjunto obtido: " + Arrays.toString(new P2_Solution().conjuntoMenor(new int[][]{{0, 3}, {2, 6}, {3, 4}, {6, 9}})));
        System.out.println("menor conjunto obtido: " + Arrays.toString(new P2_Solution().conjuntoMenor(new int[][]{{1, 4}, {4, 5}, {7, 9}, {9, 12}})));

    }
}
