import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class converttomap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> m=new HashMap<>();
		m.put("1", "anu");
		m.put("2", "kriti");
		m.put("3", "nigam");
		List<String> list=new ArrayList(m.keySet());
		
			System.out.println("the keys are"+list);
			
	
		List<String> list1=new ArrayList(m.values());
	
			System.out.println("the values are"+list1);
	
	}

}
