import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateAPI {


    private static final String url_link = "https://v6.exchangerate-api.com/v6/";
    private static final String api_key = "562a0ca60c42bb707f912b69";
    private String final_link;

    public Currency convertedCurrency(Currency currency) throws IOException, InterruptedException {
        final_link = "https://v6.exchangerate-api.com/v6/" + api_key + "pair/" + currency.getBase_code() + "/" + currency.getTarget_code() + "/" + currency.getAmount();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(final_link)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson= new GsonBuilder().setPrettyPrinting().create();
        String json = response.body();
        Currency currencyConverted = gson.fromJson(json, Currency.class);


        return currencyConverted;
    }



}
