package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers { 
	public static void main(String[] args) {
		Random Randy= new Random();
		int r;
		int abc=Randy.nextInt(9);
		int def=Randy.nextInt(9);
		int ghi=Randy.nextInt(9);
		int jkl=Randy.nextInt(9);
		int mno=Randy.nextInt(9);
		
		
		JOptionPane.showMessageDialog(null, abc"+"def"+"ghi"+"jkl"+"mno");

}
}