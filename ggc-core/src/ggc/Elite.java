package ggc;

import java.io.Serializable;

public class Elite extends EstatutoState implements Serializable {

    public Elite(Estatuto estatuto) {
        super(estatuto);
    }

    @Override
    public void aumentaPontos(float valorPago) {
        int pontos = _estatuto.getPontos();
        pontos += Math.round(10f * valorPago);
    }

    @Override
    public void despromove() {
        int pontos = _estatuto.getPontos();
        pontos = Math.round(pontos * 0.25f);
        _estatuto.setPontos(pontos);
        _estatuto.setState(new Selection(_estatuto));
    }

    @Override
    public float multa(int data_atual, int data_lim, float preco, Produto p) {
        return preco;
    }

    @Override
    public float desconto(int data_atual, int data_lim, float preco, Produto p) {
        int n = p.getN();
        int d = data_lim - data_atual;
        int d2 = data_atual - data_lim;
        if ((d >= n) || (0 <= d && d < n)){
            preco = preco * 0.9f;
        }
        else if (0 < d2 && d2 <= n) {
            preco = preco * 0.95f;
        }
        return preco;
    }

    @Override
    public String toString() {
        return "ELITE";
    }

}