public class Usuario implements IElemento {
    private String nome;

    Usuario(String nome){
        this.nome = nome;
    }

    @Override
    public boolean equals(IElemento elem) {
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String s) {
        this.nome = s;
    }
}
