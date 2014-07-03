package dam.prog;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class ConsultaImpagaments extends JPanel {

	/**
	 * Create the panel.
	 */
	public ConsultaImpagaments() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblConsultarImpagaments = new JLabel("Consultar Impagaments");
		lblConsultarImpagaments.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblConsultarImpagaments, BorderLayout.NORTH);

	}

}
