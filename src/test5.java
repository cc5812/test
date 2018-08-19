import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class test5 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Set<Integer>  set = new HashSet<Integer>();
//		List list  = new ArrayList();
		
		int[] numbers1 = {1, 2, 3, 4, 5};
		int[] numbers2 = {1, 3, 5 ,2 ,7};
		for (int i = 0; i < numbers1.length; i++) {
			for (int j = 0; j < numbers2.length; j++) {
				if(numbers1[i] == numbers2[j]){
					set.add(new Integer(numbers1[i]));
				}
			}
		}
		Integer[] arr = new Integer[set.size()];    
        set.toArray(arr);   
        for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
