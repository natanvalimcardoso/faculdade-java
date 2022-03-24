/* Faça um programa para ler uma matriz 4 por 4, contendo os valores de notas de g1, 
e outro de g2. Ao final, o programa deve mostrar as médias dos alunos, mostrando se o aluno está aprovado,
 em exame ou reprovado. Considere média > 7 para aprovação,7 < média >6 para exame; e < 6 como reprovado. 
Importante deve ser validado que as notas aceitas sejam de 0 a 10.*/

public class exercicio_um {
    public static void main(String[] args) {

        int notas[][] = new int[3][3]; // classe bidimensional
        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Digite a nota do aluno " + (i + 1) + " na prova " + (j + 1) + ": ");
                notas[i][j] = Integer.parseInt(System.console().readLine());
                soma += notas[i][j];
                
            }
            System.out.println("A média do aluno " + (i + 1) + " é: " + (soma / notas.length));
            soma = 0;
            } 
           
        }
    }
    
