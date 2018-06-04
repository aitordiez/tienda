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
public class Libros extends Articulo{
    private String autor;
    
    public Libros(int cod_Barras){
        super(cod_Barras);
    }
    
    public void datos(String titulo, double precio, String autor){
        super.datos(titulo,precio);
        this.autor = autor;
    }
    
    public String toString(){
        return super.toString() + "\nAutor: " + this.autor;
    }
}
