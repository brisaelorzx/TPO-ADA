package bfs;

import grafo.Vertice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vertice<Integer> v0 = new Vertice<>(0);
        Vertice<Integer> v1 = new Vertice<>(1);
        Vertice<Integer> v2 = new Vertice<>(2);
        Vertice<Integer> v3 = new Vertice<>(3);
        Vertice<Integer> v4 = new Vertice<>(4);
        Vertice<Integer> v5 = new Vertice<>(5);
        Vertice<Integer> v6 = new Vertice<>(6);

        v0.setVecinos(Arrays.asList(v1,v5,v6));
        v1.setVecinos(Arrays.asList(v3,v4,v5));
        v4.setVecinos(Arrays.asList(v2,v6));
        v6.setVecinos(Arrays.asList(v0));

        BreadthFirstSearch<Integer> bfs = new BreadthFirstSearch<>(v1);
        bfs.recorrer();
    }
}