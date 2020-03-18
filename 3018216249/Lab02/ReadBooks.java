import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ReadBooks {
	private String file;
	public ReadBooks(String filename) {
		this.file=filename;
		
	}
	public   List<String>  getwords(){
		Reader reader;
		try {
			reader = new FileReader(this.file);
			BufferedReader bufferedReader = new BufferedReader(reader);
			List<String> sentences=new ArrayList<>();
			String line;
			try {
				line = bufferedReader.readLine();
				while (line!=null){
					sentences.add(line);
					line=bufferedReader.readLine();
					}
				return sentences;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	private String [] sentence_spilt(String sentence) {
		return sentence.split("\\s");
	}
	public List<Map.Entry<String,Integer>> getresult(List<String>  eachlines){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i =0;i<eachlines.size();i++)
		{
			
			String [] line = this.sentence_spilt(eachlines.get(i));
			for (int m =0;m<line.length;m++) {
					if(!map.containsKey(line[m])) {
						map.put(line[m], 1);	
					}
					else {
						 int val = map.get(line[m]);
						 map.put(line[m], val+1);
						
							}
					}
		}
		List<Map.Entry<String,Integer>> list = new ArrayList<Map. Entry<String,Integer> >(map.entrySet());
	        //然后通过比较器来实现排序
	        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {
	            public int compare(Entry<String, Integer> o1,
	                    Entry<String, Integer> o2) {
	                return -o1.getValue().compareTo(o2.getValue());
	            }
	            
	        });
	        list.remove(0);
		return list;
}
		
		
}
