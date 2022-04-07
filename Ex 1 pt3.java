import Ex1.ValidarCPF;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {

		String cpf, nome;
		
		nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		cpf = JOptionPane.showInputDialog("Digite o seu cpf: ");
		
        if (ValidarCPF.isCPF(cpf) == true)
        	JOptionPane.showMessageDialog(null, "CPF Válido: " + ValidarCPF.imprimeCPF(cpf));
        else
        	JOptionPane.showMessageDialog(null, "CPF inválido");
	}
}