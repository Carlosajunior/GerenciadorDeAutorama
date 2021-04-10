/**
 * Componente Curricular: Módulo Integrado de Programação II
 * Autor: <Carlos Alberto Brandão Costa Júnior>
 * Data:  <13/11/2018>
 * Declaro que este código foi elaborado por mim de forma individual e 
 * não contém nenhum trecho de código de outro colega ou de outro autor, 
 * tais como provindos de livros e apostilas, e páginas ou documentos 
 * eletrônicos da Internet. Qualquer trecho de código de outra autoria 
 * que não a minha está destacado com uma citação para o autor e a 
 * fonte do código, e estou ciente que estes trechos não serão considerados 
 * para fins de avaliação.
 */
package Controller;

import java.util.Iterator;

/**
 *
 * @author Carlos
 */
public class ListaEncadeada {

    private No first;
    private No last;
    private int size;

    public ListaEncadeada() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    /**
     * retorna o primeiro nó da lista encadeada.
     * @return 
     */
    public No getFirst() {
        return first;
    }
    /**
     * recebe um nó como parametro e o define como novo primeiro nó da lista.
     * @param first 
     */
    public void setFirst(No first) {
        this.first = first;
    }
    /**
     * recebe um objeto como parâmetro e o adiciona ao final da lista.
     * @param obj 
     */
    public void add(Object obj) {
        No node = new No(obj);
        if (isEmpty()) {
            first = node;
            last = node;
            size++;
        } 
        else {
            node.setProx(last.getProx());
            last.setProx(node);
            last = node;
            size++;
        }
    }
    /**
     * recebe como parametro um inteiro que determina a posição na lista que
     * um nó deve ser removido e retorna o objeto contido no nó removido.
     * @param pos
     * @return 
     */
    public Object remove(int pos) {
        if (isEmpty() || pos > size || pos < 0) {
            return null;
        }
        No current = first;
        No previous = first;
        int v = 0;
        if (pos == 0) {
            first = first.getProx();
            current.setProx(null);
            size--;
            return current.getObj();
        }
        while (v < pos) {
            previous = current;
            current = current.getProx();
            v++;
        }
        previous.setProx(current.getProx());
        current.setProx(null);
        Object obj = current.getObj();
        size--;
        return (obj);
    }
    
    public Object remove(Object object){
        if(isEmpty())
            return null;
        No current = first;
        No previous = first;
        while(current != null){
            if(object == current.getObj()){
                previous.setProx(current.getProx());
                current.setProx(null);
                size--;
                return current.getObj();
            }
            previous = current;
            current = current.getProx();    
        }
        return null;
    }
    /**
     * retorna o tamanha da lista.
     * @return 
     */
    public int size() {
        return size;
    }
    /**
     * retona true caso a lista esta vazia e falso caso tenho ao menos 1 elemento
     * inserido.
     * @return 
     */
    public boolean isEmpty() {
        return (size == 0);
    }
    /**
     * retorna o iterador da lista.
     * @return 
     */
    public Iterator iterator() {
        Iterator iterador = new Iterador(this);
        return iterador;
    }
}
