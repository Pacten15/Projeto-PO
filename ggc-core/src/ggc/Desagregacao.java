package ggc;

import java.io.Serializable;

public class Desagregacao extends Transacao implements Serializable {

    private float _precoBase;

    public Desagregacao(Parceiro parceiro, int dataPagamento,int quantidade, Produto produto,float precoBase, float precoPagar) {
        super(dataPagamento,parceiro,quantidade,produto,precoPagar);
        _precoBase = precoBase;
    }


    public float getPrecoBase(){
        return _precoBase;
    }

    @Override
    public String toString()
    {
        return "DESAGREGAÇÃO" + "|" + super.getIdTrans() + "|" + super.getParceiro() + "|" + super.getProduto().getProductId() + "|" + super.getQuantidade() + "|" + _precoBase + "|" + super.getPrecoPago() + "|" +  super.getDataPagamento() + "|" + super.getProduto().receitaString();
    }


    


}