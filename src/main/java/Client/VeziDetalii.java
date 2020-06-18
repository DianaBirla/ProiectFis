package Client;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;

public class VeziDetalii extends JFrame {

	private JPanel contentPane;
	private String username;
	private WriteBooks writer=new WriteBooks();

	public VeziDetalii(final BookModel e,final String username) {
		this.username=username;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1650, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(277, 188, 208, 224);
		lblNewLabel.setIcon(new ImageIcon(VeziDetalii.class.getResource(e.getPoza())));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(e.getTitlu());
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(234, 144, 283, 33);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Books books=new Books(username);
				books.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(159, 647, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Imprumuta");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				writer.write(e);
				
			}
		});
		btnNewButton_1.setBounds(826, 450, 119, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Autor: "+e.getAutor());
		lblNewLabel_2.setBounds(634, 155, 200, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("An aparitie: "+e.getAn_aparitie());
		lblNewLabel_3.setBounds(634, 188, 200, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Descriere: ");
		lblNewLabel_4.setBounds(634, 224, 200, 20);
		contentPane.add(lblNewLabel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(634, 268, 342, 144);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea(e.getDescriere());
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		
		
	}
}
