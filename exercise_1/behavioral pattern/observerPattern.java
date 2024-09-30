import java.util.ArrayList;
import java.util.List;

class StockMarket {
    private List<Investor> investors = new ArrayList<>();
    private double stockPrice;

    public void attach(Investor investor) {
        investors.add(investor);
    }

    public void detach(Investor investor) {
        investors.remove(investor);
    }

    public void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(stockPrice);
        }
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyInvestors();
    }
}

class Investor {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    public void update(double stockPrice) {
        System.out.println("Investor " + name + " notified about new stock price: " + stockPrice);
    }
}

public class observerPattern {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Investor investor1 = new Investor("John");
        Investor investor2 = new Investor("Doe");

        market.attach(investor1);
        market.attach(investor2);

        market.setStockPrice(150);
        market.setStockPrice(12);
    }
}
