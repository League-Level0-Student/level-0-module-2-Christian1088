import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String Voting = JOptionPane.showInputDialog("How old are you?");
	int agevoting = Integer.parseInt(Voting);
	if(agevoting>17) {
		JOptionPane.showInputDialog("Who should the next president be?");
	}

else {
	JOptionPane.showMessageDialog(null, "Nobody cares what you think");

}
}
}