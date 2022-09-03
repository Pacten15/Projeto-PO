package ggc;

import java.io.Serializable;

/** Class Estatuto implements a statute */
public class Estatuto implements Serializable {

    private EstatutoState _state = new Normal(this);

    private int _pontos;

    public Estatuto () {
        _pontos = 0;
    }

    public int getPontos() {
        return _pontos;
    }

    public void setPontos(int pontos) {
        _pontos = pontos;
    }

    protected void setState(EstatutoState state) {
        _state = state;
    }

    /* Implementar que os valores pagos instantaneamente numa desagregacao tambem dao direto 
    a contabilizacao postitica de pontos */

    /* Quando um parceiro paga uma venda dentro do prazo */
    public void aumentaPontos(float valorPago) {
        _state.aumentaPontos(valorPago);
    }

    public void despromove() {
        _state.despromove();
    } 

    public float multa(int data_atual, int data_lim, float preco, Produto p) {
        return _state.multa(data_atual, data_lim, preco, p);
    }

    public float desconto(int data_atual, int data_lim, float preco, Produto p) {
        return _state.desconto(data_atual, data_lim, preco, p);
    }

    public String toString() {
        return _state.toString();
    }
}