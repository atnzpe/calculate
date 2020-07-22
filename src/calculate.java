public class calculate {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (args[0].equals("somar")) {
            sum(x, y);
        }
        if (args[0].equals("dividir")){
            division(x, y);
        }
        if (args[0].equals("multiplicar")){
            multiple(x, y);
        }
        else if (args[0].equals("subtrair")) {
            minus(x, y);
        }
        else {
            System.out.println("Digite a intrução: somar, dividir, multiplicar ou subtrair acompanhado de DOIS NUMEROS");
        }
    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }

    static void minus(int x, int y) {
        System.out.println(x - y);
    }

    static void division (int x, int y){
        System.out.println (x / y);
    }

    static void multiple(int x, int y){
        System.out.println(x * y);
    }
}
