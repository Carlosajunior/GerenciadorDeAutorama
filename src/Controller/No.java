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

/**
 *
 * @author Carlos
 */
public class No {
    private Object obj;
    private No prox;
    
    public No(Object obj){
        this.obj = obj;
        this.prox= null;
    }
    /**
     * recebe como parâmetro um objeto e o insere no nó.
     * @param obj 
     */
    public void setObj(Object obj) {
        this.obj = obj;
    }
    /**
     * define para onde a referencia para prox do nó aponta.
     * @param prox 
     */
    public void setProx(No prox) {
        this.prox = prox;
    }
    /**
     * retorna o objeto contido nó.
     * @return 
     */
    public Object getObj() {
        return this.obj;
    }
    /**
     * retorna para onde o prox do nó aponta.
     * @return 
     */
    public No getProx() {
        return this.prox;
    }
    
}
