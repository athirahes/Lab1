package exercise8;

import java.util.ArrayList;
import java.util.Iterator;
import exercise7.WeightOnMars;

public class WeightList {
	public WeightList() {
		WeightOnMars wMars1 = new WeightOnMars(27);
		WeightOnMars wMars2 = new WeightOnMars(10);
		WeightOnMars wMars3 = new WeightOnMars(35);

		ArrayList<WeightOnMars> MarsWeightlist = new ArrayList<WeightOnMars>();

		MarsWeightlist.add(wMars1);
		MarsWeightlist.add(wMars2);
		MarsWeightlist.add(wMars3);

		Iterator<WeightOnMars> MarsWeightIt = MarsWeightlist.iterator();

		while (MarsWeightIt.hasNext()) {
			MarsWeightIt.next().calculateWeight();
		}
	}
}