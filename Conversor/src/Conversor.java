import java.awt.GridBagLayout;

import javax.print.attribute.standard.DialogOwner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Conversor{
	public static void main(String[] args){
		int c;
		do {
			
		
		// Arreglo
	    String [] option = {"Conversor de monedas", "Conversor de Temperatura"};
	    //showInputDialog
	    String n = (String)JOptionPane.showInputDialog(null,"Escoje una opcion", "Conversor", JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
	    //miJPanel.add(option);
	    System.out.println(n);
	    int error=0;
	    
	    //Conversor monedas
	    if(n == "Conversor de monedas") {
	    	do {
	    		
	    	
	    	String moneda = JOptionPane.showInputDialog("Ingrese la cantidad a calcular");
	    	
	    	try {
	    		double mon = Double.parseDouble(moneda);
	    		System.out.println(mon);
	    		error=0;
	    		if(mon>0) {
		    		JOptionPane.showMessageDialog(null, "Tu valor es: "+mon);
		    		ConversorMonedas.convertirMoneda(mon);
	    		}else {
	    			error=1;
	    			JOptionPane.showMessageDialog(null, "Solo numeros mayores de 0");
	    		}
	    	}catch(NumberFormatException e) {
	    		e.getMessage();
	    		JOptionPane.showMessageDialog(null, "Invalido, solo numeros!");
	    		error = 1;
	    	}
	    	}while(error == 1);
	    } 
	    
	    
	    
	    
	    //Conversor tempreturas
	    else if(n == "Conversor de Temperatura") {
	    	do {
		    	String grados = JOptionPane.showInputDialog("Ingrese los grados a calcular");
		    	
		    	try {
		    		double gra = Double.parseDouble(grados);
		    		System.out.println(gra);
			    	JOptionPane.showMessageDialog(null, "Tu valor es: "+gra);
			    	ConversordeGrados.convertirtemp(gra);
			    	error =0;
		    		
		    	}catch(NumberFormatException e) {
		    		e.getMessage();
		    		JOptionPane.showMessageDialog(null, "Invalido, solo numeros!");
		    		error = 1;
		    	}
		    	}while(error == 1);
	    }
	    
	    
	    
	    
	    //Final
	    c = JOptionPane.showConfirmDialog(null, "Desea continuar?");
	   
	    System.out.println(c);
	    
		}while(c == 0);
		JOptionPane.showMessageDialog(null, "Programa finalizado");
	}
}
