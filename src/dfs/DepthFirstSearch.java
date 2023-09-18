package dfs;

import grafo.Vertice;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class DepthFirstSearch<T> {

    public void recorrer(Vertice<T> verticeInicial) {
        Deque<Vertice<T>> pila = new LinkedList<>();
        pila.push(verticeInicial);
        while (!pila.isEmpty()) {
            Vertice<T> actual = pila.pop();
            if (!actual.isVisitado()){
                actual.setVisitado(true);
                System.out.println("data: " + actual.getData()+ " vecinos: " + actual.isVisitado());
                Collections.reverse(actual.getVecinos());
                actual.getVecinos().forEach(pila::push);
            }
        }
    }

}