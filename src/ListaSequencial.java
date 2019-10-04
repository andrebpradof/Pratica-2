public class ListaSequencial extends Lista {
    private IElemento data[];

    @Override
    public void inserir(IElemento elem){
        tamanho++;
        data[tamanho]=elem;
    }

    @Override
    public void remover(IElemento elem){
        int i;
        for (i=0; i<tamanho; i++){
            if(elem.equals(data[i])){
                while(i<tamanho){
                    data[i]=data[++i];
                }
                data[i]=null;
            }
        }
    }

    public void imprimir(IElemento){

    }
}
