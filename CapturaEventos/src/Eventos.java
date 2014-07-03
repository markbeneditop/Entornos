import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Eventos implements ActionListener {
	
	public Eventos(){
		JFrame ventana = new JFrame("Eventos");
		JButton boton = new JButton("Evento");
		
		boton.addActionListener(this);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new FlowLayout());
		ventana.add(boton);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(400, 400);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new Eventos();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JFrame ventana=new JFrame();
		ventana.setBounds(100, 100, 400, 400);
		ventana.setVisible(true);
		
		
	}

}
