import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.Component;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.ImageIcon;


public class Login {

	private JFrame frame;
	private JTextField textFieldUser;
	private JTextField textFieldPass;
	private JTextField textFieldsignuser;
	private JTextField textFieldsignPass;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 408, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user=textFieldUser.getText();
				user="|"+user+"|";
				String pass=textFieldPass.getText();
				pass=pass+"|";
				String gabung=user.concat(pass);
				boolean hasil=DataMember.bacaMember().contains(gabung);
				if(hasil==true){

					JOptionPane.showMessageDialog(null, "Login Sukses");
					kalkulator.jalan();
					
				}
				else{
					JOptionPane.showMessageDialog(null, "Gagal Login");
				}
			}
		});
		btnLogin.setBounds(293, 24, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		textFieldUser = new JTextField();
		textFieldUser.setBounds(104, 11, 154, 20);
		frame.getContentPane().add(textFieldUser);
		textFieldUser.setColumns(10);
		
		textFieldPass = new JTextField();
		textFieldPass.setBounds(104, 40, 154, 20);
		frame.getContentPane().add(textFieldPass);
		textFieldPass.setColumns(10);
		
		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setBounds(10, 14, 46, 14);
		frame.getContentPane().add(lblUserId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 43, 84, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblInginMendaftarSign = new JLabel("Ingin mendaftar?,");
		lblInginMendaftarSign.setBounds(118, 121, 126, 14);
		frame.getContentPane().add(lblInginMendaftarSign);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String signuser=textFieldsignuser.getText();
				String signpass=textFieldsignPass.getText();
				DataMember.tulisMember(signuser, signpass);
				JOptionPane.showMessageDialog(null, "SUKSES SIGN UP");
				
			}
		});
		btnSignUp.setBounds(207, 227, 89, 23);
		frame.getContentPane().add(btnSignUp);
		
		JLabel lblUserId_1 = new JLabel("User ID");
		lblUserId_1.setBounds(10, 149, 46, 14);
		frame.getContentPane().add(lblUserId_1);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setBounds(10, 174, 46, 14);
		frame.getContentPane().add(lblPassword_1);
		
		textFieldsignuser = new JTextField();
		textFieldsignuser.setBounds(73, 146, 264, 20);
		frame.getContentPane().add(textFieldsignuser);
		textFieldsignuser.setColumns(10);
		
		textFieldsignPass = new JTextField();
		textFieldsignPass.setBounds(73, 171, 264, 20);
		frame.getContentPane().add(textFieldsignPass);
		textFieldsignPass.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("F:\\Images\\photoshop\\bahan\\awan\\langit-biru.jpg"));
		lblNewLabel.setBounds(0, 0, 403, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
