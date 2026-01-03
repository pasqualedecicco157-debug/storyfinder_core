package com.storyfinder;
import java.until.scanner;
public class AvvioGioco {

    public static void main() {
        scanner scanner = new scanner (sistem.in);
        System.out.println("scrivi un nome");
        string nome = scanner.nextline();
        System.out.println("scrivi un luogo");
        string luogo = scanner.nextline();
    }
}
  Scanner scanner = new Scanner(System.in);
  System.out.println("Che cosa vuoi cercare?");
  String argomento = scanner.nextline();
  GestoreStoria gestorestoria = new Gestorestoria();
  Storia storia = gestoreStoria.getBestStory();
  System.out.println(storia);