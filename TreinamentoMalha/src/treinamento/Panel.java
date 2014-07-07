package treinamento;

import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel mainPanel;
	private JPanel topPanel;
	private JPanel downPanel;

	private JLabel localLabel;
	private JLabel grupLabel;
	private JLabel loteLabel;
	private JLabel validLabel;

	private JComboBox<String> localCB;
	private JComboBox<String> grupCB;
	private JTextField loteTF;
	private JTextField validTF;

	private JButton novoButton;

	public Panel() {
		mainPanel = new JPanel(null);
		configuringComponents();
		initializeTopPanel();
		initializeDownPanel();
	}

	private void configuringComponents() {
		localLabel = new JLabel("Local:");
		localLabel.setBounds(10, -50, 0, 0);
		localLabel.setSize(200, 200);

		grupLabel = new JLabel("Grupamento de Produto:");
		grupLabel.setBounds(10, -20, 0, 0);
		grupLabel.setSize(200, 200);

		loteLabel = new JLabel("Lote Mínimo:");
		loteLabel.setBounds(10, 10, 0, 0);
		loteLabel.setSize(200, 200);

		validLabel = new JLabel("Validade:");
		validLabel.setBounds(10, 40, 0, 0);
		validLabel.setSize(200, 200);

		localCB = new JComboBox<String>();
		localCB.setBounds(250, 40, 0, 0);
		localCB.setSize(260, 20);

		grupCB = new JComboBox<String>();
		grupCB.setBounds(250, 70, 0, 0);
		grupCB.setSize(260, 20);

		loteTF = new JTextField();
		loteTF.setBounds(250, 100, 0, 0);
		loteTF.setSize(200, 20);

		validTF = new JTextField();
		validTF.setBounds(250, 130, 0, 0);
		validTF.setSize(200, 20);

		novoButton = new JButton("Novo");
		novoButton.setBounds(700, 130, 0, 0);
		novoButton.setSize(70, 20);
		
	}

	private void initializeTopPanel() {
		topPanel = new JPanel(null);
		topPanel.setBorder(BorderFactory.createTitledBorder("Criar Nova Rota"));
		topPanel.setSize(800, 180);
		Component[] arrayComp = { localLabel, localCB, grupLabel, grupCB,
				loteLabel, loteTF, validLabel, validTF, novoButton };

		for (int i = 0; i < arrayComp.length; i++) {
			topPanel.add(arrayComp[i]);
		}
		mainPanel.add(topPanel);
	}

	private void initializeDownPanel() {
		downPanel = new JPanel(null);
		downPanel.setBounds(0, 180, 0, 0);
		downPanel.setSize(800, 260);
		mainPanel.add(downPanel);
	}

	public JPanel getMainPanel() {
		return mainPanel;
	}

}
