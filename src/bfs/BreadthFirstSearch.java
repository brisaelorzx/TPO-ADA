package bfs;

import grafo.Vertice;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<T> {
    private final Vertice<T> verticeInicial;

    public BreadthFirstSearch(Vertice<T> verticeInicial) {
        this.verticeInicial = verticeInicial;
    }

    public void recorrer(){
        Queue<Vertice<T>> cola = new LinkedList<>();
        cola.add(verticeInicial);
        while (!cola.isEmpty()) {
            Vertice<T> actual = cola.poll();
            if (!actual.isVisitado()) {
                actual.setVisitado(true);
                System.out.println("data: " + actual.getData()+ " vecinos: " + actual.isVisitado());
                cola.addAll(actual.getVecinos());
            }
        }
    }
}