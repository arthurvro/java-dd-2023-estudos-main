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
import java.awt.Color;

public class TelaCadastroEndereco {

	private JFrame frame;
	private JTextField txtCep;
	private JTextField txtRua;
	private JTextField txtNumero;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtEstado;
	private JButton btnSalvar;
	
	//TESTE DE ATUALIZACAO GIT

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
		frame.getContentPane().setBackground(new Color(68, 82, 115));
		frame.setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 498, 283);
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
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(lblCep, "2, 4");
		
		txtCep = new JTextField();
		frame.getContentPane().add(txtCep, "5, 4, fill, default");
		txtCep.setColumns(10);
		
		JLabel lblRua = new JLabel("RUA");
		lblRua.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(lblRua, "2, 6");
		
		txtRua = new JTextField();
		txtRua.setColumns(10);
		frame.getContentPane().add(txtRua, "5, 6, fill, default");
		
		JLabel lblNumero = new JLabel("NUMERO");
		lblNumero.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(lblNumero, "2, 8");
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		frame.getContentPane().add(txtNumero, "5, 8, fill, default");
		
		JLabel lblBairro = new JLabel("BAIRRO");
		lblBairro.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(lblBairro, "2, 10");
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		frame.getContentPane().add(txtBairro, "5, 10, fill, default");
		
		JLabel lblCidade = new JLabel("CIDADE");
		lblCidade.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(lblCidade, "2, 12");
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		frame.getContentPane().add(txtCidade, "5, 12, fill, default");
		
		JLabel lblEstado = new JLabel("ESTADO");
		lblEstado.setForeground(new Color(255, 255, 255));
		lblEstado.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(lblEstado, "2, 14");
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		frame.getContentPane().add(txtEstado, "5, 14, fill, default");
		
		btnSalvar = new JButton("SALVAR");
		btnSalvar.setForeground(new Color(255, 255, 255));
		btnSalvar.setBackground(new Color(89, 109, 56));
		frame.getContentPane().add(btnSalvar, "2, 18, 4, 1, fill, bottom");
	}

}
