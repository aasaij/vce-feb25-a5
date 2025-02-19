package day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceDemo {

	public static void main(String[] args) {
		System.out.print("Enter file name to read : ");
		String fileName = new java.util.Scanner(System.in).nextLine();
		try(FileInputStream fin = new FileInputStream(fileName)) {
			while(true) {
				int ch = fin.read();
				if (ch == -1)
					break;
				System.out.print((char)ch);
			}
		}
		catch(FileNotFoundException ex) {
			System.out.println(fileName + " does not exist!");
		}
		catch(IOException ex) {
			System.out.println("File reading error! " + ex.getMessage());
		}
		
	}

}
