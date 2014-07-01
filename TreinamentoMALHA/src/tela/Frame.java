package tela;

import javax.swing.JFrame;

public class Frame extends JFrame {

	JFrame frame;

	public Frame() {
		frame = new JFrame("Cadastro de Rotas de Importação Fictícias");
		frame.setSize(648, 480);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Frame fr = new Frame();
		
		
	}

}
