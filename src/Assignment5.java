// all imports in order to make the GIU work.
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// Class named Assignment5 and has the JFrame class in it. 
public class Assignment5 extends JFrame {
	
// declaring the JtextFields variables.
JTextField textfield1, textfield2, textfield3;
JPasswordField passwordfield;

// constructor of class.
public Assignment5() {
	
// We make an object of textfield1 and make it have a parameter of 10 columns.
textfield1 = new JTextField(10);
textfield2 = new JTextField("Enter text here");

//We make an object of textfield2 and make it have uneditable text & a parameter of 21 columns.
textfield3 = new JTextField("Uneditable text field", 21);
textfield3.setEditable(false);

// we make an object of password field 
passwordfield = new JPasswordField("password");
setLayout(new FlowLayout());

/* The EventHandler class provides support for dynamically generating event listeners 
whose methods execute a simple statement involving an incoming event object and a target object */
MyEventHandler Actions = new MyEventHandler();

// action listener allows us to add behavior to the text fields
textfield1.addActionListener(Actions);
textfield2.addActionListener(Actions);
textfield3.addActionListener(Actions);
passwordfield.addActionListener(Actions);
add(textfield1);
add(textfield2);
add(textfield3);
add(passwordfield);
// The frame will close, but the app will continue to run
setDefaultCloseOperation(EXIT_ON_CLOSE);

// The pack method sizes the frame so that all its contents are at or above their preferred sizes
pack();
}

// adding behavior
class MyEventHandler implements ActionListener
{

	
	// the following IF/ELSE statements make the textfield & password field show a prompt. We made it user friendly to fit the professor's rubric. 
public void actionPerformed(ActionEvent e) {

	try { if(e.getSource() == textfield1)
JOptionPane.showMessageDialog(Assignment5.this, "textfield1: Hello");
	
	
else if(e.getSource() == textfield2)
JOptionPane.showMessageDialog(Assignment5.this, "textField2: " + textfield2.getText());


else if(e.getSource() == textfield3)
JOptionPane.showMessageDialog(Assignment5.this, "textField3: Uneditable text");

else if(e.getSource() == passwordfield)
JOptionPane.showMessageDialog(Assignment5.this, "passwordField: hidden text");
}

catch (Exception e1 ) {
	System.out.println("There is an error in your code");
}
}
}


// MAIN function was created to set everything in the Assignment5 class visible.
public static void main(String[] args) {
	// object called Duty making a new assignment5
Assignment5 Duty = new Assignment5();
// We set everything in Duty visible
Duty.setVisible(true);
}
}