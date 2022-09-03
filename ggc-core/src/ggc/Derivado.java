
package ggc;
import java.util.ArrayList;
import java.util.HashMap;

import java.io.Serializable;

/** Public class Derivado implements a derivative product */
public class Derivado extends Produto implements Serializable
{

    /** List of components (recipe) */
    private ArrayList<Componente> _receita = new ArrayList<Componente>();

    /** aggravation */
    private float _agravamento;

    /**
     * @param idProduto id of product to be created
     * @param receita recipe (array list of components) of this product
     * @param agravamento aggravation
     */
    public Derivado(String idProduto,ArrayList<Componente> receita,float agravamento)
    {
            super(idProduto, 3);
             _receita = receita;
            _agravamento = agravamento;
    }

    /**
     * @param componente component
     */
    public void colocaComponente(Componente componente)
    {
        _receita.add(componente);
    }

    /**
     * @return the current aggravation.
     */
    public float getAgravamento()
    {
        return _agravamento;
    }

    /**
     * @return the recipe.
     */
    public ArrayList<Componente> getReceita()
    {
        return _receita;
    }

  /**coverts a recipe to a string of components 
  *@param receita recipe 
  *@return recipe string version
  */
    public String receitaString()
    {
        String compoString = "";
        for(Componente c: _receita){
            if(_receita.get(_receita.size() - 1).getProductId().equals(c.getProductId()))
            {
                compoString += c.getProductId() + ":" + c.getNComponente();
            }
            else
            {
                compoString += c.toStringComp();
            }
        }
        return compoString;
    }

    public String addDerivStuff()
    {
        return  "|" +  _agravamento + "|" + receitaString();
    }
    

}