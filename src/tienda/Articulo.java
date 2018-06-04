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
public class Articulo {
    private String titulo;
    private double precio;
    private int cod_Barras;
    
    public Articulo(int cod_Barras){
        this.cod_Barras=cod_Barras;
    }
    public void datos(String titulo, double precio){
        this.titulo = titulo;
        this.precio= precio;
    }
    
    @Override public String toString(){
        return "\nCodigo de Barras: " + this.cod_Barras + "\nTitulo: " + this.titulo + "\nPrecio: " + this.precio;
    }
    
    public int GetCod_Barras(){
        return this.cod_Barras;
    }
}
