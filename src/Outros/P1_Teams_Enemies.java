/**
 [Daily Coding Problem][Difícil][Twitter]
 Bom Dia! Aqui está o seu problema de entrevista de codificação para hoje.
 Este problema foi perguntado pelo Twitter.
 Um professor deve dividir uma classe de alunos em duas equipes para jogar queimada. Infelizmente, nem todas as crianças se dão bem, e várias se recusam a ser colocadas no mesmo time de seus inimigos.
 Dada uma lista de adjacências de alunos e seus inimigos, escreva um algoritmo que encontre um par satisfatório de equipes ou retorne False se não existir.
 Por exemplo, dado o grafo de inimigos a seguir, você deve retornar as equipes {0, 1, 4, 5} e {2, 3}.
 alunos = {
 0: [3],
 1: [2],
 2: [1, 4],
 3: [0, 4, 5],
 4: [2, 3],
 5: [3]
 }
 Por outro lado, dada a entrada abaixo, você deve retornar False.
 alunos = {
 0: [3],
 1: [2],
 2: [1, 3, 4],
 3: [0, 2, 4, 5],
 4: [2, 3],
 5: [3]
 }
 ======================
 */


package Outros;

public class P1_Teams_Enemies {
    public static void main(String[] args) {
        System.out.println("result: " + new P1_Solution().teamsEnemies(new int[][] {{3}, {2}, {1,4}, {0,4,5}, {2,3}, {3}}));
        System.out.println("result: " + new P1_Solution().teamsEnemies(new int[][] {{3}, {2}, {1,3,4}, {0,2,4,5}, {2,3}, {3}}));
        System.out.println("result: " + new P1_Solution().teamsEnemies(new int[][] {{3}, {2}, {1}, {0}}));
        System.out.println("result: " + new P1_Solution().teamsEnemies(new int[][] {{3}, {2, 0, 3}, {1}, {1}}));
    }
}
