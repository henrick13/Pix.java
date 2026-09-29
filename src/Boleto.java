import java.time.LocalDate;

public class Boleto extends Pagamento {

    private LocalDate vencimento;

    public Boleto(int i, int i1, int i2) {
        this.vencimento = LocalDate.of(2026, 9, 22);
    }

    public Boleto() {

    }

    @Override
    public void processar(double valor) {
        IO.println("O vencimento para " + vencimento + " no valor de R$ " + valor);
    }
}