package az.ada.adabank.entities;

/**
 * open accounts for costumer
 * 
 * @author Elchin Mammadli
 *
 */
public class Account {
	/**
	 * this is ID number of costumer
	 *
	 */
	private String number;
	/**
	 * person who takes limited credit from bank
	 */
	private String customer;
	/**
	 * balance of costumer
	 */
	private Integer balance;

	/**
	 * determine the ID number
	 * 
	 * @return
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * set ID number correspondingly to amount of money
	 * 
	 * @param number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * set the information about the costumer
	 * 
	 * @return
	 */
	public String getCustomer() {
		return customer;
	}

	/**
	 * give the wanted amount of money to costumer
	 * 
	 * @param customer
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	/**
	 * check the balance of costumer
	 * 
	 * @return
	 */
	public Integer getBalance() {
		return balance;
	}

	/**
	 * set costumer's balance
	 * 
	 * @param balance
	 */
	public void setBalance(Integer balance) {
		this.balance = balance;
	}

}