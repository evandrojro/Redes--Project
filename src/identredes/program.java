package identredes;
import javax.swing.JOptionPane;
public class program {

	public static void main(String[] args) {

		
				var endIP = new metodos();

				int com;
				String endereco = "";
				do {
					String strInput = JOptionPane.showInputDialog("Menu" 
					+ "\n1 - Converte IP/identifica mascara"
					+ "\n2 - Converte IP/verifica mascara"
					+ "\n9 - Encerrar"); 
					com = Integer.parseInt(strInput); 
					switch (com){
						case 1:
						endereco = JOptionPane.showInputDialog("Endereco de IP"); 

						System.out.println("O IP convertido em binario eh: " + endIP.convert(endereco));
						System.out.println("A classe padrao do IP informado eh: " + endIP.identificaMasc(endIP.convert(endereco)));
						break;

						case 2:
						endereco = JOptionPane.showInputDialog("Endereco de IP com mascara"); 
						System.out.println("O IP convertido em binario eh: " + endIP.convert(endereco));
						if(endIP.verificaMasc(endereco) == 0){
							System.out.println("A mascara informada pelo usuario esta correta");
						} else {
							System.out.println("A mascara correta para este endereco eh: " + endIP.verificaMasc(endIP.convert(endereco)));
						}

						break;
					}
				}while(com!=9);
			}


	}


