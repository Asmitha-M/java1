/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class M9 {

	public static void main(String[] args) throws FileNotFoundException {
		File f1=new File("names.txt");
		Scanner sc1=new Scanner(f1);
		String name="";
		Tools1 t1=new Tools1();
		for(int i=0;i<6;i++) {
			name=sc1.nextLine();
			System.out.println(t1.reverse(name));
		}
		
		
		
	
	}

}