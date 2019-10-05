public class Data implements IElemento{
    private int dia;
    private int mes;
    private int ano;

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public boolean equals(IElemento elem) {
        if(elem instanceof Data){
            Data d = (Data) elem;
            return this.dia == d.dia && this.mes == d.mes && this.ano == d.ano;
        }
        return false;
    }
}
