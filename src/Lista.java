public abstract class Lista implements Imprimivel{
    protected int tamanho;

    public int tamanho(){
        return 1;
    }

    public abstract void inserir(IElemento elem);

    public abstract void remover(IElemento elem);

}
