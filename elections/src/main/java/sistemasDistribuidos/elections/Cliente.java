package sistemasDistribuidos.elections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Cliente {

    public static void main(String[] args) {
        // Votar por un candidato
        votarPorCandidato("John Doe");

        // Obtener todos los votos
        obtenerTodosLosVotos();
    }

    public static void votarPorCandidato(String candidateName) {
        try {
            URL url = new URL("http://localhost:8080/votes");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            String input = "{\"candidateName\":\"" + candidateName + "\"}";

            try (OutputStream os = conn.getOutputStream()) {
                os.write(input.getBytes(StandardCharsets.UTF_8));
            }

            int responseCode = conn.getResponseCode();
            System.out.println("Response Code (votar): " + responseCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void obtenerTodosLosVotos() {
        try {
            URL url = new URL("http://localhost:8080/votes");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            int responseCode = conn.getResponseCode();
            System.out.println("Response Code (obtener): " + responseCode);

            if (responseCode == 200) { // OK
                try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        response.append(line);
                    }
                    System.out.println("Votos: " + response.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
