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

public class ViewPassenger extends JFrame {

	private JPanel contentPane;
	private JTextField txtPassID;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtPassNo;
	private JTextField txtCNIC;
	private JTextField txtDoB;
	private JButton btnEdit;
	private JButton btnSave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPassenger frame = new ViewPassenger();
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
	public ViewPassenger() {
		setTitle("View & Edit Passenger");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPassengerId = new JLabel("Passenger ID:");
		lblPassengerId.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassengerId.setBounds(10, 11, 80, 24);
		contentPane.add(lblPassengerId);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName.setBounds(10, 35, 65, 24);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setBounds(10, 70, 80, 24);
		contentPane.add(lblLastName);
		
		JLabel lblPassportNo = new JLabel("Passport No. :");
		lblPassportNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassportNo.setBounds(10, 105, 80, 24);
		contentPane.add(lblPassportNo);
		
		JLabel lblCnic = new JLabel("CNIC:");
		lblCnic.setHorizontalAlignment(SwingConstants.CENTER);
		lblCnic.setBounds(10, 131, 49, 24);
		contentPane.add(lblCnic);
		
		JLabel lblDob = new JLabel("DoB:");
		lblDob.setHorizontalAlignment(SwingConstants.CENTER);
		lblDob.setBounds(20, 166, 49, 24);
		contentPane.add(lblDob);
		
		txtPassID = new JTextField();
		txtPassID.setBounds(96, 9, 189, 24);
		contentPane.add(txtPassID);
		txtPassID.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(96, 35, 189, 24);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(96, 62, 189, 24);
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);
		
		txtPassNo = new JTextField();
		txtPassNo.setBounds(96, 92, 189, 24);
		contentPane.add(txtPassNo);
		txtPassNo.setColumns(10);
		
		txtCNIC = new JTextField();
		txtCNIC.setBounds(96, 122, 189, 24);
		contentPane.add(txtCNIC);
		txtCNIC.setColumns(10);
		
		txtDoB = new JTextField();
		txtDoB.setBounds(96, 152, 189, 24);
		contentPane.add(txtDoB);
		txtDoB.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WelcomeForm WF = new WelcomeForm();
				WF.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(375, 12, 89, 23);
		contentPane.add(btnBack);
		
		btnEdit = new JButton("Edit");
		btnEdit.setBounds(61, 229, 89, 23);
		contentPane.add(btnEdit);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(195, 229, 89, 23);
		contentPane.add(btnSave);
	}

}
