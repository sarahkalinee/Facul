import javax.swing.*;

public class ProgRepeticao {
    
    public static void main(String[] args) {

        
        char op = 0;
        int tab;
        String msg = "", msgRep = " Digite 1 para usar while \n Digite 2 para usar for \n Digite 3 para usar do/While ";

        JOptionPane.showMessageDialog(null, "Este programa vai te dizer a tabuada do numeo que você quiser, da forma de repetição em java que você escolher!");

        tab = Integer.parseInt(JOptionPane.showInputDialog("escolha um número inteiro para ver sua tabuada "));

        op = (JOptionPane.showInputDialog(msgRep)).charAt(0);


        switch (op) {
            case '1':
            msg = msg + " Tabuada do " + tab + "pelo while: \n \n";
            int i = 1;

            while(i <= 10){

                msg = msg + tab + " * " + i + " = " + tab*i + "\n";
                i++;
            }
                
                break;
            case '2':

            msg = msg + " Tabuada do " + tab + "pelo for: \n \n";

            for(i = 1; i <= 10; i++){

                msg = msg + tab + " * " + i + " = " + tab*i + "\n";
            }
                
                break;
            case '3':
            msg = msg + " Tabuada do " + tab + "pelo do/while: \n \n";
            int e = 1;

           do{
                msg = msg + tab + " * " + e + " = " + tab*e + "\n";
                e++;
            } while(e <= 10);
                break;
        
            default: JOptionPane.showMessageDialog(null, "opção invalida, calculo não realizado");
                break;
        }

        if (op >= '1' && op <= '3') {

            JOptionPane.showMessageDialog(null, msg);
            
        }

        System.exit(0);



    }
}
