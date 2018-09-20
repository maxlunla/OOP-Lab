
public class ComplexNumber {
	private double rm;
	private double im;
	
	public ComplexNumber() {
		
	}
	public ComplexNumber(double rm, double im) {
		this.rm = rm;
		this.im = im;
	}
	
	public void plus(ComplexNumber complexNumber) {
		this.rm += complexNumber.rm;
		this.im += complexNumber.im;
	}
	public void minus(ComplexNumber complexNumber) {
		this.rm -= complexNumber.rm;
		this.im -= complexNumber.im;
	}
	public void multiply(ComplexNumber complexNumber) {
		this.rm *= complexNumber.rm;
		this.im *= complexNumber.im;
	}
	
	public String toSting() {
		return Double.toString(this.rm) +"\n"+ Double.toString(this.im);
	}

	public boolean equals(Object complexNumber) {
		if(complexNumber instanceof ComplexNumber && (this.rm == ((ComplexNumber)complexNumber).rm && this.im == ((ComplexNumber)complexNumber).im))
			return true;
		return false;
	}
	public void print() {
		System.out.printf("\"rm %s im %s\"\n", this.rm, this.im);
	}
	public static void main(String[] args) {
		ComplexNumber cpn1 = new ComplexNumber(20, 40);
		ComplexNumber cpn2 = new ComplexNumber(30, 20);
		
		cpn1.plus(cpn2); 
		cpn1.print();
		System.out.println(cpn1.toSting());
		System.out.println(cpn1.equals(cpn2));
		
	}
}
