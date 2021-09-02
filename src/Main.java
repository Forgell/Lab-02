import javax.swing.JOptionPane;


/**
Date 9/2/21
@author Qualan Bradford

creative writing assignment with dialog boxes
 */
public class Main{
    public static void main(String[] args){
	JOptionPane.showMessageDialog(null , "Welcome to Rusted Roads!!");

	String name = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null , "Welcome " + name + " to continue your journey we need some basic information from you");
	int age = -1;
	int height = -1;
	do{
	    String stringAge = JOptionPane.showInputDialog("What is your age?");
            try{
		age = Integer.parseInt(stringAge);
	    }catch(Exception e){
		
	    }
	    if(age != -1){
		break;
	    }
	}while(true);

	do{
	    String stringHeight  = JOptionPane.showInputDialog("What is your height?[cm]");
	    try{
		height = Integer.parseInt(stringHeight);
	    }catch(Exception e){
		
	    }
	    if(height != -1){
		break;
	    }
	}while(true);
	
	String color = JOptionPane.showInputDialog("what is your favorite color?");
	
	JOptionPane.showMessageDialog(null , name + " wakes up chilled by the nights chill...\nwhen they attempt to stand their "+ height + " height makes them hit their head on the top of the cave\nconfused they make their way out of this damp cave\nlooking at the now rising sun the sky envolpes in " + color + "\nfeeling an itch "+name+" looks down on their arm "+age+" is etched in blood\nwhere is this???");
    }
}
