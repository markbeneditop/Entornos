package dam.prog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.BoxLayout;

public class F_Accio extends JFrame {

	private JPanel contentPane;
	JButton btnTornar;
	JPanel contingut;
	/**
	 * Create the frame.
	 */
	public F_Accio(String accio) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		btnTornar = new JButton("Tornar");
		btnTornar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				F_principal frame = new F_principal();
				frame.setVisible(true);
				dispose();

			}
		});

		contentPane.add(btnTornar, BorderLayout.SOUTH);

		// Creem el ContentPane segons el paràmetre rebut
		if(accio.compareTo("Consulta Impagaments")==0){
			contingut = new ConsultaImpagaments();
		}
		if(accio.compareTo("Actualitza Impagaments")==0){
			String numSoci=JOptionPane.showInputDialog(this, "Indica el numero de Soci", "Intro Dades");
			contingut = new ActualitzaImpagaments(Integer.parseInt(numSoci));
		}
		if(accio.compareTo("Cercar Dades Soci")==0){
			contingut = new ConsultaImpagaments();
		}
		// Afegim el ContentPane
		contentPane.add(contingut,BorderLayout.CENTER);
		this.setVisible(true);
	}

}
