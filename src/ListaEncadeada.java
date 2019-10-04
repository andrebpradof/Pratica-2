public class ListaEncadeada extends Lista  {
    private No topo;

    public void inserir(IElemento elem){
        No novoNo = new No();
        if(topo == null){
            topo = novoNo;
            topo.setElemento(elem);
            topo.setNext(null);
            tamanho = 1;
        }
        else {
            No aux = topo;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(novoNo);
            aux.getNext().setElemento(elem);
        }

    }

    public void remover(IElemento elem){

    }

    public void imprimir(){

    }
}
