import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {
	
	public static void main(String[] args) {
		Integer[] a = {8,2,6,9,7,3,4,1,5};
		List<Integer> list = Arrays.asList(a);
		list.sort((i1, i2) -> i1 - i2);
		System.out.println(list.toString());
	}
	
	public int findMin(List<Integer> list)
	{
		int min = 1000;
		for(int num : list)
		{
			if(num < min)
			{
				min = num;
			}
		}
		return min;
	}
	
	public String sortList(List<Integer> list)
	{
		List<Integer> newList = new ArrayList<Integer>();
		for(int num : list)
		{
			int min = new Sorting().findMin(list);
			newList.add(min);
			list.set(list.indexOf(min), 1000);
		}
		return newList.toString();
	}
	
	public int findMin2(List<Integer> list, int start)
	{
		int min = 1000;
		for(int i = start; i < list.size(); i++)
		{
			if(list.get(i) < min)
			{
				min = list.get(i);
			}
		}
		return min;
	}
	
	public String sortList2(List<Integer> list)
	{
		for(int i = 0; i < list.size(); i++)
		{
			int min = new Sorting().findMin2(list, i);
			new Sorting().swap(list, list.indexOf(min), i);
		}
		return list.toString();
	}
	
	public void swap(List<Integer> list, int indexOne, int indexTwo)
	{
		int numOne = list.get(indexOne);
		int numTwo = list.get(indexTwo);
		list.set(indexOne, numTwo);
		list.set(indexTwo, numOne);
	}

}
