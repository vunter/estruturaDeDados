package interfaceGrafica;

import java.awt.*;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arrays.Pilha;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPilha extends JFrame {

	private JPanel contentPane;
	private JTextField txtInsiraValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPilha frame = new TelaPilha();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the frame.
	 * 
	 * @throws InterruptedException
	 */
	public TelaPilha() {
		Pilha p = new Pilha();
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 416, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblPilhaIniciada = new JLabel("Pilha Iniciada!");

		lblPilhaIniciada.setFont(new Font("Times New Roman", Font.PLAIN, 41));

		txtInsiraValor = new JTextField();
		txtInsiraValor.setText("Insira Valor");
		txtInsiraValor.setColumns(10);

		JLabel lblEmpilhar = new JLabel("Empilhar");
		lblEmpilhar.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JButton btnEmpilhar = new JButton("Empilhar");

		JLabel lblTamanho = new JLabel("Tamanho: " + p.tamanho());

		JLabel lblltimoValor = new JLabel("\u00DAltimo Valor:");
		lblltimoValor.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel label = new JLabel(String.valueOf(p.exibeUltimoValor()));

		JButton btnExibitUltimoValor = new JButton("Exibir Ultimo Valor");
		btnExibitUltimoValor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(String.valueOf(p.exibeUltimoValor()));
			}
		});

		JButton btnDesempilhar = new JButton("Desempilhar");
		String vazia;

		if (p.pilhaVazia()) {
			vazia = "Sim";
		} else {
			vazia = "Não";
		}

		JLabel lblPilhaVazia = new JLabel("Pilha Vazia: " + vazia);
		lblPilhaVazia.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JButton btnVoltarMenuPrincipal = new JButton("Voltar menu principal");
		btnVoltarMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		JButton btnSairDoPrograma = new JButton("Sair do Programa");
		btnSairDoPrograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ObjButtons[] = { "Sim", "Não" };
				int PromptResult = JOptionPane.showOptionDialog(null, "Tem certeza que deseja sair?",
						"Confirmação de Saída", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null,
						ObjButtons, ObjButtons[1]);
				if (PromptResult == 0) {
					System.exit(0);
				}
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(113)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblPilhaVazia)
												.addComponent(
														btnDesempilhar, GroupLayout.PREFERRED_SIZE, 128,
														GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addGroup(gl_contentPane
										.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnEmpilhar))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtInsiraValor, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(20).addComponent(
												lblEmpilhar, GroupLayout.PREFERRED_SIZE, 54,
												GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(label).addComponent(btnExibitUltimoValor)
												.addComponent(lblltimoValor, GroupLayout.PREFERRED_SIZE, 177,
														GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(70, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(btnVoltarMenuPrincipal)
						.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
						.addComponent(btnSairDoPrograma).addGap(36))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(135).addComponent(lblTamanho)
						.addContainerGap(198, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(55)
						.addComponent(lblPilhaIniciada, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(87, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addComponent(lblPilhaIniciada, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE).addGap(37)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmpilhar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblltimoValor, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtInsiraValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnEmpilhar)
						.addComponent(btnExibitUltimoValor))
				.addGap(17).addComponent(lblPilhaVazia).addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(btnDesempilhar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(8)
				.addComponent(lblTamanho).addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnVoltarMenuPrincipal)
						.addComponent(btnSairDoPrograma))
				.addGap(19)));

		contentPane.setLayout(gl_contentPane);

		
		
		
		btnEmpilhar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.empilhar(txtInsiraValor.getText());
				lblTamanho.setText("Tamanho " + p.tamanho());
				String vazia;
				if (p.pilhaVazia()) {
					vazia = "Sim";
				} else {
					vazia = "Não";
				}
				lblPilhaVazia.setText("Pilha Vazia: " + vazia);
			}
		});
		btnDesempilhar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.desempilhar();
				lblTamanho.setText("Tamanho " + p.tamanho());
				String vazia;
				if (p.pilhaVazia()) {
					vazia = "Sim";
				} else {
					vazia = "Não";
				}
				lblPilhaVazia.setText("Pilha Vazia: " + vazia);
			}
		});

	}
}
