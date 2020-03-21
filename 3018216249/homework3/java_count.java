package homework2;
import java.util.*;
public class java_count {
	public static void main(String[] args)
	{
		Map<String, Integer> countMap= new HashMap<String, Integer>();
		
		for (int i = 0; i < args.length; i++)
		{
			if (!countMap.containsKey(args[i]))
			{
				countMap.put(args[i], 1);
				
			}
			else
			{
				int val=countMap.get(args[i]);
				countMap.put(args[i] , val+ 1);
			}
		}
		for (Map.Entry<String, Integer> mapEntry : countMap.entrySet())
		{
			System.out.print(mapEntry.getKey() + " = " + mapEntry.getValue()+"\n");
		}
	}
}


