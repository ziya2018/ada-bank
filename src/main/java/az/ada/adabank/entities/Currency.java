package az.ada.adabank.entities;

/**
 * This class shows how the currency is changed.
 *
 * @author Tural
 *
 */
public class Currency {

    /**
     * This property represents the name of currency.
     */
    private String name;

    /**
     * This property represents the rate of currency.
     */
    private Integer rate;

    /**
     * This property takes the name of currency.
     *
     * @param name
     */
    public void setString(String name) {
        this.name = name;
    }

    /**
     * This property returns the name of currency.
     *
     * @return
     */
    public String getString() {
        return name;
    }

    /**
     * This property takes the rate of currency.
     *
     * @param rate
     */
    public void setInteger(Integer rate) {
        this.rate = rate;
    }

    /**
     * This property returns the rate of currency.
     *
     * @return
     */
    public int getInteger() {
        return rate;
    }

}
