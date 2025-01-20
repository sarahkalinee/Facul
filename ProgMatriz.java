import javax.swing.*;

public class ProgMatriz {


    public static void main(String[] args) {
        int vetor[] = {1, 2, 3, 4, 5};
        int matriz[][] = new int[2][3];
        String msg = "Vetor =";


        for(int i = 0; i < vetor.length; i++){

            msg = msg + vetor[i] + "  ";
        }
        JOptionPane.showMessageDialog(null, msg);

        msg = "matriz =  \n \n";

        for(int u = 0; u < matriz.length ; u++){

            for(int j = 0; j < matriz[u].length; j++){

                matriz[u][j] = Integer.parseInt(JOptionPane.showInputDialog("digite um numero para posição " + u + " e " + j));
                msg = msg + matriz[u][j] + "  ";
            }
            msg = msg + "\n";
           
        }
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    
}

}
