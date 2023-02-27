import javax.swing.JOptionPane;

public class ConversordeGrados {
	static void convertirtemp( double grados) {
		String [] option3 = {"Celsius a Fahrenheit", "Fahrenheit a Celsius", "Celsius a Kelvin", "Kelvin a Celsius", "Fahrenheit a Kelvin", "Kelvin a Fahrenheit"};
		String n3 = (String)JOptionPane.showInputDialog(null,"Escoje una opcion", "Conversor", JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);
		System.out.println(n3);
		System.out.println(grados);
		
		switch(n3) {
		case "Celsius a Fahrenheit":
			double far = (1.8 * grados)+32;
			JOptionPane.showMessageDialog(null,grados+ " Celsius a Fahrenheit es: "+far);
			break;
		case "Fahrenheit a Celsius":
			double cel = (grados-32)/1.8;
			JOptionPane.showMessageDialog(null,grados+ " Fahrenheita Celsius es: "+cel);
			break;
		case "Celsius a Kelvin":
			double kel = grados+273;
			JOptionPane.showMessageDialog(null,grados+ " Celsius a Kelvin es: "+kel);
			break;
		case "Kelvin a Celsius":
			double cel2 = grados-273;
			JOptionPane.showMessageDialog(null,grados+ " Kelvin a Celsius es: "+cel2);
			break;
		case "Fahrenheit a Kelvin":
			double kel2 = (grados + 459.67) * (0.555);
			JOptionPane.showMessageDialog(null,grados+ " Fahrenheit a Kelvin es: "+kel2);
			break;
		case "Kelvin a Fahrenheit":
			double far2 = (grados/0.555)-459.67;
			JOptionPane.showMessageDialog(null,grados+ " Kelvin a Fahrenheit es: "+far2);
			break;
		}
	}
}
