import java.util.HashMap;
import java.util.Map;

public class StreamFuncs {

	public static void main(String[] args) {


		Map<Integer,String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(4, "c");
		map.put(5, "d");
		
		map.entrySet().stream().filter(s-> s.getKey()%2==0).forEach(o->System.out.println(o));
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}

}
