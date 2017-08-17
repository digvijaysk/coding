package hack.sweta;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Locale;

public class PlainGates {

	public static void main(String[] args) {
		//int[] arrival = { 900, 940, 950, 1100, 1500, 1800 }, departures = { 910, 1200, 1120, 1130, 1900, 2000 };
		// int[] arrival = {100, 140, 150, 200, 215, 400}, departures =
		// {110,300,220,230,315,600};

		// Arrays.sort(departures);

		//System.out.println(findMinGates(arrival, departures, 6));
		Calendar c = Calendar.getInstance();
		c.set(2015, 07, 5);
		//int day = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH).toUpperCase());
	}

	private static int findMinGates(int[] arrivals, int[] departures, int flights) {
		for (int dep : departures) {
			if (dep < arrivals[0]) {
				dep = dep + 2400;
			}
		}

		Arrays.sort(departures);
		int gates = 0;
		int arr = 0;
		int dep = 0;
		int maxGates = 0;
		while (arr < arrivals.length) {
			if (arrivals[arr] <= departures[dep]) {
				gates++;
				arr++;
				if (gates > maxGates) {
					maxGates = gates;
				}
			} else {
				gates--;
				dep++;
			}
		}

		return maxGates;
	}
}
