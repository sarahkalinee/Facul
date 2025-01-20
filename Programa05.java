import javax.swing.*;
public class Programa05 {


    public static void soma() {

        int s = 0; 
        int vet[] = {1, 2, 3, 4, 5};

        for(int i = 0; i< vet.length; i++){

            s = s + vet[i];
        }
        JOptionPane.showMessageDialog(null, "a somatória é: "+ s);

 
    }
    public static int produto() {


        int p = 1; 
        int vet[] = {1, 2, 3, 4, 5};

        for(int i = 0; i< vet.length; i++){
            

            p = p * vet[i];
        }
        
                return p;
        
    }
public static void main(String[] args) {
    
    int r;

    soma();
    r = produto();
    JOptionPane.showMessageDialog(null, "a produtória é: "+ r);
    System.exit(0);
}

}

