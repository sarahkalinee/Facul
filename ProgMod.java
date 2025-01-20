import javax.swing.*;

public class ProgMod {

    public static void soma() {
        int n1, n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero."));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero."));

        JOptionPane.showMessageDialog(null, "A SOMA  é " + (n1+n2));

        
    }
    public static void subtracao (int x, int y) {
        int s;

        s = x - y;

        JOptionPane.showMessageDialog(null, "a diferença é " + s);


        
    }
    public static int produto() {
        int n1, n2, p;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero."));
         n2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero."));

         p = n1 * n2;

        return(p);
  
    }
    public static double divisao (int x, int y) {

        double d;

        d = (double)x / (double)y;
            return (d);
        
    }
    public static void main(String[] args) {

        int n1, n2, s;
        double r;

        soma();

        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite 1 numero inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite outro numero inteiro: "));
        subtracao(n1, n2);
        s = produto();
        JOptionPane.showMessageDialog(null, "o produto é " + s);
        r = divisao(n1, n2);
        JOptionPane.showMessageDialog(null, "a divisão é " + r);

        System.exit(0);


        
    }
    
}
