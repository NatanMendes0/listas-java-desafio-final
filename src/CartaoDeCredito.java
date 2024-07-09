import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite, saldo;
    private List<Compra> compras;

    //sempre inicializar uma instancia com um limite
    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    /*
        A função lancaCompra (abaixo) recebe uma nova compra e verifica se o saldo da conta é maior ou igual o valor da compra,
        retornando true. Se for menor, não deixa o usuário criar a compra
     */

    public boolean lancaCompra(Compra compra){
        if(this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        } else {
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
