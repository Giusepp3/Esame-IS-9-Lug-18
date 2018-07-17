package Boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.VisualizzaNumeroEsamiECorsiSostenutiInUnaDataControl;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VisualizzaNumeroEsamiECorsiSostenutiInUnaDataBoundary extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizzaNumeroEsamiECorsiSostenutiInUnaDataBoundary frame = new VisualizzaNumeroEsamiECorsiSostenutiInUnaDataBoundary();
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
	public VisualizzaNumeroEsamiECorsiSostenutiInUnaDataBoundary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 208);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField("gg mm aaaa");
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { //appena si clicca sulla TextField il testo predefinito
				textField.setText("");				// che indica il formato viene cancellato automaticamente
				System.out.println("attendo inserimento data");
			}
		});
		textField.setBounds(221, 104, 212, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblVisualizzaNumeroDi = new JLabel("Visualizza Numero di Esami Sostenuti in una data e il numero dei corsi differenti degli esami");
		lblVisualizzaNumeroDi.setBounds(6, 6, 589, 22);
		contentPane.add(lblVisualizzaNumeroDi);
		
		JLabel lblInserisciUnaData = new JLabel("Inserisci una data per iniziare");
		lblInserisciUnaData.setBounds(6, 109, 191, 16);
		contentPane.add(lblInserisciUnaData);
		
		JButton btnVisualizza = new JButton("Visualizza");
		btnVisualizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("data inserita, provo a leggerla");
				//provo a leggere la data dalla TextField
				String txt = textField.getText();
				SimpleDateFormat dateFormatter = new SimpleDateFormat("dd MM yyyy"); //imposto il formato della data
				
				try {
					Date data = dateFormatter.parse(txt); //creo una data dal testo
					System.out.println("la data letta è " + data.toString());
					VisualizzaNumeroEsamiECorsiSostenutiInUnaDataControl c = new VisualizzaNumeroEsamiECorsiSostenutiInUnaDataControl();
					System.out.println("avvio la funzione");
					LinkedList<String> risultati = c.VisualizzaNumeroEsamiECorsi(data);
					System.out.println("ho ottenuto i risultati, creo l'interfaccia grafica");
					if(risultati.size()==1) {//non ha trovato nessun esame nella data scelta
						RisultatiBoundary r = new RisultatiBoundary(risultati.get(0)); //istanzio la finestra dei risultati
						r.setVisible(true);
					}else {
						String numeroEsami = risultati.get(0);
						String numeroCorsi = risultati.get(1);
						String msg = new String();
						if(numeroCorsi.equals("1")) {
							msg = "in data " + data.toString() + " sono stati sostenuti " + numeroEsami + " esami, tutti di un solo corso";
						}
						else {
							msg = "in data " + data.toString() + " sono stati sostenuti " + numeroEsami + " esami per " + numeroCorsi + " corsi differenti";
						}
						RisultatiBoundary r = new RisultatiBoundary(msg); //istanzio la finestra dei risultati
						r.setVisible(true);
					}
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnVisualizza.setBounds(456, 104, 117, 29);
		contentPane.add(btnVisualizza);
		
		
	}
}