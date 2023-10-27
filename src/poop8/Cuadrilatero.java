package poop8;

/**
 *
 * @author poo08alu44
 */

public class Cuadrilatero extends Poligono{
    private int alfa, beta, gamma;
    private float a, b, base, altura;

    public Cuadrilatero() {
    }

    public Cuadrilatero(int alfa, int beta, int gamma, 
            float a, float b, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public int getGamma() {
        return gamma;
    }

    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public int perimetro() {
        return (int)(2*base + 2*altura);
    }

    @Override
    public int area() {
        return (int)(base*altura);
    }

    @Override
    public String toString() {
        return super.toString()+"Cuadrilatero{" + "alfa=" + alfa + 
                ", beta=" + beta + ", gamma=" + gamma + 
                ", a=" + a + ", b=" + b + ", base=" + base + 
                ", altura=" + altura + '}';
    }
    
}