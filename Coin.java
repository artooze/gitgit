package coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	public HashMap<Integer, String> coinNames = new HashMap<Integer, String>();

	public Coin() {
		coinNames.put(1, "penny");
		coinNames.put(10, "dime");
		coinNames.put(25, "quarter");
		coinNames.put(50, "half-dolar");
	}

	public String getName(int amount) {
		if(coinNames.containsKey(amount)){
		return coinNames.get(amount);
		}else{
			return "NOT FOUND";
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Coin coin = new Coin();
		int amount = in.nextInt();
		String name = coin.getName(amount);
		System.out.println(name);
		System.out.println(coin.coinNames.keySet());
		for(Integer k : coin.coinNames.keySet()){
			System.out.println(coin.getName(k));
		}
		in.close();
	}

}
