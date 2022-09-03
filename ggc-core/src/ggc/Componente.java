package ggc;

import java.io.Serializable;

import java.util.ArrayList;

/** Public class Componente implements a component of a product (class Produto) */
public class Componente extends Produto implements Serializable
{ 
    /** Amount of this component on the product */
    private int _nComponente;

    /**
     * @param Produto the product corresponding to the component
     * @param nComponente number of elements of this component on the product
     */

    public Componente(String idProduto,int nComponente)
    {
        super(idProduto);
        _nComponente = nComponente;
        
    }

    public int getNComponente()
    {
        return _nComponente;
    }

    public String toStringComp()
    {
        return super.toString() + ":" +_nComponente + "#";
    }

}