import java.util.Scanner;

public class VerificadorCpf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cpf;
        int a, b;
        int cpfn[] = new int[11];
        int i = 0, j = 0;
        float resto;

        System.out.print("Escreva o CPF: ");
        cpf = input.next();

        for (a = 0; a < 9; a++) {
            char caracter = cpf.charAt(a);
            cpfn[a] = Character.getNumericValue(caracter);
        }

        for (a = 8, b = 2; a >= 0; a--, b++) {
            i = cpfn[a] * b + i;
        }
        if( i%11<2){
            cpfn[9] = 0;
        }else{
            cpfn[9] = (11-(i%11));
        }

        for (a = 9, b = 2; a >= 0; a--, b++) {
            j = cpfn[a] * b + j;
        }
        if( j%11<2){
            cpfn[10] = 0;
        }else{
            cpfn[10] = (11-(j%11));
        }
        System.out.print("O CPF completo sera: ");
        for( a=0; a<=10; a++){
            System.out.print(cpfn[a]);
        }


    }

}
