package Arrays;

import Conta.Conta;

public class GuardadorRef {

    private Object[] ref;
    int aux;

    public GuardadorRef() {
        this.ref = new Object[10];
        this.aux = 0;
    }

    /**
     * Metodo que Adiciona o Objeto para a referencia
     * e guardando a no Indice do Array,
     * e Somando mais um idex para o Auxiliar
     * que guarda o Index Livre
     * @param obj
     */
    public void add(Object obj){
        this.ref[this.aux] = obj;
        this.aux ++;
    }

    /**
     * Mostra o objeto que esta Guardado no Indice
     * @param p
     * @return
     */
    public Object mostrarObjeto(int p){
        return this.ref[p];

    }
}
