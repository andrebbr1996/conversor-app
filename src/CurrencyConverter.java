import java.io.IOException;

public class CurrencyConverter {
    public Currency convertCurrency(Currency currency) throws IOException, InterruptedException {
        ExchangeRateAPI exchangeRateAPI = new ExchangeRateAPI();
        Currency convertedCurrency = exchangeRateAPI.convertedCurrency(currency);
        return convertedCurrency;
    }
}
