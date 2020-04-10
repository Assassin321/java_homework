package homework04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class copy_file {
	public static void main(String[] args) throws IOException
	{
		String url1 = "C:\\Users\\Bleach\\Desktop\\gun.jpg";
		String url2 = "C:\\Users\\Bleach\\Desktop\\copy\\gun_copy.jpg";
		File fileurl1 = new File(url1 );
		File fileurl2 = new File(url2 );
		
		try 
		{
			InputStream input = new FileInputStream(fileurl1);
			if(fileurl2.getParentFile().exists()== false)
			{
				fileurl2.getParentFile().mkdirs();                       
			}
	        OutputStream output = new FileOutputStream(fileurl2);
			try
			{
				StringBuffer buf = new StringBuffer();
				byte[] bytes = new byte[1024];
				int length = input.read(bytes);
				while (length != -1)
				{
					output.write(bytes, 0, length);
					length = input.read(bytes);
				}	
				System.out.println("Succeed");
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			finally
			{ 
				input.close();
				output.close();
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
