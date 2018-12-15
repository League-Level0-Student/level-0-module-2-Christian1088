import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
String height =	JOptionPane.showInputDialog("How tall are you in inches?");
int numberheight = Integer.parseInt(height);
if(numberheight>48) {
	JOptionPane.showMessageDialog(null, "You can go on the ride!");
	
}
	
else {
	JOptionPane.showMessageDialog(null, "you need to grow more first");
}
	
	
	
	
	
	
	
	
	
}
}
