
public class NameMaker {
    
    public static void main(String args[])
    {
        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        String address = JOptionPane.showInputDialog("Enter your address");
        String message = String.format("Your name is %s%nYou are %d years old%nYou live at %s" name, age, address);
        
        System.out.println(message);
    }
    
}
