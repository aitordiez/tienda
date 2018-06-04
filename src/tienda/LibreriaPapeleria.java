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
import java.util.ArrayList;
import java.util.Scanner;
public class LibreriaPapeleria {
    static int cod_Barras;
    public static void main(String[] args){
        ArrayList<Articulo> articulos = new ArrayList<>();
        DVDs dvd0 = new DVDs(456456456);
        dvd0.datos("La araña", 25.00);
        DVDs dvd1 = new DVDs(123123123);
        dvd1.datos("El Ultimo Baile", 30.00); 
        Libros libro0 = new Libros(741741741);
        libro0.datos("La isla del Tesoro", 25.00, "Descartes");
        Libros libro1 = new Libros(258258258);
        libro1.datos("Casualidad", 35.00, "Juan Uriarte");
        articulos.add(dvd0);
        articulos.add(dvd1);
        articulos.add(libro0);
        articulos.add(libro1);
        for(Articulo articulo : articulos){
            System.out.println(articulo.toString());
        }
        Scanner entrada = new Scanner(System.in);
        System.out.println("\ninforme o codigo de barras del articulo: ");
        cod_Barras = entrada.nextInt();
        LibreriaPapeleria.LocalizaProd(articulos,cod_Barras);
    }
    public static void LocalizaProd(ArrayList<Articulo> articulos, int cod_Barras){
        for(Articulo articulo : articulos){
            if(articulo.GetCod_Barras() == cod_Barras){
                System.out.println(articulo.toString());
                return;
            }
        }
        System.out.println("Articulo no encontrado");
    }
}
