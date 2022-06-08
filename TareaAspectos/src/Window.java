import java.awt.Color;
import java.awt.Color.*;
import java.awt.event.*;
import javax.swing.*;

public class Window {

	public static JFrame frame = new JFrame ("Observer");
	
	//Botones
	public static JButton btn1 = new JButton ("Color Cyan");
	public static JButton btn2 = new JButton ("Color Purple");
	public static JButton btn3 = new JButton ("Color Pink");
	public static JLabel label = new JLabel ();
	
	
	public static void main(String[] args) {

		startW();
		appearB();
		addAction();
		
	}

	public static void changeColor(Color color) {
		
		/*El m�todo getContentPane() recupera la capa del panel de contenido para que 
		pueda agregarle un objeto. En este m�todo changeColor, la modificaci�n es cambiar el color del panel de contenido*/
		
		frame.getContentPane().setBackground(color);
		
	}
	
	public  static void writeText(String mensaje) {
		
		
		
	}
	
	public static void startW() {
		
		frame.setBackground(Color.WHITE);
		frame.setSize(600, 600);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void appearB() {
		
		btn1.setBounds(70,50, 300, 75);
		btn1.setVisible(true);
		
		btn2.setBounds(70,150, 300, 75);
		btn2.setVisible(true);
		
		btn3.setBounds(70,250, 300, 75);
		btn3.setVisible(true);
		
	}
	

	public static void addAction() {
		
		//Cyan
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int response= JOptionPane.showConfirmDialog(null, "Desea continuar?", "Confirmar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if (response==JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null,"SUCCESSFUL COLOR CHANGE");
					changeColor(new Color(0, 232, 228));
				}else if(response==JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null,"THE BACKGROUND COLOR HAS NOT BEEN CHANGED");
					System.out.println("Se ha negado el cambio al color");
				}else if(response==JOptionPane.CANCEL_OPTION) {
					
					System.out.println("Cambio de color cancelado");
				}
			}
		});
		frame.add(btn1);
		
		
		//Purple
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int response= JOptionPane.showConfirmDialog(null, "Desea continuar?", "Confirmar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if (response==JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null,"SUCCESSFUL COLOR CHANGE");
					changeColor(new Color(219, 159, 255));
				}else if(response==JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null,"THE BACKGROUND COLOR HAS NOT BEEN CHANGED");
					System.out.println("Se ha negado el cambio al color");
				}else if(response==JOptionPane.CANCEL_OPTION) {
					
					System.out.println("Cambio de color cancelado");
				}
			}
		});
		frame.add(btn2);
		
		
		//Pink
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int response= JOptionPane.showConfirmDialog(null, "Desea continuar?", "Confirmar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if (response==JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null,"SUCCESSFUL COLOR CHANGE");
					changeColor(new Color(255, 159, 235));
				}else if(response==JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null,"THE BACKGROUND COLOR HAS NOT BEEN CHANGED");
					System.out.println("Se ha negado el cambio al color");
				}else if(response==JOptionPane.CANCEL_OPTION) {
					
					System.out.println("Cambio de color cancelado");
				}
			}
		});
		frame.add(btn3);
		
		
		
	}

	
	
}
