package ManagmentSystem.comm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PassengerDetails extends JFrame {

	private JPanel contentPane;
	private JTextField txtPassengerID;
	private JLabel lblFirstName;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtCNIC;
	private JTextField txtPass;
	private JTextField txtDOB;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassengerDetails frame = new PassengerDetails();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PassengerDetails() {
		setTitle("Passenger Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblID = new JLabel("ID:");
		lblID.setHorizontalAlignment(SwingConstants.CENTER);
		lblID.setBounds(44, 14, 43, 14);
		contentPane.add(lblID);
		
		txtPassengerID = new JTextField();
		getContentPane().add(txtPassengerID);
		txtPassengerID.setBounds(93, 11, 199, 21);
		contentPane.add(txtPassengerID);
		txtPassengerID.setColumns(10);
		
		lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		lblFirstName.setBounds(21, 39, 76, 21);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.LEFT);
		lblLastName.setBounds(21, 64, 76, 20);
		contentPane.add(lblLastName);
		
		JLabel lblCnicNo = new JLabel("CNIC No.:");
		lblCnicNo.setHorizontalAlignment(SwingConstants.LEFT);
		lblCnicNo.setBounds(21, 88, 66, 28);
		contentPane.add(lblCnicNo);
		
		JLabel lblPassportNo = new JLabel("Passport No. :");
		lblPassportNo.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassportNo.setBounds(11, 123, 76, 20);
		contentPane.add(lblPassportNo);
		
		JLabel lblDateofbirth = new JLabel("DateOfBirth:");
		lblDateofbirth.setHorizontalAlignment(SwingConstants.LEFT);
		lblDateofbirth.setBounds(10, 154, 87, 14);
		contentPane.add(lblDateofbirth);
		
		txtFirstName = new JTextField();
		txtFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		txtFirstName.setBounds(94, 39, 199, 20);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setHorizontalAlignment(SwingConstants.LEFT);
		txtLastName.setBounds(94, 64, 200, 21);
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);
		
		txtCNIC = new JTextField();
		txtCNIC.setHorizontalAlignment(SwingConstants.LEFT);
		txtCNIC.setBounds(95, 92, 200, 21);
		contentPane.add(txtCNIC);
		txtCNIC.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setHorizontalAlignment(SwingConstants.CENTER);
		txtPass.setBounds(94, 123, 200, 21);
		contentPane.add(txtPass);
		txtPass.setColumns(10);
		
		txtDOB = new JTextField();
		txtDOB.setBounds(93, 152, 200, 21);
		contentPane.add(txtDOB);
		txtDOB.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PassengerDetails p = new PassengerDetails();
				p.setVisible(true);
				dispose();
			}
		});
		btnAdd.setBounds(91, 209, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WelcomeForm welcome = new WelcomeForm();
				welcome.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(218, 207, 89, 25);
		contentPane.add(btnBack);
	}
}
