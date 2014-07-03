package package3;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Eventos3 {

	public Eventos3(){
		JFrame ventana = new JFrame("Eventos 3");
		JButton boton = new JButton("Evento 3");
		
		ActionListener evento=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Has pulsado el botón 3");
			}
			
		};
		
		boton.addActionListener(evento);
			
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new FlowLayout());
		ventana.add(boton);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(400, 400);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new Eventos3();
	}

}
