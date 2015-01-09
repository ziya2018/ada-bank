package az.ada.adabank.entities;

/**
 * Allows to take operations on custormer's balance
 * @author Elnara Nabiyeva
 */
public class Transaction {

  public String id;
  
  public String date;

  public String account;

  public String type;

  public Integer amount;

  public String currency;

  /**
   * Shows ID number of customer
   * 
   * @return id number
   */
    public String getId() {
        return id;
    }
    
    /**
     * Sets id number to its value
     * 
     * @param id 
     */

    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Shows the date of the operation
     * 
     * @return date 
     */
    
    public String getDate() {
        return date;
    }
    
    /**
     * Sets the date of operation to it
     * 
     * @param date 
     */
    
    public void setDate(String date) {
        this.date = date;
    }
    
    /**
     * Shows the which belongs to the current customer
     * @return account
     */

    public String getAccount() {
        return account;
    }

    /**
     * Sets this account correspondingly
     * @param account 
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Shows the type of operation
     * 
     * @return  type
     */
    public String getType() {
        return type;
    }
    
    /**
     * Sets the type of operation correspondingly
     * 
     * @param type 
     */

    public void setType(String type) {
        this.type = type;
    }
     /**
      * Shows the amount needed for operation
     * 
      * @return amount
      */  

    public Integer getAmount() {
        return amount;
    }

    /**
     * Sets the amount needed for operation
     * 
     * @param amount 
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Shows the currency which is needed for the operation
     * 
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }
    
    /**
     * Sets the currency which is needed for the operation
     * 
     * @param currency 
     */

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}