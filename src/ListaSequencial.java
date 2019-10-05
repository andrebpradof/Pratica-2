public class ListaSequencial extends Lista {
    private IElemento[] data = new IElemento[10];

    @Override
    public void inserir(IElemento elem) {
        data[tamanho] = elem;
        tamanho++;
    }

    @Override
    public void remover(IElemento elem) {
        int i;
        for (i = 0; i < tamanho; i++) {
            if (elem.equals(data[i])) {
                tamanho--;
                while (i < tamanho) {
                    data[i] = data[++i];
                }
                data[i] = null;
            }
        }
    }

    @Override
    public void imprimir() {
        for (int i = 0; i < tamanho(); i++) {
            System.out.print(data[i].toString() + " ");
        }
        System.out.println();
    }
}
