package poop8;

/**
 *
 * @author poo08alu44
 */
public class Triangulo extends Poligono{
    private int alfa, beta, gamma;
    private float a, b, c, base, altura;
    
    public Triangulo() {
    }

    public Triangulo(int alfa, int beta, int gamma, 
            float a, float b, float c, 
            float base, float altura) {
        
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
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

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
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
    public int area(){
        return (int)(base*altura)/2;
    }
    
    @Override
    public int perimetro(){
        return (int)(a+b+c);
    }
    
    @Override
    public String toString() {
        return super.toString()+"Triangulo{" + "alfa=" + alfa + ", "
                + "beta=" + beta + ", gamma=" + gamma + ""
                + ", a=" + a + ",b=" + b + ", c=" + c + 
                ", base=" + base + ", altura=" + altura + '}';
    }
}
