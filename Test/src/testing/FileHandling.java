package testing;

import java.io.*;
import java.util.Scanner;

public class FileHandling {
	//String s;
/*	public void readFileCharacterWise() throws IOException {
		File f = new File("C:\\Users\\shekhar.sachdeva\\Desktop\\halo.txt");
		
		FileReader fr = new FileReader(f);
		
		int a;
		char b;
	
//	int a =	fr.read();
		//char b= (char)a;
	while((a = fr.read())!=-1) {
		
		b = (char)a;
		
	
		System.out.println(b);
		
		//System.out.println("tr");
	}
		//System.out.println("hello");
	
	}
	
	public void readFileLineWise() throws IOException {
		File f = new File("C:\\Users\\shekhar.sachdeva\\Desktop\\bhati.txt");
		
		FileReader fr = new FileReader(f);
		
		File f1 = new File("C:\\Users\\shekhar.sachdeva\\Desktop\\saahil.txt");
		
		FileWriter fw = new FileWriter(f1);
		
		
		
		BufferedReader br = new BufferedReader(fr);
		String s;
	    s=br.readLine();
	    
	    while(s!=null) {
	    	
	    	System.out.println(s);
	    	fw.write(s);
	    	
	    	s= br.readLine();
	    	
	    }	
	}
	
	
	public userInput() {
		
		
		Scanner s = new Scanner(source, charsetName)
		
	}
	
	
	public void wrtiteInTextFile() throws IOException {
		
		File f = new File("C:\\Users\\shekhar.sachdeva\\Desktop\\shekhar.txt");
		
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("check");
		bw.newLine();
		bw.write("two");
		
		
		//string s1;
	//	fw.write("this is shekhar sysytem");
		
		
		bw.close();
		
	}*/
	
	public void readAndWrite() throws IOException {
		
		
		File f = new File("C:\\Users\\shekhar.sachdeva\\Desktop\\halo.txt");
		File f1 = new File("C:\\Users\\shekhar.sachdeva\\Desktop\\halo11.txt");
			
		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter(f1);
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		String s;
		/*while((s=br.readLine())!=null){
			
			bw.write(s);
			bw.newLine();
		}
		
		bw.close();	*/
		
	
		
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
	//System.out.println("PLease enter first line");
		
	for(int i = 1; i<=5;i++) {
	
	String s1;
		Scanner s= new Scanner(System.in);
		s1 = s.nextLine();
	
		File f = new File("C:\\Users\\shekhar.sachdeva\\Desktop\\vaishali1.txt");
		FileWriter fr = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fr);
		
		
		bw.write(s1);
		bw.newLine();
		bw.close();
		
		System.out.println(s1);
		
	}
	
	}
}
	

