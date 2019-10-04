public class Usuario implements IElemento {
    private String nome;

    @Override
    public boolean equals(IElemento elem) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String s) {
        this.nome = s;
    }
}
