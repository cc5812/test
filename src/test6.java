import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class test6 {
public static void main(String[] args) {
        Set<String> set = new HashSet<String>();  
        set.add("AA");  
        set.add("BB");  
        set.add("CC");  
          
        String[] arr = new String[set.size()];    
        //Set-->数组    
        set.toArray(arr);   
        System.out.println(Arrays.toString(arr));    
}
}
