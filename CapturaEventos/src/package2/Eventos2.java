package package2;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Eventos2 {

	public Eventos2(){
		JFrame ventana = new JFrame("Eventos 2");
		JButton boton = new JButton("Evento 2");
		
		boton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Has pulsado el botón 2");
			}
		});
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new FlowLayout());
		ventana.add(boton);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(400, 400);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new Eventos2();
	}

}
