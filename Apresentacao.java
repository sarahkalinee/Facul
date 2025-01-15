class Apresentacao {

    public static void main(String entrada[]) {

        int idade = 19;
        String nome, curso;
        char genero = 'm';
        double peso = 68.0;

        nome = "sarah";
        curso = "ADS";

        if (genero == 'f') 
        {
            System.out.println("Oi, meu nome é "+ nome +",tenho " + idade +" anos. Atualmente estou cursando "+ curso +" na faculdade Descomplica, meu peso é "+ peso +"kg e sou do sexo feminino");
            
        } else 
        System.out.println("Oi, meu nome é "+ nome +",tenho " + idade +" anos. Atualmente estou cursando "+ curso +" na faculdade Descomplica, meu peso é "+ peso +"kg e sou do sexo masculino");


        System.exit(0);
        
    }
}