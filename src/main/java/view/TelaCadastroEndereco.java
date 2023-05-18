package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaCadastroEndereco {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnSalvar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroEndereco window = new TelaCadastroEndereco();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastroEndereco() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 498, 328);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				ColumnSpec.decode("max(215dlu;default):grow"),
				FormSpecs.RELATED_GAP_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblCep = new JLabel("CEP");
		frame.getContentPane().add(lblCep, "2, 4");
		
		textField = new JTextField();
		frame.getContentPane().add(textField, "5, 4, fill, default");
		textField.setColumns(10);
		
		JLabel lblRua = new JLabel("RUA");
		frame.getContentPane().add(lblRua, "2, 6");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1, "5, 6, fill, default");
		
		JLabel lblNumero = new JLabel("NUMERO");
		frame.getContentPane().add(lblNumero, "2, 8");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2, "5, 8, fill, default");
		
		JLabel lblBairro = new JLabel("BAIRRO");
		frame.getContentPane().add(lblBairro, "2, 10");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3, "5, 10, fill, default");
		
		JLabel lblCidade = new JLabel("CIDADE");
		frame.getContentPane().add(lblCidade, "2, 12");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		frame.getContentPane().add(textField_4, "5, 12, fill, default");
		
		JLabel lblEstado = new JLabel("ESTADO");
		frame.getContentPane().add(lblEstado, "2, 14");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		frame.getContentPane().add(textField_5, "5, 14, fill, default");
		
		btnSalvar = new JButton("Salvar");
		frame.getContentPane().add(btnSalvar, "2, 16, 4, 1");
	}

}
