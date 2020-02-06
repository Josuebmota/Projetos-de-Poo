import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class Jogo extends JFrame {
	int Digito;
	Random Nradom = new Random();
	int r = Integer.valueOf(Nradom.nextInt(1001));
	public static void main(String args[]) { //Isso � pra chamar
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jogo frame = new Jogo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Jogo(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,135);
		
		JPanel mensagem = new JPanel();
		this.getContentPane().add(mensagem, BorderLayout.NORTH);
		
		JTextField tela = new JTextField();
		tela.setEditable(false);
		tela.setBackground(Color.WHITE);
		mensagem.add(tela);
		tela.setColumns(10);
		
		JPanel dificuldade = new JPanel();
		this.getContentPane().add(dificuldade, BorderLayout.SOUTH);
		
		JRadioButton facil = new JRadioButton("F�cil");
		dificuldade.add(facil);
		JRadioButton medio = new JRadioButton("M�dio");
		dificuldade.add(medio);
		JRadioButton dificil = new JRadioButton("Dif�cil");
		dificuldade.add(dificil);
		JRadioButton mdificil = new JRadioButton("Muito Dif�cil");
		dificuldade.add(mdificil);
		
		ButtonGroup grupo= new ButtonGroup();
		grupo.add(facil);
		grupo.add(medio);
		grupo.add(dificil);
		grupo.add(mdificil);
		
		JPanel n=new JPanel();
		this.getContentPane().add(n, BorderLayout.CENTER);
		JTextField numero = new JTextField();
		n.add(numero);
		numero.setColumns(5);
		
		JButton Confirmar = new JButton("Enter");
		n.add(Confirmar);
		
		Confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Digito = Integer.parseInt(numero.getText());
				if(r==Digito) {
					tela.setBackground(Color.GREEN);
					tela.setText("N�mero Correto");
					JOptionPane.showMessageDialog(null,"Numero escolhido: "+r);
					tela.setBackground(Color.GRAY);
					tela.setText("");
					r = Integer.valueOf(Nradom.nextInt(1001));
				}
				else {
					if(facil.isSelected()) {
						if(r>200+Digito){
							tela.setText("N�mero Muito Baixo");
							tela.setBackground(Color.red);
						}
						if(200+r<Digito){
							tela.setText("N�mero Muito Alto");
							tela.setBackground(Color.red);
						}
						if(r>100+Digito && r<200+Digito){
							tela.setText("N�mero Baixo");
							tela.setBackground(Color.orange);
						}
						if(100+r<Digito && 200+r>Digito) {
							tela.setText("N�mero alto");
							tela.setBackground(Color.orange);
						}
						if(r>Digito && r<100+Digito && r<200+Digito){
							tela.setText("N�mero pouco Baixo");
							tela.setBackground(Color.YELLOW);
						}
						if(r<Digito && 100+r>Digito && 200+r>Digito) {				
							tela.setText("N�mero pouco Alto");
							tela.setBackground(Color.YELLOW);
						}
					}
					if(medio.isSelected()) {
						if(r>200+Digito) {
							tela.setText("N�mero Muito Baixo");
							tela.setBackground(Color.red);
						}		
						if(200+r<Digito) {
							tela.setText("N�mero Muito Alto");
							tela.setBackground(Color.red);
						}
						if(r>100+Digito && r<200+Digito) {
							tela.setText("N�mero Baixo");
							tela.setBackground(Color.orange);
						}
						if(100+r<Digito && 200+r>Digito) {
							tela.setText("N�mero Alto");
							tela.setBackground(Color.orange);
						}
					}
					if(dificil.isSelected()) {
						if(r>Digito) {
							tela.setText("N�mero Muito Baixo");
							tela.setBackground(Color.red);
						}
						if(r<Digito) {
							tela.setText("N�mero Alto");
							tela.setBackground(Color.red);
						}
					}
					if(mdificil.isSelected()){
						tela.setText("N�mero Errado");
					}
				}
			}
		});
	System.out.print(r);
	}
}