import javax.swing.JOptionPane;

public class prime {
	public static void main(String[] args) {
		
		
	String yes = JOptionPane.showInputDialog("tell me a number");	
	int no=Integer.parseInt(yes);
	for (int i = 2; i < no; i++) {
		if(no%i==0) {
			JOptionPane.showMessageDialog(null, "ur number isn't prim");
		System.exit(0);
		}
	}
	JOptionPane.showMessageDialog(null, "ur number isn't prim");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
