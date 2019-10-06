/*
Questões de prova:

    1. Quais são os métodos polimórficos do diagrama acima?
        Os métodos são: inserir(IElemento elem), remover(IElemento elem), imprimir() e equals().

    2. Por quê Lista foi implementada como uma classe abstrata e Imprimivel foi definida como uma interface?
        Lista foi implementada como classe abstrata pois ela serve de modelo para todas suas classes derivadas,
        tais como lista encadeada e sequencial.
        Imprimivel foi definida como uma interface pois nem todos os tipos de lista podem apresentar o
        método imprimir

    3. Como você poderia estender o diagrama acima para permitir que sua lista armazene objetos de
    uma classe Data (contendo mês, dia e ano)? Implemente.
        Primeiramente, seria criado uma classe Data com os respectivos atributos e métodos, como a classe Usuario
        e que implementaria a inteface IElemento.

    4. Explique quais (se existir) relacionamentos são do tipo: generalização (herança e interface),
    associação, agregação, composição e dependência.
        Generalização:
            Imprimivel com Lista
            Lista com ListaSequncial e ListaEncadiada
            IElemento com Usuario

        Composição
            ListaEncadeada com nó

        Dependência:
            Principal com ListaEncadeada, ListaSequencial e Usuario
            ListaEncadeada e ListaSequencial com IElemento

*/
public class Principal	{

    public	static	void	main(String[]	args)	{
        Lista lista;

        //	mudar	o	comando	abaixo	para	lista	=	new	ListaSequencial();
        //	deverá	gerar	o	mesmo	efeito!
        //lista	=	new ListaEncadeada();
        lista	=	new	ListaSequencial();
        lista.inserir(new Usuario("Marcelo"));
        lista.inserir(new Usuario("Joao"));
        lista.inserir(new Usuario("Pedro"));
        lista.inserir(new Usuario("Gustavo"));
        lista.inserir(new Usuario("Larissa"));
        //lista.inserir(new Usuario("Flavia"));
        lista.imprimir();
        lista.remover(new Usuario("Gustavo"));
        lista.remover(new Usuario("Flavia"));
        lista.imprimir();
    }
}