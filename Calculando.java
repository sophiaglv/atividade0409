package calculos;

public class Calculando implements InterfaceCalculos {
	
	int num1 = 5;
	int num2 = 5;
	
	@Override
	public double somar() {
		System.out.println(num1+num2);
		return 0;
	}
	@Override
	public double sub() {
		System.out.println(num1-num2);
		return 0;
	}
	@Override
	public double mult() {
		System.out.println(num1*num2);
		return 0;
	}
	@Override
	public int div() {
		System.out.println(num1/num2);
		return 0;
	}
	@Override
	public int exp() {
		System.out.println(Math.pow(num1, num2));
		return 0;
	}
}
