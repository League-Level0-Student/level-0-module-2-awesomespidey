import javax.swing.JOptionPane;

public class Votingbooth {
public static void main(String[] args) {
	
String input = JOptionPane.showInputDialog("How old are you??");
int ages = Integer.parseInt(input);

if (ages>18) {
System.out.println("Who will the next president should be??");
}
	else {
		System.out.println("No one cares what you think.");
	}



}
}









                                                                                                  