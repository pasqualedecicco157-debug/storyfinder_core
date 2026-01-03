package com.storyfinder;

import java.util.Scanner;

public class AvvioGioco {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("scrivi un nome");
        String nome = scanner.nextLine();
        System.out.println("scrivi un luogo");
        String luogo = scanner.nextLine();
        System.out.println("Che cosa vuoi cercare?");
        String argomento = scanner.nextLine();
        GestoreStoria gestoreStoria = new GestoreStoria();
        Storia storia = gestoreStoria.getBestStory(argomento);
        System.out.println(storia);
    }
}
