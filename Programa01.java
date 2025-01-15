public class Programa01 {
    
    public static void main(String entrada[]) {

        int numInt = Integer.parseInt(entrada[0]);
        double numDouble = Double.parseDouble(entrada[1]);
        char caracter = (entrada[2]).charAt(0);

        double soma, div, mult, sub;

        soma = (double)numInt + numDouble;
        div = (double)numInt / numDouble;
        mult = (double)numInt * numDouble;
        sub = (double)numInt - numDouble;

        switch (caracter) {
            case '+':
            System.out.println((double)numInt + " + " + numDouble +" = " + soma);
                
                break;
            case '-':
            System.out.println((double)numInt + " - " + numDouble +" = " + sub);
                
                break;
            case '/':
            System.out.println((double)numInt + " / " + numDouble +" = " + div);
                
                break;
            case '*':
            System.out.println((double)numInt + " * " + numDouble +" = " + mult);
                
                break;
        
            default:
                break;
        }

    }
}
