package treinamento;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tecgraf.javautils.gui.GBC;

public class Frame extends JFrame {

	private JFrame mainFrame;
	private JPanel mainPanel;
	private JPanel topPanel;
	private JPanel downPanel;
	
	public Frame() {
		initializeFrame();
	}
	
	public void initializeFrame() {
		
		JLabel localLabel = new JLabel("Local:");
		JLabel grupLabel = new JLabel("Grupamento de Produto:");
		JLabel loteLabel = new JLabel("Lote Mínimo:");
		JLabel validLabel = new JLabel("Validade:");
		
		JComboBox<String> localCB = new JComboBox<String>();
		localCB.setMinimumSize(new Dimension(260, 20));
		localCB.setPreferredSize(localCB.getMinimumSize());
		
		JComboBox<String> grupCB = new JComboBox<String>();
		grupCB.setMinimumSize(new Dimension(260, 20));
		grupCB.setPreferredSize(grupCB.getMinimumSize());
		
		JTextField loteTF = new JTextField();
		loteTF.setMinimumSize(new Dimension(200, 20));
		loteTF.setPreferredSize(loteTF.getMinimumSize());
		JTextField validTF = new JTextField();
		JButton novoButton = new JButton("Novo");
		
		topPanel = new JPanel(new GridBagLayout());
		topPanel.setBorder(BorderFactory.createTitledBorder("Criar Nova Rota"));
		topPanel.add(localLabel, new GBC(0, 0).insets(0, -200, 0, 0).none().west());
		topPanel.add(localCB, new GBC(1, 0).insets(0, 20, 0, 0).none().west());
		topPanel.add(grupLabel, new GBC(0, 1).insets(20, -200, 0, 0).west());
		topPanel.add(grupCB, new GBC(1, 1).insets(20, 20, 0, 0).west());
		topPanel.add(loteLabel, new GBC(0, 2).insets(20, -200, 0, 0).west());
		topPanel.add(loteTF, new GBC(1,2).insets(0, 20, 0, 0).west());
		topPanel.add(validLabel, new GBC(0,3).insets(20, -200, 0, 0).west());
		topPanel.add(validTF, new GBC(1, 3).insets(0, 20, 0, 0).west());
		topPanel.add(novoButton, new GBC(3,3).insets(0, 20, 0, -200).east());
		
		
		downPanel = new JPanel(new GridBagLayout());
		
		mainPanel = new JPanel(new GridBagLayout());
		mainPanel.add(topPanel, new GBC(0,0).both());
		mainPanel.add(downPanel, new GBC(0,1).both());
		
		mainFrame = new JFrame();
		mainFrame.add(mainPanel);
		mainFrame.setSize(780,600);
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		Frame frame = new Frame();
		
	}
	
	
}
