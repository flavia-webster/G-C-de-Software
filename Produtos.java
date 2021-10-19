public class Produtos {

        public Produtos(String marc, int prec){
            marca = marc ;
            preco = prec ;
        }
    
        public Produtos(String marca){
            this.marca = marca;
        }
    
    
        public Produtos(){
    
        }
    
        private String marca;
    
        private double preco;
    
        private Venda[] venda;
    
        public String getMarca() {
            return marca;
        }
    
        public double getPreco() {
            return preco;
        }
    
        public Venda[] getVenda() {
            return venda;
        }
    
        public void setMarca(String marca) {
            this.marca = marca;
        }
    
        public void setPreco(double preco) {
            this.preco = preco;
        }
    
        public void setVenda(Venda[] venda) {
            this.venda = venda;
        }
    
        
    
        void status(){
            System.out.println("Produto " + this.marca);
            System.out.println("Preço:" + this.preco);
    
        }
}

