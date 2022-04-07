import java.awt.Container;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

public class TestandoJFormattedTextField extends JFrame {

       public static final long serialVersionUID = 1L;

    public static void main(String[] args)
    {
       TestandoJFormattedTextField field = new TestandoJFormattedTextField();
       field.testaJFormattedTextField();
    }

    public void testaJFormattedTextField() {
             Container janela = getContentPane();
             setLayout(null);

             //Define os rótulos dos botões
             JLabel labelNome = new JLabel("NOME: ");
             JLabel labelCpf = new JLabel("CPF: ");
             
             labelNome.setBounds(50,40,100,20);
             labelCpf.setBounds(50,120,100,20);

             //Define as máscaras
             MaskFormatter mascaraNome = null;
             MaskFormatter mascaraCpf = null;

             try{
                    mascaraNome = new MaskFormatter("???????????????????");
                    mascaraCpf = new MaskFormatter("#########-##");
                    mascaraNome.setPlaceholderCharacter('_');
                    mascaraCpf.setPlaceholderCharacter('_');
             }
             catch(ParseException excp) {
                    System.err.println("Erro na formatação: " + excp.getMessage());
                    System.exit(-1);
             }

             //Seta as máscaras nos objetos JFormattedTextField
             JFormattedTextField jFormattedTextNome = new JFormattedTextField(mascaraNome);
             JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
             jFormattedTextNome.setBounds(150,40,100,20);
             jFormattedTextCpf.setBounds(150,120,100,20);

             //Adiciona os rótulos e os campos de textos com máscaras na tela
             janela.add(labelNome);
             janela.add(labelCpf);
             janela.add(jFormattedTextNome);
             janela.add(jFormattedTextCpf);
             setSize(400, 250);
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             setVisible(true);
    }

}