package ggc;

import java.io.Serializable;

public abstract class EstatutoState implements Serializable {
    
    protected Estatuto _estatuto;

    public EstatutoState(Estatuto estatuto) {
        _estatuto = estatuto;
    }

    public abstract void aumentaPontos(float valorPago);

    public abstract void despromove();

    public abstract float multa(int data_atual, int data_lim, float preco, Produto p);

    public abstract float desconto(int data_atual, int data_lim, float preco, Produto p);

    public abstract String toString();
}