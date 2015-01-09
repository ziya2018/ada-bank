package az.ada.adabank.entities;

/**
 * Opens an account for taking credit
 *
 * @author Elnara Nabiyeva
 */
public class CreditAccount extends Account {

    public Integer creditLimit;

    /**
     * Shows the limit of credit
     *
     * @return credit limit
     */
    public Integer getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of credit limit
     *
     * @param creditLimit
     */

    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }
}
