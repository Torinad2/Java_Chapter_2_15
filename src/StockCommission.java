/******************************************************************
 * Stock Commission Calculator                                    *
 * This program calculates the total cost of purchasing stocks,   *
 * including the broker's commission fee. It displays the cost of *
 * the stock alone, the commission amount, and the total cost.    *
 ******************************************************************/

public class StockCommission {

    /**************************************************************
     * Main Method                                                *
     * Calculates the total cost of the stock purchase, the       *
     * broker's commission, and displays the breakdown.           *
     **************************************************************/
    public static void main(String[] args) {

        //*********************************************************
        // Constant Declarations                                  *
        // These are fixed values for the shares, price, and rate *
        //*********************************************************
        final int NUMBER_OF_SHARES = 600;             // Number of shares purchased
        final double PRICE_PER_SHARE = 21.77;         // Price of each share
        final double COMMISSION_RATE = 0.02;          // 2% commission rate

        //*********************************************************
        // Variable Declarations                                  *
        // To store calculated values                             *
        //*********************************************************
        double stockCost;                             // Total cost of the stock alone
        double commissionAmount;                      // Commission fee
        double totalCost;                             // Total amount paid (stock + commission)

        //*********************************************************
        // Calculation Section                                    *
        // Calculate the stock cost, commission, and total cost   *
        //*********************************************************
        stockCost = NUMBER_OF_SHARES * PRICE_PER_SHARE;
        commissionAmount = stockCost * COMMISSION_RATE;
        totalCost = stockCost + commissionAmount;

        //*********************************************************
        // Output Section                                         *
        // Display the breakdown of costs                         *
        //*********************************************************
        System.out.println();
        System.out.printf("%-25s $%.2f\n", "Amount Paid for Stock:", stockCost);
        System.out.printf("%-25s $%.2f\n", "Broker Commission (2%):", commissionAmount);
        System.out.printf("%-25s $%.2f\n", "Total Amount Paid:", totalCost);

        //*********************************************************
        // Developer Credit                                       *
        //*********************************************************
        System.out.println();
        System.out.println("Developed by: Nikita Baiborodov");

        //*********************************************************
        // Program End                                            *
        //*********************************************************
        System.exit(0);
    }
}

