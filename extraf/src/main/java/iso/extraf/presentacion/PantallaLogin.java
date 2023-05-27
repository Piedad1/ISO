package iso.extraf.presentacion;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PantallaLogin extends JFrame {
	public PantallaLogin() {
		setLayout(new GridLayout(3,2));
		
		JLabel usernameLabel = new JLabel("Usuario");
		JLabel passwordLabel = new JLabel("Contraseña");
		JTextField inputUsuario = new JTextField();
		JPasswordField inputPwd = new JPasswordField();
		JButton btnLogin = new JButton("Iniciar sesión");
		
		add(usernameLabel);
		add(inputUsuario);
		add(passwordLabel);
		add(inputPwd);
		add(btnLogin);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
}
 