import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.*;

public class Lab605 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] number = new int[5];
		for(int i = 0; i<number.length;i++) {
		number[i] = Integer.parseInt(JOptionPane.showInputDialog(("Input number "+ (i+1) +" : ")));
		
	  }
		showEven(number);
		showOdd(number);
	}
	static void showEven(int[] nums) 
	{
		String listE = " ";
		for(int _number : nums) {
			if (_number % 2 == 0) {
				listE = listE + _number + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:"+"\n"+listE);
	}
	static void showOdd(int[] nums) 
	{
		String listO = " ";
		for(int _number : nums) {
			if (_number % 2 != 0) {
				listO = listO + _number + " ";
		   }
		}
		JOptionPane.showMessageDialog(null, "List of even number:"+"\n"+listO);

	}

}
