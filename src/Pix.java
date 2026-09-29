public class Pix extends Pagamento{

    private double saldo;

    public Pix(double saldo) {
        super();
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void processar(double valor) {
        if(valor > saldo){
            IO.println("Compra não autorizada, saldo insuficiente");
        }else {
            IO.println("Compra aprovada, ID:" + getId());
        }
    }
}

