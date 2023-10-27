/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 *
 * @author poo08alu44
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Poligono poligono;
        Triangulo triangulo = new Triangulo();
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        //System.out.println(poligono);
        System.out.println(triangulo);
        System.out.println(cuadrilatero);
        
        
        triangulo.setBase(5);
        triangulo.setAltura(3);
        
        cuadrilatero.setBase(4);
        cuadrilatero.setAltura(7);
        
        System.out.println(triangulo);
        System.out.println(triangulo.area());
        System.out.println(triangulo.perimetro());
        System.out.println(cuadrilatero);
        System.out.println(cuadrilatero.area());
        System.out.println(cuadrilatero.perimetro());
        
        poligono = new Triangulo();
        System.out.println(poligono);
        
        getPoligono(poligono);
        poligono = new Cuadrilatero();
        getPoligono(poligono);
        
        
        Flauta flauta = new Flauta();
        System.out.println(flauta.tipoInstrumento());
        
        
        System.out.println(Meses.NOMBRE_MESES[Meses.UNO]);
        System.out.println(Meses.NOMBRE_MESES[Meses.DOS]);
        System.out.println(Meses.NOMBRE_MESES[Meses.TRES]);
        System.out.println(Meses.NOMBRE_MESES[Meses.CUATRO]);
        System.out.println(Meses.NOMBRE_MESES[Meses.CINCO]);
        System.out.println(Meses.NOMBRE_MESES[Meses.SEIS]);
        System.out.println(Meses.NOMBRE_MESES[Meses.SIETE]);
        System.out.println(Meses.NOMBRE_MESES[Meses.OCHO]);
        System.out.println(Meses.NOMBRE_MESES[Meses.NUEVE]);
        System.out.println(Meses.NOMBRE_MESES[Meses.DIEZ]);
        System.out.println(Meses.NOMBRE_MESES[Meses.ONCE]);
        System.out.println(Meses.NOMBRE_MESES[Meses.DOCE]);
        
    }

    private static void getPoligono(Poligono poligono) {
        if(poligono instanceof Triangulo){
            System.out.println("Es un triángulo");
        }
        else if(poligono instanceof Cuadrilatero) {
            System.out.println("Es un cuadrilátero");
        }
        else{
            System.out.println("Es un polígono");
        }
    }

    
    
}
