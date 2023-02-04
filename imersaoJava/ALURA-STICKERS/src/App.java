import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    private static HttpClient newHttpClient;
    private static HttpRequest request;
    private static HttpResponse<String> response;

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("main inicializado!");

        // acessar os dados do IMDb HTTP e buscar os top 250 filmes
        String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
        URI endereco = URI.create(url);
        newHttpClient = HttpClient.newHttpClient();
        request = HttpRequest.newBuilder(endereco).GET().build();
        response = newHttpClient.send(request, BodyHandlers.ofString());
        String body = response.body();
        //System.out.println(body);

        // converter JSON 
        var parse = new JsonParser();
        List<Map<String,String>> listaDeFilmess = parse.parse( body);
/* 
        System.out.println(listaDeFilmess.size() );
        System.out.println(listaDeFilmess.get(0));
*/
        // extrair conteúdo do body (titulo, poster e classificacao
        for (Map<String,String> filme : listaDeFilmess) {
            System.out.println(filme.get("title"));
            System.out.println(filme.get("image"));
            System.out.println(filme.get("imDbRating"));
        }
        

    }
}
