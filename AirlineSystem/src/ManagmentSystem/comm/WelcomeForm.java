package ManagmentSystem.comm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeForm extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeForm frame = new WelcomeForm();
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
	public WelcomeForm() {
		setTitle("Airline Managment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcometoAirline = new JLabel("Welcome to Airline Managment System");
		lblWelcometoAirline.setBounds(5, 5, 501, 14);
		lblWelcometoAirline.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcometoAirline.setFont(new Font("Baskerville Old Face", Font.PLAIN, 13));
		contentPane.add(lblWelcometoAirline);
		
		JLabel lblDevelopedByMtariq = new JLabel("Developed By: M.Tariq Qamar & Rida Ashfaq");
		lblDevelopedByMtariq.setBounds(5, 342, 501, 14);
		lblDevelopedByMtariq.setHorizontalAlignment(SwingConstants.TRAILING);
		contentPane.add(lblDevelopedByMtariq);
		
		JButton btnPassengerDetails = new JButton("Passenger Details");
		btnPassengerDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PassengerDetails Pdetails = new PassengerDetails();
				Pdetails.setVisible(true);
				dispose();
				
			}
		});
		btnPassengerDetails.setBounds(13, 42, 139, 30);
		contentPane.add(btnPassengerDetails);
		
		JButton btnReservation = new JButton("Reservation");
		btnReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Reservation R = new Reservation();
				R.setVisible(true);
				dispose();
			}
		});
		btnReservation.setBounds(13, 83, 139, 30);
		contentPane.add(btnReservation);
		
		JButton btnCancelTicket = new JButton("Cancel Ticket");
		btnCancelTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CancelTicket CT = new CancelTicket();
				CT.setVisible(true);
				dispose();
			}
		});
		btnCancelTicket.setBounds(13, 125, 139, 30);
		contentPane.add(btnCancelTicket);
		
		JButton btnexit = new JButton("Exit");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnexit.setBounds(172, 269, 149, 30);
		contentPane.add(btnexit);
		
		JButton btnViewPassenger = new JButton("View Passenger");
		btnViewPassenger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewPassenger VP = new ViewPassenger();
				VP.setVisible(true);
				dispose();
			}
		});
		btnViewPassenger.setBounds(13, 166, 139, 30);
		contentPane.add(btnViewPassenger);
	}
}
