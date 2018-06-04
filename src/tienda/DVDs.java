/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author aitorchic
 */
public class DVDs extends Articulo{
    public DVDs(int cod_Barras){
        super(cod_Barras);
    }
    
    public void dados(String titulo,double precio){
        super.datos(titulo,precio);
    }
    
    @Override public String toString(){
        return super.toString();
    }
}
