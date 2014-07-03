package dam.prog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class F_principal extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btn_C_impagaments;
	JButton btn_A_Impagaments;
	JButton btn_C_Soci;
	F_Accio subfinestra=null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_principal frame = new F_principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public F_principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 1, 0, 0));
		
		btn_C_impagaments = new JButton("Consulta Impagaments");
		btn_C_impagaments.addActionListener(this);
		contentPane.add(btn_C_impagaments);
		
		btn_A_Impagaments = new JButton("Actualitza Impagaments");
		btn_A_Impagaments.addActionListener(this);
		contentPane.add(btn_A_Impagaments);
		
		btn_C_Soci = new JButton("Cercar Dades Soci");
		btn_C_Soci.addActionListener(this);
		contentPane.add(btn_C_Soci);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if (arg0.getActionCommand().equalsIgnoreCase("Consulta Impagaments")){
			 subfinestra =  new F_Accio("Consulta Impagaments");
		}
		if (arg0.getActionCommand().equalsIgnoreCase("Actualitza Impagaments")){
			 subfinestra =  new F_Accio("Actualitza Impagaments");
		}
		if (arg0.getActionCommand().equalsIgnoreCase("Cercar Dades Soci")){
			 subfinestra =  new F_Accio("Cercar Dades Soci");		
		}
		subfinestra.setVisible(true);
		this.dispose();	
	}

}
