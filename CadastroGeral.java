public class CadastroGeral {

	private Venda[] vendas;

	private Produtos[] produto;

	public CadastroGeral(){
		produto = new Produtos[5];
		vendas = new Venda[4];
		
	}


	public void cadastra(Produtos c, int i) {
		produto[i] = c;
		
	}

	public void cadastra(Venda v, int i) {
		vendas[i] = v;

	}
	
	public Venda[] getVendas() {
		return vendas;
	}

	public  Produtos[] getCameras() {
		return produto;
	}


	public String pesquisaTudo() {
		for (int i = 0; i < 5; i++) {
			produto[i].status();
		}
		for (int i = 0; i < 4; i++) {
			vendas[i].status();
		}
		return null;
	}

	public Venda pesquisa(int codigo) {
		for (int i = 0; i < 4; i++) {
			if (vendas[i].getCodigo() == codigo){
				return vendas[i];
			}
			else{
				System.out.println("Desculpe, nenhuma venda encontrada com este codigo:");
			}
		}
		return null;
	}

	public String pesquisaM(String marca) {
		for (int i = 0; i < 5; i++) {
			if (produto[i].getMarca() == marca){
				return marca;
			}
			else{
				System.out.println("Desculpe, venda não encontrada com esta marca.");
			}
		}
		return null;
	}


    public Object[] getProdutos() {
        return null;
    }

}

