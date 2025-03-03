import java.util.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void swap(ArrayList<String> list, int index1, int index2) {
		String stToSwap = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, stToSwap);
	}
	public static ArrayList<Double> createArrayList(double[] array) {
		ArrayList<Double> arrayList = new ArrayList<Double>();
		for(int i = 0; i < array.length; i++) {
			arrayList.add(array[i]);
		}
		return arrayList;
 	}
	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < names.length; i++) {
			map.put(names[i], ages[i]);
		}
		return map;
	}
	public static void increaseAge(HashMap<String, Integer> map, String name) {
		if(map.containsKey(name))
			map.put(name, map.get(name) + 1);
	}

}
