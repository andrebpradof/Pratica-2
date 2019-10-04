public class No {
    private IElemento elemento;
    private No next;

    public IElemento getElemento() {
        return elemento;
    }

    public void setElemento(IElemento elemento) {
        this.elemento = elemento;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }
}
