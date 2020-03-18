import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class test {
	public static void main(String[] args) throws IOException {
		String file="G:\\chrome download\\了不起的盖茨比英文.txt";
		String filename="G:\\output.txt";
		ReadBooks book = new ReadBooks(file);
		List<String> eachline = book.getwords();
		FileWriter fileWriter= new FileWriter(filename);
		for(int i=0;i<book.getresult(eachline).size();i++) {
			fileWriter.write(book.getresult(eachline).get(i).getKey()+" "+book.getresult(eachline).get(i).getValue()+"\r\n");
			System.out.print(book.getresult(eachline).get(i).getKey()+" "+book.getresult(eachline).get(i).getValue()+"\n");
		}

		fileWriter.flush();
		fileWriter.close();
		
	}
}
