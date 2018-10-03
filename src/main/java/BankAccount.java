import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    private double interestRate;
    /**
     *
     */
    private double interestEarned;

    /**
     *  constructor;
     * @param name set name
     * @param accountCategory set type of ban account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;

    }

    /**
     *
     * @return
     */
    public int getaccountNumber() {
        return this.accountNumber;
    }

    /**
     *
     * @return
     */
    public BankAccountType getaccountType() {
        return this.accountType;
    }

    /**
     *
     * @return
     */
    public double getaccountBalance() {
        return this.accountBalance;
    }

    /**
     *
     * @return
     */
    public String getownerName() {
        return this.ownerName;
    }

    /**
     *
     * @param input
     */
    public void setownerName(final String input) {
        this.ownerName = input;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
