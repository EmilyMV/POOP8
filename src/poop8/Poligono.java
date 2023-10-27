/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author poo08alu44
 */
public abstract class Poligono extends Object{

    public Poligono() {
    }
    
    public abstract int area();
    public abstract int perimetro();

    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
