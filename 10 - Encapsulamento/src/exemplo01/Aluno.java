package exemplo01;

import javax.swing.JOptionPane;

public class Aluno {
	
	/*
	    Encapsulamento -> Visibilidade de atributos e m�todos
	    DEFAUT    -> V�sivel apenas nas classes no mesmo  pacote
	    PUBLIC    -> V�sivel por qualquer classe (Em qualquer projeto)
	    PRIVATE   -> V�sivel apeans na classe onde s�o criados
	    PROTECTED -> V�sivel na classe onde s�o criados ou herdados
	 */
	
	//Atributos da classe
	String nome;
	double nota1, nota2;
	
	//M�todo para obter os dados
	public void obterDados(){
		nome = JOptionPane.showInputDialog("Nome");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 01"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 02"));
	}
	
	//M�todo para retornar a m�dia
	private double calculoMedia(){
		return (nota1+nota2) / 2;
	}
	
	//M�todo para exibir uma frase
	private void exibirFrase(){
		JOptionPane.showInputDialog(null, nome+" obteve m�dia "+calculoMedia());
	}
}
