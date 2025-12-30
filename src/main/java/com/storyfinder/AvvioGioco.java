import com.google.gson.Gson;

public class AvvioGioco {

    public static void main(String[] args) {
        Gson gson = new Gson();
        String NOME_STORIA = "storia1.json"; // Si cambia a piacere

        Storia storia = gson.fromJson(
            GestoreStoria.getStory(NOME_STORIA),
            Storia.class
        );

        System.out.println(storia);
    }
}
