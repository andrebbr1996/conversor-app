import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.printf("Digite a moeda de origem (ex: USD): ");
        String fromCurrency = leitura.nextLine().toUpperCase();
        System.out.println();
        System.out.println("Digite a moeda de destino (ex: BRL): ");
        String toCurrency = leitura.nextLine().toUpperCase();
        System.out.println("Digite o valor a ser convertido: ");
        double amount = leitura.nextDouble();
        Currency currency = new Currency(fromCurrency,toCurrency,amount);
        try{
            CurrencyConverter currencyConverter = new CurrencyConverter();
            Currency convertedAmount = currencyConverter.convertCurrency(currency);
            System.out.printf("%.2f %s equivalem a %.2f %s\n", amount, fromCurrency,convertedAmount.getConversion_result(), toCurrency);
        }catch (Exception e){
            System.out.println("Erro ao converter moedas: " + e.getMessage());
        }finally {
            leitura.close();
        }
    }
}