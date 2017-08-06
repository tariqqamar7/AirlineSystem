package ManagmentSystem.comm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CancelTicket extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CancelTicket frame = new CancelTicket();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CancelTicket() {
		setTitle("Cancel Ticket");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WelcomeForm ww = new WelcomeForm();
				ww.setVisible(true);
				dispose();
				
			}
		});
		btnBack.setBounds(335, 11, 89, 23);
		contentPane.add(btnBack);
		
		JLabel lblPassengerId = new JLabel("Passenger ID :");
		lblPassengerId.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassengerId.setBounds(10, 11, 93, 20);
		contentPane.add(lblPassengerId);
		
		JLabel lblPassengerName = new JLabel("Passenger Name :");
		lblPassengerName.setBounds(10, 37, 96, 23);
		contentPane.add(lblPassengerName);
		
		JLabel lblPassportNo = new JLabel("Passport No. :");
		lblPassportNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassportNo.setBounds(12, 69, 86, 21);
		contentPane.add(lblPassportNo);
		
		JLabel lblSeatNo = new JLabel("Seat No. :");
		lblSeatNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeatNo.setBounds(32, 94, 58, 23);
		contentPane.add(lblSeatNo);
		
		JLabel lblTotalAmount = new JLabel("Total Amount :");
		lblTotalAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalAmount.setBounds(10, 130, 89, 23);
		contentPane.add(lblTotalAmount);
		
		textField = new JTextField();
		textField.setBounds(105, 12, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(105, 38, 128, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(104, 69, 130, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(103, 99, 130, 23);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(103, 131, 130, 23);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnCancelTicket = new JButton("Cancel Ticket");
		btnCancelTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CancelTicket cc = new CancelTicket();
				cc.setVisible(true);
				dispose();
			}
		});
		btnCancelTicket.setBounds(35, 213, 118, 23);
		contentPane.add(btnCancelTicket);
		
		JButton btnView = new JButton("View");
		btnView.setBounds(176, 213, 118, 23);
		contentPane.add(btnView);
	}

}
