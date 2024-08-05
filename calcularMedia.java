import java.util.ArrayList;
import java.util.List;

public class calcularMedia {

    /*public static double calcularMedia(List<Integer> numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma / numeros.size(); // Problema: divisão por zero se a lista estiver vazia
    }*/

    // Função corrigida com manutenção corretiva
    public static double calcularMedia(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            return 0; // Manutenção: Retorna 0 se a lista estiver vazia ou for nula
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return (double) soma / numeros.size(); // Correção: conversão para double para evitar
        // perda de precisão
    }

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        double media = calcularMedia(numeros);
        System.out.println("Média: " + media);

        numeros.clear();
        media = calcularMedia(numeros);
        System.out.println("Média: " + media); // Manutenção: Agora retorna 0 ao invés de
        // lançar uma exceção
    }
}
