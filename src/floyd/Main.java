package floyd;

import static floyd.Floyd.INF;

public class Main {
    public static void main(String[] args) {
        //no puedo printear ∞, printea "?" instead
        int[][] pesosMatriz = {
                {0, 3, 2, INF, INF},
                {INF, 0, INF, 7, INF},
                {INF, INF, 0, INF, 4},
                {INF, INF, INF, 0, 6},
                {INF, 4, 5, INF, 0}
        };
        String[][] matrizSucesores = {
                {"-", "B", "C", "-", "-"},
                {"-", "-", "-", "D", "-"},
                {"-", "-", "-", "-", "E"},
                {"-", "-", "-", "-", "E"},
                {"-", "B", "C", "-", "-"}
        };
        new Floyd(pesosMatriz, matrizSucesores).run();
    }
}