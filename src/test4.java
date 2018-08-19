import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class test4 {
public static void main(String[] args) {
	List<Map<String, String>> list = new ArrayList<Map<String,String>>();
	Map<String, String> mapString = new HashMap<String, String>();
	mapString.put("zhangsan", "12");
	list.add(mapString);
	for (Map<String, String> map : list) {
		map.put("wangwu", "13");
	    Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();  
	    while (it.hasNext()) {  
	        Map.Entry<String, String> entry = it.next();  
	        System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());  
	    }  
	}
}
}
