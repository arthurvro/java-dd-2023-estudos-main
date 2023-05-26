package view;

import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import model.exception.CampoInvalidoException;
import model.vo.telefonia.Endereco;
import controller.EnderecoController;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroEndereco {

	private JFrame frame;
	private JTextField txtRua;
	private JTextField txtNumero;
	private JTextField txtBairro;
	private JTextField txtMunicipio;
	private JTextField txtEstado;
	private JLabel lblCep;
	private JLabel lblRua;
	private JLabel lblNumero;
	private JLabel lblBairro;
	private JLabel lblMunicipio;
	private JLabel lblEstado;
	private JButton btnSalvar;
	
	private JFormattedTextField txtCEP;
	private MaskFormatter mascaraCep;
	
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
		
		lblCep = new JLabel("CEP");
		lblCep.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(lblCep, "2, 4");
		
		try {
			mascaraCep = new MaskFormatter("#####-###");
			mascaraCep.setValueContainsLiteralCharacters(false);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Erro ao criar máscara de Cep");
		}
		
		txtCEP = new JFormattedTextField(mascaraCep);
		frame.getContentPane().add(txtCEP, "5, 4, fill, default");
		
		lblRua = new JLabel("RUA");
		lblRua.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(lblRua, "2, 6");
		
		txtRua = new JTextField();
		txtRua.setColumns(10);
		frame.getContentPane().add(txtRua, "5, 6, fill, default");
		
		lblNumero = new JLabel("NUMERO");
		lblNumero.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(lblNumero, "2, 8");
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		frame.getContentPane().add(txtNumero, "5, 8, fill, default");
		
		lblBairro = new JLabel("BAIRRO");
		lblBairro.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(lblBairro, "2, 10");
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		frame.getContentPane().add(txtBairro, "5, 10, fill, default");
		
		lblMunicipio = new JLabel("CIDADE");
		lblMunicipio.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(lblMunicipio, "2, 12");
		
		txtMunicipio = new JTextField();
		txtMunicipio.setColumns(10);
		frame.getContentPane().add(txtMunicipio, "5, 12, fill, default");
		
		lblEstado = new JLabel("ESTADO");
		lblEstado.setForeground(new Color(255, 255, 255));
		lblEstado.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(lblEstado, "2, 14");
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		frame.getContentPane().add(txtEstado, "5, 14, fill, default");
		
		btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //evento ao clicar o botao salvar, pode ser qualquer nome
				Endereco novoEndereco = new Endereco();
				novoEndereco.setBairro(txtBairro.getText());
				
				String cepInformado = "";
				try {
					cepInformado = (String) mascaraCep.stringToValue(txtCEP.getText());
				} catch (ParseException e1) {
					//silent
				}
				novoEndereco.setCep(cepInformado);
				novoEndereco.setNumero(txtNumero.getText());
				novoEndereco.setRua(txtRua.getText());
				novoEndereco.setCidade(txtMunicipio.getText());
				novoEndereco.setEstado(txtEstado.getText());
				
				EnderecoController controller = new EnderecoController();
				try {
					controller.inserir(novoEndereco);
					JOptionPane.showMessageDialog(null, "Endereço cadastrado!");
				} catch (CampoInvalidoException e2) {
					JOptionPane.showMessageDialog(null, "Informe os seguintes campos\n " + e2.getMessage());
				}
			}
		});
		
		btnSalvar.setForeground(new Color(255, 255, 255));
		btnSalvar.setBackground(new Color(89, 109, 56));
		frame.getContentPane().add(btnSalvar, "2, 18, 4, 1, fill, bottom");
	}

}
