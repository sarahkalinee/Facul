public class Programa02 {

    public static void main(String entrada[]) {

        int n1, n2, rest, div;
        double raiz, pot;
        String msg = "";

        n1 = Integer.parseInt(entrada[0]);
        n2 = Integer.parseInt(entrada[1]);

        rest = n1 % n2 ;
        div = (int)n1 / (int)n2 ;
        raiz = Math.sqrt(n1);
        pot = Math.pow(n1, n2);

        msg = " os números são : "+ n1 + "," + n2 + "\n";
        msg = msg + "o resto da divisão de " + n1 + " e " + n2 + " é " + rest + "\n";
        msg = msg + "o quociente é " + div + "\n";
        msg = msg + "a raiz quadrada do numero " + n1 + " é " + raiz + "\n";
        msg = msg + " e a potencia de " + n1 + " elevado a "+ n2 +" é igual a "+ pot + "\n";

        System.out.println(msg);
        System.exit(0);



        
    }
    
}
