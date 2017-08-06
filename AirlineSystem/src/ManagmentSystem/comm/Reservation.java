package ManagmentSystem.comm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reservation extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation frame = new Reservation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Reservation() {
		setTitle("Seat Reservation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClass = new JLabel("Class:");
		lblClass.setHorizontalAlignment(SwingConstants.CENTER);
		lblClass.setBounds(32, 10, 58, 27);
		contentPane.add(lblClass);
		
		JLabel lblTicketType = new JLabel("Ticket Type:");
		lblTicketType.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicketType.setBounds(10, 48, 80, 20);
		contentPane.add(lblTicketType);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrom.setBounds(37, 79, 53, 20);
		contentPane.add(lblFrom);
		
		JLabel lblOutboundDate = new JLabel("OutBound Date:");
		lblOutboundDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutboundDate.setBounds(10, 108, 89, 27);
		contentPane.add(lblOutboundDate);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo.setBounds(58, 142, 25, 20);
		contentPane.add(lblTo);
		
		JLabel lblReturnDate = new JLabel("Return Date:");
		lblReturnDate.setBounds(12, 169, 80, 26);
		contentPane.add(lblReturnDate);
		
		JLabel lblPersons = new JLabel("Persons :");
		lblPersons.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersons.setBounds(18, 206, 71, 27);
		contentPane.add(lblPersons);
		
		JLabel lblPassengerId = new JLabel("Passenger ID:");
		lblPassengerId.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassengerId.setBounds(18, 235, 81, 20);
		contentPane.add(lblPassengerId);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "One Way", "Return"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(100, 48, 92, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "..."}));
		comboBox_1.setBounds(106, 206, 80, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"First", "Buisness", "Economy"}));
		comboBox_2.setBounds(100, 13, 92, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Karachi", "Hyderabad", "Lahore", "Islamabad", "Rawalpindi", "Quetta", "Multan"}));
		comboBox_3.setBounds(100, 79, 92, 20);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Karachi", "Hyderabad", "Lahore", "Islamabad", "Rawalpindi", "Quetta", "Multan"}));
		comboBox_4.setBounds(106, 147, 89, 20);
		contentPane.add(comboBox_4);
		
		textField = new JTextField();
		textField.setBounds(102, 112, 138, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 169, 138, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(106, 232, 138, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Payment pay = new Payment();
				pay.setVisible(true);
				dispose();
			}
		});
		btnSubmit.setBounds(33, 299, 100, 25);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WelcomeForm wf = new WelcomeForm();
				wf.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(142, 299, 101, 24);
		contentPane.add(btnBack);
	}
}
