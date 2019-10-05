public class ListaEncadeada extends Lista {
    private No topo;

    @Override
    public void inserir(IElemento elem) {
        No novoNo = new No();
        novoNo.setNext(null);
        novoNo.setElemento(elem);
        if (topo == null) {
            topo = novoNo;
            tamanho = 1;
        } else {
            No aux = topo;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(novoNo);
            tamanho++;
        }

    }

    @Override
    public void remover(IElemento elem) {
        if (topo == null) {
            return;
        }

        No aux = topo;
        for (int i = 0; i < tamanho(); i++) {
            if (aux.getNext() != null) {
                if (elem.equals(aux.getNext().getElemento())) {
                    if (aux.getNext().getNext() != null)
                        aux.setNext(aux.getNext().getNext());
                    else
                        aux.setNext(null);
                    tamanho--;
                    return;
                }
                aux = aux.getNext();
            }
        }
    }


    @Override
    public void imprimir() {
        No aux = topo;
        for (int i = 0; i < tamanho(); i++) {
            System.out.print(aux.getElemento() + " ");
            aux = aux.getNext();
        }
        System.out.println();
    }
}
