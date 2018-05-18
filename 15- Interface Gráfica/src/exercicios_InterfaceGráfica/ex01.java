package exercicios_InterfaceGráfica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex01 {

	public static void main(String[] args) {
		
		JFrame formulario = new JFrame();
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500,300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Dados");
		formulario.setLayout(null);
		
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe seu nome");
		rotulo.setBounds(10,10,150,20);
		JTextField campo = new JTextField();
		campo.setBounds(120,10,150,20);
		
		JLabel rotul = new JLabel();
		rotul.setText("Informe sua idade");
		rotul.setBounds(10,50,150,20);
		JTextField camp = new JTextField();
		camp.setBounds(120,50,150,20);
		
		JLabel rotulu = new JLabel();
		rotulu.setText("Informe sua cidade");
		rotulu.setBounds(10,90,150,20);
		JTextField campu = new JTextField();
		campu.setBounds(120,90,150,20);
		
		JButton botao = new JButton();
		botao.setText("Ao preencher clique");
		botao.setBounds(120,130,150,20);
		
		//Adicionar uma ação ao botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Exibir nome
				JOptionPane.showMessageDialog(null,"olá "+campo.getText()+ " sua idade é de "+camp.getText()+ " anos de idade  e sua cidade é a "+campu.getText());
				
				//Limpar o campo contendo no nome
				campo.setText("");
				
				//Selecionar o campo no nome
				campo.requestFocus();
			}
		});
		
		formulario.add(rotulo);
		formulario.add(campo);
		formulario.add(rotul);
		formulario.add(camp);
		formulario.add(rotulu);
		formulario.add(campu);
		formulario.add(botao);
		

		
	}	
}	
		
		
		
		