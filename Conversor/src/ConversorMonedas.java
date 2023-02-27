import javax.swing.JOptionPane;

public class ConversorMonedas{
	
	
	static void convertirMoneda( double montoIngresado) {
		String [] option2 = {"Pesos a Dolar", "Pesos a Euros", "Pesos a Libras esterlinas", "Pesos a Yen Japones", "Pesos a Won","Dolar a Pesos", "Euros a Pesos", "Libras esterlinas a Pesos", "Yen Japones a Pesos", "Won a Pesos"};
		String n2 = (String)JOptionPane.showInputDialog(null,"Escoje una opcion", "Conversor", JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);
		System.out.println(n2);
		System.out.println(montoIngresado);
		
		switch(n2) {
		case "Pesos a Dolar":
			double dol = montoIngresado * 0.054;
			JOptionPane.showMessageDialog(null,montoIngresado+ " Pesos en Dolares es: "+dol);
			System.out.println("Dolar");
			break;
		
		case "Pesos a Euros":
			double Euros = montoIngresado * 0.051;
			JOptionPane.showMessageDialog(null,montoIngresado+ " Pesos en Euros es: "+Euros);
			System.out.println("Euros");
			break;
		
		case "Pesos a Libras esterlinas":
			double le = montoIngresado * 0.045;
			JOptionPane.showMessageDialog(null,montoIngresado+ " Pesos en Libras esterlinas es: "+le);
			System.out.println("Libras esterlinas");
			break;
		
		case "Pesos a Yen Japones":
			double yen = montoIngresado * 7.41;
			JOptionPane.showMessageDialog(null,montoIngresado+ " Pesos en Yen Japones es: "+yen);
			System.out.println("Yen Japones");
			break;
		
		case "Pesos a Won":
			double won = montoIngresado * 71.47;
			JOptionPane.showMessageDialog(null,montoIngresado+ " Pesos en Won es: "+won);
			System.out.println("Won");
			break;
			
			//Al reves
			
		case "Dolar a Pesos":
			double dol2 = montoIngresado * 18.38;
			JOptionPane.showMessageDialog(null,montoIngresado+ " Dolares en Pesos es: "+dol2);
			System.out.println("Dolar");
			break;
		
		case "Euros a Pesos":
			double Euros2 = montoIngresado * 19.40;
			JOptionPane.showMessageDialog(null,montoIngresado+ " Euros en Pesos es: "+Euros2);
			System.out.println("Euros");
			break;
		
		case "Libras esterlinas a Pesos":
			double le2 = montoIngresado * 21.98;
			JOptionPane.showMessageDialog(null,montoIngresado+ " Libras E. en Pesos es: "+le2);
			System.out.println("Libras esterlinas");
			break;
		
		case "Yen Japones a Pesos":
			double yen2 = montoIngresado * 0.14;
			JOptionPane.showMessageDialog(null,montoIngresado+ " Yen J. en Pesos es: "+yen2);
			System.out.println("Yen Japones");
			break;
		
		case "Won a Pesos":
			double won2 = montoIngresado * 0.014;
			JOptionPane.showMessageDialog(null,montoIngresado+ " Wons en Pesos es: "+won2);
			System.out.println("Won");
			break;
		
	}
}
}
