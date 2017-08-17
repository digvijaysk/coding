package hack.amazon.practice;
import java.util.ArrayList;
class Interval {
	int buy, sell;
}
public class StockMarket {
	// This function finds the buy sell schedule for maximum profit
	void stockBuySell(int price[], int n) {
		if (n == 1)
			return;
		int count = 0;
		ArrayList<Interval> sol = new ArrayList<Interval>();
		int i = 0;
		while (i < n - 1) {
			while ((i < n - 1) && (price[i + 1] <= price[i]))
				i++;
			// If we reached the end, break as no further solution possible
			if (i == n - 1)
				break;
			Interval e = new Interval();
			e.buy = i++;
			while ((i < n) && (price[i] >= price[i - 1]))
				i++;
			// Store the index of maxima
			e.sell = i - 1;
			sol.add(e);
			// Increment number of buy/sell
			count++;
		}
		if (count == 0)
			System.out.println("There is no day when buying the stock " + "will make profit");
		else
			for (int j = 0; j < count; j++)
				System.out.println("Buy on day: " + sol.get(j).buy + "        " + "Sell on day : " + sol.get(j).sell);

		return;
	}
}
