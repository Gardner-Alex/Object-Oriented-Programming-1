import javax.swing.JOptionPane;

public class PoundsToKilos2{
	public static void main(String[] args){
		String text = JOptionPane.showInputDialog("Enter a number in Pounds: ");
		doulbe pounds =Double.parseDouble(text);
		
		
		//conver pounds to kilograms
		double kilos = pounds * 0.454;
		NumberFormat formatter = NumberFormat.getInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		
		JOption.Pane.showMessageDialog(null, pounds + " pounds is " + formatter.format(kilos) + " kilograms");
		
	}
}