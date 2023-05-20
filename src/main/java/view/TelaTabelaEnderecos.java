package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;

public class TelaTabelaEnderecos {

	private JFrame frmTelaDeListagem;
	private JTable table;
	private JButton btnBuscarAll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTabelaEnderecos window = new TelaTabelaEnderecos();
					window.frmTelaDeListagem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaTabelaEnderecos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaDeListagem = new JFrame();
		frmTelaDeListagem.setTitle("Listagem de Cliente");
		frmTelaDeListagem.setBounds(100, 100, 684, 420);
		frmTelaDeListagem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaDeListagem.getContentPane().setLayout(null);
		
		btnBuscarAll = new JButton("BUSCAR TODOS");
		btnBuscarAll.setBounds(256, 29, 154, 21);
		frmTelaDeListagem.getContentPane().add(btnBuscarAll);
		
		table = new JTable();
		table.setBounds(29, 80, 615, 267);
		frmTelaDeListagem.getContentPane().add(table);
	}
}
