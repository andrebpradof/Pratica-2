public class Usuario implements IElemento {
    private String nome;

    Usuario(String nome){
        this.nome = nome;
    }

    @Override
    public boolean equals(IElemento elem) {
        if(elem instanceof Usuario){
            Usuario u = (Usuario)elem;
            return this.nome.equals(u.nome);
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String s) {
        this.nome = s;
    }

    @Override
    public String toString(){
        return nome;
    }
}
