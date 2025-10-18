public class Calculadora {

	private int n1;
	private int n2;


    public Calculadora() {
        this.n1 = 0;
        this.n2 = 0;
    }

    public Calculadora(int num1, int num2) {
        this.n1 = num1;
        this.n2 = num2;
    }

	public int sumar() {
		// TODO - implement Calculadora.sumar
        return this.n1 + this.n2;
	}

	public int multiplicar() {
		// TODO - implement Calculadora.multiplicar
        return this.n1 * this.n2;
	}

	public void setN1(int num1) {
		// TODO - implement Calculadora.setN1
        this.n1 = num1;
	}

	public void setN2(int num2) {
		// TODO - implement Calculadora.setN2
        this.n2 = num2;
    }
}