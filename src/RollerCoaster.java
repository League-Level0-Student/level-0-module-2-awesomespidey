import javax.swing.JOptionPane;

public class RollerCoaster {
 public static void main(String[] args) {
	
String input = JOptionPane.showInputDialog("How tall are you in inches??");
int height = Integer.parseInt(input);

if(height>48) {
	System.out.println("You can go on the roller coaster!!");
}
	else {
		System.out.println("You need to grow some more before you get on the roller coaster.       :(");
	}




 
 }
 
 
 
 
 
 
 
 
 
 
 
 }

