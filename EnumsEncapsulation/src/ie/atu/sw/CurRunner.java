package ie.atu.sw;

import java.util.Arrays;

public class CurRunner {
	
	public static void main(String[] args) {
		var euro = Currency.EUR;
		var bit = Currency.BTC;
		
		var res = euro.convertTo(bit, 10_000, 0.000011);
		System.out.println(res);
		System.out.println(euro.getSymbol());
		System.out.println(euro.getName());
		System.out.println(euro.getPrecision());
		
		Currency[] all = Currency.values();
		System.out.println(Arrays.toString(all));
	}

}
