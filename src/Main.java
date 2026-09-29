void main() {
    Pix pix = new Pix(200);

    pix.processar(150);
    pix.processar(50);

    Cartao cc = new Cartao(400);
    cc.processar(370);

    Boleto boleto = new Boleto(2026, 9, 22);
    boleto.processar(300);
}