package treinamento;

import javax.swing.JFrame;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JFrame mainFrame;

	public Frame() {
		initializeFrame();
	}

	private void initializeFrame() {
		mainFrame = new JFrame("Cadastro de Rotas de Importação Fictícias");
		mainFrame.add(new Panel().getMainPanel());
		mainFrame.setSize(825, 480);
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}

	public static void main(String[] args) {

		Frame frame = new Frame();

	}

}
