package ggc;

import java.io.Serializable;

public class Compra extends Transacao implements Serializable {


    public Compra(Parceiro parceiro, int dataPagamento,Produto produto, int quantidade, float precoPago) {
        super(dataPagamento, parceiro,quantidade,produto,precoPago); 
    }



    @Override
    public String toString()
    {
        return "COMPRA" + "|" + super.getIdTrans() + "|" + super.getParceiro().getId() + "|" + super.getProduto().getProductId() + "|" + super.getQuantidade() + "|" + super.getPrecoPago() + "|" + super.getDataPagamento();
    }
}