import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;


public class Factures extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Factures frame = new Factures();
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
	public Factures() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 650, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom:");
		lblNewLabel.setBounds(10, 0, 44, 26);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(49, 3, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCamp = new JLabel("Camp:");
		lblCamp.setBounds(10, 27, 44, 26);
		contentPane.add(lblCamp);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(49, 34, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblAny = new JLabel("Any:");
		lblAny.setBounds(507, 6, 29, 14);
		contentPane.add(lblAny);
		
		textField_2 = new JTextField();
		textField_2.setBounds(546, 3, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Superf\u00EDcie:");
		lblNewLabel_1.setBounds(239, 33, 65, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(314, 30, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblImportTotal = new JLabel("IMPORT TOTAL:");
		lblImportTotal.setBounds(489, 30, 125, 20);
		contentPane.add(lblImportTotal);
	}
}
