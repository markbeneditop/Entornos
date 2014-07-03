package dam.prog;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ActualitzaImpagaments extends JPanel {
	private JTextField tf_id_soci;
	private JTextField tf_nom;
	private JTextField tf_cognoms;
	private JTextField tf_dni;
	private JTextField tf_domicili;
	private JTextField tf_localitat;
	private JTextField tf_tipus_soci;
	private JTextField tf_data_alta;
	private JTextField tf_data_baixa;
	private JTextField tf_paga_ult_rebut;

	/**
	 * Create the panel.
	 */
	public ActualitzaImpagaments(int numSoci) {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblDadesDelSoci = new JLabel("Dades del Soci");
		lblDadesDelSoci.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblDadesDelSoci, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblIdSoci = new JLabel("Id Soci");
		lblIdSoci.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblIdSoci);
		
		tf_id_soci = new JTextField();
		tf_id_soci.setEditable(false);
		panel.add(tf_id_soci);
		tf_id_soci.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nom");
		panel.add(lblNewLabel);
		
		tf_nom = new JTextField();
		tf_nom.setEditable(false);
		panel.add(tf_nom);
		tf_nom.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cognoms");
		panel.add(lblNewLabel_1);
		
		tf_cognoms = new JTextField();
		tf_cognoms.setEditable(false);
		panel.add(tf_cognoms);
		tf_cognoms.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblDni);
		
		tf_dni = new JTextField();
		tf_dni.setEditable(false);
		tf_dni.setColumns(10);
		panel.add(tf_dni);
		
		JLabel lblDomicili = new JLabel("Domicili");
		panel.add(lblDomicili);
		
		tf_domicili = new JTextField();
		tf_domicili.setEditable(false);
		tf_domicili.setColumns(10);
		panel.add(tf_domicili);
		
		JLabel lblLocalitat = new JLabel("Localitat");
		panel.add(lblLocalitat);
		
		tf_localitat = new JTextField();
		tf_localitat.setColumns(10);
		panel.add(tf_localitat);
		
		JLabel lblTipusSoci = new JLabel("tipus Soci");
		lblTipusSoci.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblTipusSoci);
		
		tf_tipus_soci = new JTextField();
		tf_tipus_soci.setColumns(10);
		panel.add(tf_tipus_soci);
		
		JLabel lblDataDalta = new JLabel("Data d'Alta");
		panel.add(lblDataDalta);
		
		tf_data_alta = new JTextField();
		tf_data_alta.setEditable(false);
		tf_data_alta.setColumns(10);
		panel.add(tf_data_alta);
		
		JLabel lblDataDeBaixa = new JLabel("Data de Baixa");
		panel.add(lblDataDeBaixa);
		
		tf_data_baixa = new JTextField();
		tf_data_baixa.setEditable(false);
		tf_data_baixa.setColumns(10);
		panel.add(tf_data_baixa);
		
		JLabel lblPagaUltimRebut = new JLabel("Paga Ultim Rebut?");
		lblPagaUltimRebut.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblPagaUltimRebut);
		
		tf_paga_ult_rebut = new JTextField();
		tf_paga_ult_rebut.setEditable(false);
		tf_paga_ult_rebut.setColumns(10);
		panel.add(tf_paga_ult_rebut);
		
		JButton btnNewButton = new JButton("Actualitzar");
		panel.add(btnNewButton);

	}

}
