package exemplo01;

import javax.swing.JOptionPane;

public class Aluno {
	
	/*
	    Encapsulamento -> Visibilidade de atributos e métodos
	    DEFAUT    -> Vìsivel apenas nas classes no mesmo  pacote
	    PUBLIC    -> Vísivel por qualquer classe (Em qualquer projeto)
	    PRIVATE   -> Vísivel apeans na classe onde são criados
	    PROTECTED -> Vísivel na classe onde são criados ou herdados
	 */
	
	//Atributos da classe
	String nome;
	double nota1, nota2;
	
	//Método para obter os dados
	public void obterDados(){
		nome = JOptionPane.showInputDialog("Nome");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 01"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 02"));
	}
	
	//Método para retornar a média
	private double calculoMedia(){
		return (nota1+nota2) / 2;
	}
	
	//Método para exibir uma frase
	private void exibirFrase(){
		JOptionPane.showInputDialog(null, nome+" obteve média "+calculoMedia());
	}
}
