import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vetorA[] = new int[5];
        int vetorB[] = new int[5];
        int vetorC[] = new int[5];
        Scanner s = new Scanner(System.in);
        for (int i=0; i<5; i++) {
            System.out.println("Digite o primeiro valor");
            vetorA[i] = s.nextInt();
            System.out.println("Digite o segundo valor");
            vetorB[i] = s.nextInt();
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        for (int i=0; i<5; i++) {
            System.out.println("Posição " +i+ " Vetor A " +vetorA[i]+ " Vetor B " +vetorB[i]+ " Vetor C " +vetorC[i]);
        }
    }
}