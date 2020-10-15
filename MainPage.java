import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(UIManager.getBorder("Button.border"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToConvert = new JLabel("Welcome to Converter");
		lblWelcomeToConvert.setForeground(Color.BLACK);
		lblWelcomeToConvert.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToConvert.setFont(new Font("Candara", Font.BOLD, 30));
		lblWelcomeToConvert.setBounds(12, 13, 441, 79);
		contentPane.add(lblWelcomeToConvert);
		
		JButton btnT = new JButton("Temperature");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Temperature temp = new Temperature();
				temp.setVisible(true);
				dispose();
			}
		});
		btnT.setBackground(Color.BLUE);
		btnT.setForeground(Color.WHITE);
		btnT.setIcon(null);
		btnT.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 20));
		btnT.setBounds(100, 100, 250, 50);
		contentPane.add(btnT);
		
		JButton btnC = new JButton("Currency");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Currency currency = new Currency();
				currency.setVisible(true);
				dispose();
			}
		});
		btnC.setBackground(Color.BLUE);
		btnC.setForeground(Color.WHITE);
		btnC.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 20));
		btnC.setBounds(100, 200, 250, 50);
		contentPane.add(btnC);
		
		JButton btnL = new JButton("Weight");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Weight weight = new Weight();
				weight.setVisible(true);
				dispose();
			}
		});
		btnL.setBackground(Color.BLUE);
		btnL.setForeground(Color.WHITE);
		btnL.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 20));
		btnL.setBounds(100, 300, 250, 50);
		contentPane.add(btnL);
		
		JButton btnW = new JButton("Length");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Length length = new Length();
				length.setVisible(true);
				dispose();
			}
		});
		btnW.setBackground(Color.BLUE);
		btnW.setForeground(Color.WHITE);
		btnW.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 20));
		btnW.setBounds(100, 400, 250, 50);
		contentPane.add(btnW);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBackground(Color.RED);
		button.setBounds(155,507, 135, 33);
		contentPane.add(button);
		
		
	}
}
