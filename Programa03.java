import javax.swing.*;

public class Programa03 {
    
    public static void main(String entrada[]) {

        int n1, n2, div;
        double pot;
        String msg = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite 1 numero inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite outro numero inteiro: "));

        div = (int)n1 / (int)n2 ;
        pot = Math.pow(n1, n2);

        msg = "Os numeros escolhidos foram " + n1 + " e " + n2 + "\n";
        msg = msg + "o quociente da divisão = " + div + "\n";
        msg = msg + "a potencia de " + n2 + " sob " + n1 + " = " + pot;

        JOptionPane.showMessageDialog(null,msg);
        
    }
}
