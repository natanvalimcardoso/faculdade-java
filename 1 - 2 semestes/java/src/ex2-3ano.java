public class Atv1 {
    public static void main(String[] args) throws Exception {

        int vetor[] = new int[10];
        vetor = new int[] { 1, 24, 3, 4, 26, 24, 7, 8, 9, 10 };
        var have = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 50) {
                have = true;
                System.out.println(vetor[i]);
            }
            
        }
        if(!have){
            System.out.println("dEU CERTO");
        }

    }
}
