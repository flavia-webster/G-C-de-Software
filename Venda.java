public class Venda {

	private int codigo;
	
	private String comprador;

	private Produtos produto;
	  

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setComprador(String comprador) {
		this.comprador = comprador;
	}
	public String getComprador() {
		return comprador;
	}
	public void setProduto(Produtos camera) {
		this.produto = camera;
	}
	public Produtos getCamera() {
		return produto;
	}

	void status(){
		System.out.println("Vendas:" + this.codigo);
		System.out.println("Vendas:" + this.comprador);
		System.out.println("Vendas:" + this.produto);

	}
    public void setProdutos(Object object) {
    }
}
