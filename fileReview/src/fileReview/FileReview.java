package fileReview;

//Writers
import java.io.BufferedWriter;
import java.io.FileWriter;

//Readers
import java.io.FileReader;
import java.io.BufferedReader;

//Catch our exceptions
import java.io.IOException;

public class FileReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Stetson","Duke","FSU","FGCU"};
		
		//Writes to the relative path
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("ncaaBracket.txt"));
			writer.write("Stetson University");
			writer.write("Duke University");
			

			
			for (String name : names) {
				writer.write("\n"+name);
			}
			writer.close();
			
			BufferedReader reader = new BufferedReader(new FileReader("ncaaBracket.txt"));
			System.out.println(reader.readLine());
			reader.close();
			
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
