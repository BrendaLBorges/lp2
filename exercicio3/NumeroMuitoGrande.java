package NumeroMuitoGrande;

import java.util.Scanner;

public class NumeroMuitoGrande {

    int Vetor1[] = new int[30];
    int Vetor2[] = new int[30];
    int sum[] = new int[30];
    int mult[] = new int[30];
   int adds=0;
  int addm;

    public void Leitura () {
        Scanner imput = new Scanner(System.in);
        System.out.println("Escreva o primeiro numero grande: ");
        String numberbig1= imput.next();
        int tam = numberbig1.length() - 1;
        int i = 29;
        while (tam >= 0) {
            this.Vetor1[i] = Character.getNumericValue(numberbig1.charAt(tam));
            i--;
            tam--;
        }
        System.out.println("Escreva o segundo numero grande: ");
        String numberbig2 = imput.next();

        tam = numberbig2.length() - 1;
        i = 29;
        while (tam >= 0) {
            this.Vetor2[i] = Character.getNumericValue(numberbig2.charAt(tam));
            i--;
            tam--;
        }

    }

    public void SomarVetores () {

        int adds = 0;
        for (int i = 29; i >= 0; i--) {
            this.sum[i] = (this.Vetor1[i] + this.Vetor2[i] + adds + this.sum[i]) % 10;
            adds = (this.Vetor1[i] + this.Vetor2[i] + adds) / 10;
        }

    }

    public void EscreverSoma () {
        for (int i = 0; i <= 29; i++) {
            System.out.print(this.sum[i]);
        }
        System.out.println("");
    }

    public void MultiplicarVetores () {

        for (int i = 29; i >= 0; i--) {
             addm = 0;
            int k = i;
            int j = 29;
            while((j>=0) && (k>=0)){
            this.mult[k] = this.mult[k] + (((this.Vetor1[j] * this.Vetor2[i]) + addm) % 10);
            addm = (((this.Vetor1[j] * this.Vetor2[i]) + addm) / 10);
            k--;
            j--;
            }
        }
        int adds = 0;
        int i;
        for (i = 29; i >= 0; i--) {
           adds = this.mult[i]/10;
           this.mult[i] = ((this.mult[i] + adds)%10);
            
            
          
        }
    }

    public void ImprimirMultiplicacao() {
        for (int i = 0; i <= 29; i++) {
            System.out.print(this.mult[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        NumeroMuitoGrande numberbig = new NumeroMuitoGrande();
numberbig. Leitura ();
numberbig. SomarVetores ();
numberbig. EscreverSoma ();
numberbig. MultiplicarVetores ();
numberbig.ImprimirMultiplicacao();

    }
}
