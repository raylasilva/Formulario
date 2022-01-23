

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;



public class Interface extends JFrame implements ActionListener{
 JButton botao;
 JMenuItem menuitem, menuitem2;
 JRadioButton radio, radio2;
 JTextField texto, texto2, texto3, texto4, texto5;
 JLabel label, label2, label3, label4, label5, label6;
 JScrollPane scrol;
 JPasswordField senha;
 JList lista;
 JMenu menu, menu2;
 JMenuBar menubar;
 JCheckBox checar;
 ButtonGroup botaor;

 
public Interface(){
    super("FORMULÁRIO");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
   
    
    
    //JPanel
    JPanel painel = new JPanel();
    painel.setPreferredSize(new Dimension(700,500));
    add(painel);
    painel.setLayout(null);
    pack();
    setLocationRelativeTo(null);
    
    int largura = getContentPane().getSize().width;
    int altura = getContentPane().getSize().height;
    
    //JButton
    botao = new JButton("Checar Dados");
    botao.setBounds(largura - 398,altura - 70,150,30);
    painel.add(botao);
    
    //JRadioButton
    radio = new JRadioButton();
    radio2 = new JRadioButton();
    radio.setBounds(88,200, 90, 30);
    radio2.setBounds(190,200, 100, 30);
    radio.setText("FEMININO");
    radio2.setText("MASCULINO");
    painel.add(radio);
    painel.add(radio2);
    
    //JTextField
    texto = new JTextField();
    texto2 = new JTextField();
    texto3 = new JTextField();
    texto.setBounds(largura - 600,34,120,30);
    texto2.setBounds(largura - 600,75,120,30);
    texto3.setBounds(largura - 600,118,120,30);
    texto.setSize(300,25);
    texto2.setSize(300,25);
    texto3.setSize(300,25);
    painel.add(texto);
    painel.add(texto2);
    painel.add(texto3);
  
    
    
    
    //JLabel
    label = new JLabel();
    label2 = new JLabel();
    label3 = new JLabel();
    label4 = new JLabel();
    label5 = new JLabel();
    label6 = new JLabel();
    label.setBounds(50,90, 100, 80);
    label2.setBounds(50,134, 100, 80);
    label3.setBounds(50,180, 100, 70);
    label4.setBounds(50,10, 100, 80);
    label5.setBounds(50,50, 100, 80);
    label6.setBounds(50,214, 100, 70);
    label4.setText("NOME:");
    label5.setText("CIDADE:");
    label.setText("EMAIL:");
    label2.setText("SENHA:");
    label3.setText("SEXO:");
    label6.setText("RAÇA:");
    painel.add(label);
    painel.add(label2);
    painel.add(label3);
    painel.add(label4);
    painel.add(label5);
    painel.add(label6);
    
    
    //JPasswordField
    senha = new JPasswordField();
    senha.setBounds(largura - 600,160,120,30);
    senha.setSize(300,25);
    painel.add(senha);
    
    
    //JList
    String[] raca = {"Branco","Preto", "Pardo","Amarelo","Indigena"};
    lista = new JList(raca);
    lista.setBounds(100,245, 200, 100);
    painel.add(lista);
    
    //JScrollPane
    scrol = new JScrollPane(lista);
    scrol.setBounds(100,245, 200, 100);
    scrol.setVisible(true);
    scrol.setSize(300,60);
    painel.add(scrol);
    
    
    //JCheckBox
    checar = new JCheckBox("SALVAR SENHA?");
    checar.setBounds(450,154, 200, 40);
    painel.add(checar);
   
    
    //JMenu
    menu = new JMenu("OPÇÕES");
    menu2 = new JMenu("EDITAR");
    
    
    //JMenuBar
    menubar = new JMenuBar();
    setJMenuBar(menubar);
    menubar.setBounds(0,0, 200, 40);
    menubar.add(menu);
    menubar.add(menu2);
    
    
    
    //JMenuItem
    menuitem = new JMenuItem("SALVAR");
    menuitem2 = new JMenuItem("SAIR");
    menu.add(menuitem);
    menu.add(menuitem2);
 
    //ButtonGroup
    botaor = new ButtonGroup();
    botaor.add(radio);
    botaor.add(radio2);
    
    
    setVisible(true);


         this.botao.addActionListener(this);
         
        
         
         
         menuitem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           JOptionPane.showMessageDialog(null,"SALVO");
              }
             
         });
         
   
         
         menuitem2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             System.exit(0);
        }
    });
}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== botao) {

                   String  s = "\nOla, Seus dados são: "+"\nNome: " + texto.getText() +
                            "\nCidade: " + texto2.getText()+
                            "\nEmail: " + texto3.getText()+
                            "\nSenha: " + new String(senha.getPassword())+
                           "\nSexo feminino: " + radio.isSelected() + "\nSexo masculino: "+ radio2.isSelected()+
                           "\nRaça: " + lista.getSelectedValue();
                           
                           
                            
              
			JOptionPane.showMessageDialog(null,s,"DADOS",JOptionPane.INFORMATION_MESSAGE);
               

                }  
                    
                }
        
}
   