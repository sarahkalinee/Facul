import javax.swing.JOptionPane;

public class ProgDecisao {

    public static void main(String[] args) {
        
        char op = 0;
        String msg = "", opc = "Digite 1 se você quer descobrir se o numero é par ou impar \n Digite 2 se você quer descobrir se o numero é positivo ou nao";
        int num = Integer.parseInt(JOptionPane.showInputDialog("digite um numero:"));

        op = (JOptionPane.showInputDialog(opc)).charAt(0);

        switch (op) {
            case '1':

            if (num % 2 == 0) 
            {
                msg = "o numero é par";
                
            } else msg = "o numero é impar";
                
                break;
            case '2':

            if (num > 0) 
            {
                msg = "o numero é positivo";
                
            } else msg = "o numero nao é positivo";
                
                break;
        
            default: JOptionPane.showMessageDialog(null, "opção invalida, calculo não realizado" );
                break;
        }

        if (op == '1' || op == '2') {

            JOptionPane.showMessageDialog(null, msg );
        }
        System.exit(0);

    }
    
}
