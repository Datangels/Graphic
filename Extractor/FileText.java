package Extractor;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
public class FileText {
	public FileText() throws IOException {
		Date dNow = new Date();
		SimpleDateFormat date = new SimpleDateFormat ("yyyy_MM_dd_hh_mm");
		File folder = new File("C:/Users/admin/workspace/Graphic/src/Engine");
		File[] listOfFiles = folder.listFiles();
		PrintWriter writer = new PrintWriter("C:/Users/admin/Desktop/Graphic/" +  date.format(dNow) + System.currentTimeMillis() + ".txt", "UTF-8");
		for (File file : listOfFiles) {
			if (file.isFile()) {
				FileInputStream fstream = new FileInputStream("C:/Users/admin/workspace/Graphic/src/Engine/" + file.getName());
				//create the object of datainputstream
				DataInputStream in = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				//read data line by line from the file
				String s;
				while((s = br.readLine() ) != null) {
					writer.println(s);
				}
				in.close();
			}
		}
		writer.close();
	}
}