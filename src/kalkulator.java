import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;


public class kalkulator {

	private JFrame frame;
	public JTextField textFieldangka1;
	public JTextField textFieldangka2;
	public JTextField textFieldhasil;
	private JButton button;
	private JButton button_1;
	private JLabel lblAngka;
	private JLabel lblAngka_1;

	/**
	 * Launch the application.
	 */
	public static void jalan() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kalkulator window = new kalkulator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "TIDAK DAPAT DIBUKA!!!!");
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public kalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("KALKUKATOR");
		frame.setBounds(100, 100, 477, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldangka1 = new JTextField();
		textFieldangka1.setBounds(75, 53, 126, 29);
		frame.getContentPane().add(textFieldangka1);
		textFieldangka1.setColumns(10);
		
		textFieldangka2 = new JTextField();
		textFieldangka2.setBounds(243, 53, 111, 29);
		frame.getContentPane().add(textFieldangka2);
		textFieldangka2.setColumns(10);
		
		JButton btnTambah = new JButton("tambah");
		btnTambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int num1,num2,hasil;
					num1=Integer.parseInt(textFieldangka1.getText());
					num2=Integer.parseInt(textFieldangka2.getText());
					hasil=num1+num2;
					textFieldhasil.setText(Integer.toString(hasil));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Masukkan angka yang benar");
				}
			}
		});
		btnTambah.setBounds(10, 110, 89, 23);
		frame.getContentPane().add(btnTambah);
		
		JButton btnKurang = new JButton("bagi");
		btnKurang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int num1,num2;
					float hasil;
					num1=Integer.parseInt(textFieldangka1.getText());
					num2=Integer.parseInt(textFieldangka2.getText());
					hasil=num1/num2;
					textFieldhasil.setText(Float.toString(hasil));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Masukkan angka yang benar");
				}
			}
		});
		btnKurang.setBounds(311, 110, 89, 23);
		frame.getContentPane().add(btnKurang);
		
		textFieldhasil = new JTextField();
		textFieldhasil.setBounds(60, 189, 200, 50);
		frame.getContentPane().add(textFieldhasil);
		textFieldhasil.setColumns(10);
		
		JLabel lblHasil = new JLabel("hasil");
		lblHasil.setForeground(Color.WHITE);
		lblHasil.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHasil.setBounds(10, 198, 89, 29);
		frame.getContentPane().add(lblHasil);
		
		button = new JButton("kurang");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int num1,num2,hasil;
					num1=Integer.parseInt(textFieldangka1.getText());
					num2=Integer.parseInt(textFieldangka2.getText());
					hasil=num1-num2;
					textFieldhasil.setText(Integer.toString(hasil));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Masukkan angka yang benar");
				}
			}
		});
		button.setBounds(110, 110, 89, 23);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("kali");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int num1,num2,hasil;
					num1=Integer.parseInt(textFieldangka1.getText());
					num2=Integer.parseInt(textFieldangka2.getText());
					hasil=num1*num2;
					textFieldhasil.setText(Integer.toString(hasil));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Masukkan angka yang benar");
				}
				
			}
		});
		button_1.setBounds(209, 110, 89, 23);
		frame.getContentPane().add(button_1);
		
		lblAngka = new JLabel("angka 1");
		lblAngka.setForeground(Color.WHITE);
		lblAngka.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAngka.setBounds(109, 11, 55, 50);
		frame.getContentPane().add(lblAngka);
		
		lblAngka_1 = new JLabel("angka 2");
		lblAngka_1.setForeground(Color.WHITE);
		lblAngka_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAngka_1.setBounds(262, 11, 55, 50);
		frame.getContentPane().add(lblAngka_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("F:\\Images\\Manga\\Naruto\\ENsasuke~0.jpg"));
		lblNewLabel.setBounds(-311, -57, 784, 412);
		frame.getContentPane().add(lblNewLabel);
	}
}
