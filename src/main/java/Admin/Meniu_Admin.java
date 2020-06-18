package Admin;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "unused", "serial" })
public class Meniu_Admin extends JFrame {

	/**
	 * Launch the application.
	 */
	private Creare_meniu_admin b=new Creare_meniu_admin();
	/**
	 * Create the frame.
	 */
	public Meniu_Admin() {
		getContentPane().setLayout(null);
		setSize(1650,750);
		JButton btnNewButton = new JButton("Lista carti");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b.lista_carti();
				dispose();
			}
		});
		btnNewButton.setBounds(23, 429, 208, 42);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Lista cereri");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b.lista_cereri();
				dispose();
			}
		});
		btnNewButton_1.setBounds(23, 495, 208, 42);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Actualizare");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b.actualizare();
				dispose();
				
			}
		});
		btnNewButton_2.setBounds(23, 567, 208, 42);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Admin page");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 60));
		lblNewLabel.setBounds(673, 263, 460, 114);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Meniu_Admin.class.getResource("/im.png")));
		lblNewLabel_1.setBounds(0, 0, 1902, 1033);
		getContentPane().add(lblNewLabel_1);
		
		JButton button = new JButton("New button");
		button.setBounds(1123, 906, 202, 36);
		getContentPane().add(button);
		

		
	}
}
