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
public class Iterador implements Iterator {

    private ListaEncadeada List;
    private No current;
    /**
     * construtor que recebe como parametro uma lista encadeada.
     * @param List 
     */
    public Iterador(ListaEncadeada List) {
        this.List = List;
        this.current = List.getFirst();
    }
    /**
     * método que verifica se há um nó atualmente.
     * @return 
     */
    @Override
    public boolean hasNext() {
        return (current != null);
    }

    @Override
    /**
     * método que salta de um nó da lista para o próximo que o mesmo aponta
     * e retorna o objeto que está contido nó.
     */
    public Object next() {
        if (hasNext()) {
            Object obj ;
            obj = current.getObj();
            current = current.getProx();
            return obj;
        }
        else
            return null;
    }    
}
