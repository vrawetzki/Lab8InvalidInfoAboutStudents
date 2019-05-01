import java.math.BigDecimal;

public class BigDecimalEx {

	public static void main(String[] args) {
		System.out.println(0.2 + 0.7);
		
		BigDecimal b = new BigDecimal("0.2"); // here we can initialize a double value
		
		System.out.println(new BigDecimal("0.2").add(new BigDecimal("0.7")));
		
	}
}
