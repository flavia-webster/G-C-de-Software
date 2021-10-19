import java.util.Scanner;

public class Main {
		

	public CadastroGeral cd = new CadastroGeral();
	

	

	public static void main(String[] args) {
		Main m = new Main();
		System.out.println("Menu:");
		System.out.println("1 - Mostrar vendas cadastradas: ");
		System.out.println("2 - Pesquisar venda por código: ");
		System.out.println("3 - Pesquisar venda por marca: ");
		System.out.println("4 - Sair");

		m.processar();


	}

	public void inicializar() {






		Produtos c = new Produtos();
		c.setMarca("Sony");
		c.setPreco(3500);
		cd.cadastra(c, 0);
		c = new Produtos();
		c.setMarca("Canon");
		c.setPreco(1900);
		cd.cadastra(c, 1);
		c = new  Produtos();
		c.setMarca("Nikon");
		c.setPreco(2100);
		cd.cadastra(c, 2);
		c = new  Produtos();
		c.setMarca("Olympus");
		c.setPreco(4500);
		cd.cadastra(c, 3);
		c = new  Produtos();
		c.setMarca("Pentax");
		c.setPreco(6000);
		cd.cadastra(c, 4);

		Venda v = new Venda();
		v.setComprador("Marcio");
		v.setCodigo(4698566);
		v.setProdutos(cd.getProdutos()[3]);
		cd.cadastra(v, 0);
		v = new Venda();
		v.setComprador("André");
		v.setCodigo(1598714);
		v.setProdutos(cd.getProdutos()[1]);
		cd.cadastra(v, 1);
		v = new Venda();
		v.setComprador("Will");
		v.setCodigo(1598713);
		v.setProdutos(cd.getProdutos()[4]);
		cd.cadastra(v, 2);
		v = new Venda();
		v.setComprador("Nélson");
		v.setCodigo(1598712);
		v.setProdutos(cd.getProdutos()[3]);
		cd.cadastra(v, 3);
			
	}

	

	public void processar() { //Apresenta falhas no menu.
		int sca ;
		int s;
		Scanner teclado = new Scanner(System.in);
		sca = teclado.nextInt();
		while (sca == 1) {
		System.out.println("você optou pela opção: 1");
		cd.pesquisaTudo();
		}
		while (sca == 2){
		System.out.println("você optou pela opção: 2");
		s = teclado.nextInt();
		cd.pesquisa(s);
		}
		while (sca == 3){
		System.out.println("você optou pela opção: 3");
		cd.pesquisaM("");
		}
		while (sca == 4){
		System.out.println("você optou pela opção: 4");	
		System.exit(0);
		}
	}
}
