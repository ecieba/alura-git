package br.com.letscode.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        saudacao("Emerson Moreno");
    }

    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome);
    }
}