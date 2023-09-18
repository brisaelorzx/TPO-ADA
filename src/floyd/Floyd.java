package floyd;

import java.util.stream.IntStream;

public class Floyd {
    private final int numeroDeVertices;
    private final int[][] pesosMatriz;
    private final String[][] matrizSucesores;
    public final static int INF = Integer.MAX_VALUE;


    public Floyd(int[][] pesosMatriz, String[][] matrizSucesores) {
        this.pesosMatriz = pesosMatriz;
        this.matrizSucesores = matrizSucesores;
        numeroDeVertices = pesosMatriz[0].length;
    }

    public void run() {
        IntStream.range(0, numeroDeVertices).forEach(intermedio ->
                IntStream.range(0, numeroDeVertices).forEach(inicio ->
                        IntStream.range(0, numeroDeVertices).forEach(fin-> {
                            int peso = getWeightViaInterNode(pesosMatriz, inicio, intermedio, fin);
                            if (peso < pesosMatriz[inicio][fin]) {
                                pesosMatriz[inicio][fin] = peso;
                                matrizSucesores[inicio][fin] = matrizSucesores[inicio][intermedio];
                            }
                        })));
        print(pesosMatriz);
        System.out.println("------------------------------------------------------------------------------");
        print(matrizSucesores);
    }

    private int getWeightViaInterNode(int[][] matriz, int inicio, int intermedio, int fin) {
        return matriz[inicio][intermedio] == INF || matriz[intermedio][fin] == INF ? INF:matriz[inicio][intermedio] + matriz[intermedio][fin];
    }

    public void print(int[][] matriz) {
        IntStream.range(0, numeroDeVertices).forEach(i ->{
            IntStream.range(0, numeroDeVertices).forEach(j->
                    System.out.print(matriz[i][j] == INF ? "∞ " : matriz[i][j] + " ")
            );
            System.out.println();
        });
    }

    public void print(String[][] matriz) {
        IntStream.range(0, numeroDeVertices).forEach(i ->{
            IntStream.range(0, numeroDeVertices).forEach(j ->
                    System.out.print(matriz[i][j] + " ")
            );
            System.out.println();
        });
    }
}
