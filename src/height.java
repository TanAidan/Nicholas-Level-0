import javax.swing.JOptionPane;


public class height {
public static void main(String[] args) {
	

	String height = JOptionPane.showInputDialog("how tall are you");
	 int a  = Integer.parseInt(height);
if(a>4)
{
	JOptionPane.showConfirmDialog(null, "you can ride the roller coaster");
}
else 
	
{	
	
	JOptionPane.showConfirmDialog(null, "go away midget");
	
	
}

}

}
