import javax.swing.JOptionPane;

public class Progama04 {

    public static void main(String[] args) {
        

        int n1, n2, prod;
        char op =0;
        String msg = "Escolha a opção 1 para calcular o produto do primeiro e segundo numero \n Escolha a opção 2 para calcular a produtoria do numero 1, a quantidade de vezes do numero 2.", rsl = "";

        JOptionPane.showMessageDialog(null, "Neste programa vamos calcular o produto de 2 numeros que voce nos dara, caso eles forem positivos, \n ou vamos calcular a produtória do primeiro numero , a quantidade de vezes do segundo numero.");

        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero."));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero."));
        prod = 1;

        op = (JOptionPane.showInputDialog(msg)).charAt(0);


        switch (op) {
            case '1':

            if (n1 > 0 && n2 > 0) {

                prod = n1 * n2;
                JOptionPane.showMessageDialog(null, "os numero são positivos, este é o produto = " + prod);
                
            } else JOptionPane.showMessageDialog(null, "os numero não são pares, não haverá multiplicação");
                
                break;
            case '2':
             

            for(int i = 1; i<= n2; i++){

                prod *= n1 ;
            }
            JOptionPane.showMessageDialog(null, " esta é a produtória = " + prod);

                
                break;
        
            default: JOptionPane.showMessageDialog(null, " opção invalida, não havera calculo " );
                break;
        }


    }
    
}
