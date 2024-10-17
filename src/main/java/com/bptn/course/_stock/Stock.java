package com.bptn.course._stock;

public class Stock {


	    // Instance variables
	    private String tickerSymbol;
	    private String companyName;
	    private int price;
	    private double percentChange;
	    private int totalShares;
	    private long marketCap;

	    // Constructor
	    public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
	        this.tickerSymbol = tickerSymbol.toUpperCase(); // Convert to uppercase
	        this.companyName = companyName;
	        this.price = price;
	        this.totalShares = totalShares;
	        this.percentChange = 0.0; // Default to zero
	        this.marketCap = (long) price * totalShares; // Calculate market cap
	    }

	    // Method to adjust the price
	    public void adjustPrice(int change) {
	        this.price += change; // Adjust the price
	        this.percentChange = (double) change / this.price * 100; // Calculate percent change
	        this.marketCap = (long) this.price * this.totalShares; // Recalculate market cap
	    }

	    // Method to return a formatted string
	    @Override
	    public String toString() {
	        return "Ticker Symbol: " + this.tickerSymbol + "\n" +
	               "Company: " + this.companyName + "\n" +
	               "Current Price: $" + this.price + " (" + this.percentChange + "%)\n" +
	               "Market Cap: $" + this.marketCap;
	    }

	    // Main method
	    public static void main(String[] args) {
	        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
	        System.out.println(stock);
	        stock.adjustPrice(20);
	        System.out.println(stock);
	    }
	}


