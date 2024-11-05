/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1;

/**
 *
 * @author asmit
 */
public class M2 {
    public static void main(String[] args) {
		String s1="Hello!";
                int len1=s1.length();
		String s2=" ";
		for(int i=0;i<len1;i++){
			s2=s2+s1.substring(len1-(i+1),len1-i);
		}
				System.out.println(s2);
}
}
