import javax.swing.JOptionPane;

public class Anivers�rio {
//M�s do seu anivers�rio
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int ani = Integer.parseInt(JOptionPane.showInputDialog("Digite m�s do seu anivers�rio?"));
		
		switch (ani) {
		case 1:
			System.out.println("Saturno/Verde");
			break;
		case 2:
			System.out.println("Ven�s/azul");
			break;
		case 3:
			System.out.println("Jupiter/Vermelho");
			break;
		case 4:
			System.out.println("Marte/Amarelo");
			break;
		case 5:
			System.out.println("Saturno/Verde");
			break;
		case 6:
			System.out.println("Ven�s/azul");
			break;
		case 7:
			System.out.println("Jupiter/Vermelho");
			break;
		case 8:
			System.out.println("Marte/Amarelo");
			break;
		case 9:
			System.out.println("Saturno/Verde");
			break;
		case 10:
			System.out.println("Ven�s/azul");
			break;
		case 11:
			System.out.println("Jupiter/Vermelho");
			break;
		case 12:
			System.out.println("Marte/Amarelo");
			break;

		default:
			System.out.println("n�o existe mais signo depois do m�s 12");
		}
	}

}
