/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1;

public class M3 {
    public static void reverse(String s1) {
		String s2="";
		int len1=s1.length();
		for(int i=0;i<len1;i++) {
			s2=s2+s1.substring(len1-(i+1),len1-i);
		}
        System.out.println(s2);
	}

	public static void main(String[] args) {
		reverse("Hi");
		reverse("Hello");
		reverse("Good afternoon");
		
	}
        
}
