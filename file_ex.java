package demo;

import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class file_ex {
	public static void main(String[] args) throws IOException{
		File fileObj = new File("/Users/raunakbhansali/Downloads/Java_epita.txt");
		try {
			if(fileObj.createNewFile()) {
				System.out.println("New file created");
			}
			else {
				System.out.println("Already Exist");
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// method -- 1
		FileWriter fileWriter = new FileWriter("/Users/raunakbhansali/Downloads/Java_epita.txt");
		fileWriter.append("Java programming is easy");
		fileWriter.close();
		
		// method -- 2
		try {
			FileWriter fileNewObj = new FileWriter("/Users/raunakbhansali/Downloads/Java_epita.txt");
			System.out.println("enter your file content: ");
			Scanner scanInput = new Scanner(System.in);
			String data = "";
			
			while (scanInput.hasNextLine()) {
				data = scanInput.nextLine();
				System.out.println("File :" + data);
			}
			fileNewObj.write(data);
			fileNewObj.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// method -- 3
		Scanner sc = new Scanner(System.in);
		FileWriter file = new FileWriter("/Users/raunakbhansali/Downloads/Java_epita.txt");
		String info = "";
		BufferedWriter bw = null;
		try {
			System.out.println("Enter the text: ");
			bw = new BufferedWriter(file);
			while (!info.contentEquals("/")) {
				info = sc.nextLine();
				bw.write(info, 0, info.length());
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		bw.close();
		sc.close();
	}
}
