package br.com.simoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OrdenarESepararNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parte 1: Ordenar nomes
        System.out.println("Parte 1: Digite os nomes separados por vírgula (ex: Ana,Pedro,João):");
        String inputNomes = scanner.nextLine();

        // Dividir os nomes usando split e armazenar em um array
        String[] nomes = inputNomes.split(",");

        // Remover espaços extras e ordenar os nomes
        Arrays.sort(nomes, String::compareToIgnoreCase);

        // Imprimir os nomes ordenados
        System.out.println("\n--- Parte 1: Nomes Ordenados ---");
        for (String nome : nomes) {
            System.out.print(nome.trim() + " ");
        }
        System.out.println("\n");

        // Parte 2: Separar por grupos de gênero
        System.out.println("Parte 2: Digite o nome e o sexo separados por vírgula (ex: Lua-F, Rodrigo-M):");
        String inputPessoas = scanner.nextLine();

        // Separar as entradas usando split
        String[] pessoas = inputPessoas.split(",");

        // Listas para armazenar os grupos
        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        // Processar cada entrada
        for (String pessoa : pessoas) {
            String[] detalhes = pessoa.split("-");
            String nome = detalhes[0].trim();
            String sexo = detalhes[1].trim().toUpperCase();

            // Separar por gênero
            if ("M".equals(sexo)) {
                grupoMasculino.add(nome);
            } else if ("F".equals(sexo)) {
                grupoFeminino.add(nome);
            }
        }

        // Imprimir os grupos
        System.out.println("--- Parte 2: Grupos Separados por Gênero ---");
        System.out.println("Grupo Masculino: " + String.join(", ", grupoMasculino));
        System.out.println("Grupo Feminino: " + String.join(", ", grupoFeminino));
    }
}
