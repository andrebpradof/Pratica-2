public class Principal	{

    public	static	void	main(String[]	args)	{
        Lista lista;

        //	mudar	o	comando	abaixo	para	lista	=	new	ListaSequencial();
        //	deverá	gerar	o	mesmo	efeito!
        lista	=	new ListaEncadeada();
        lista.inserir(new Usuario("Marcelo"));
        lista.inserir(new Usuario("Joao"));
        lista.inserir(new Usuario("Pedro"));
        lista.inserir(new Usuario("Gustavo"));
        lista.inserir(new Usuario("Larissa"));
        lista.inserir(new Usuario("Flavia"));
        lista.imprimir();
        lista.remover(new Usuario("Gustavo"));
        lista.imprimir();
    }
}