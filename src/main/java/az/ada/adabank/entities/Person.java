package az.ada.adabank.entities;
/**
 * 
 * @author Ali Mustafali
 */
public class Person extends Customer {

    private String name;

    private String surname;

    private String patronymic;

    private String birthDate;

    private String idCardNumber;

    private String address;

    private String phoneNumber;
     
    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 
     * @param surname 
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    /**
     * 
     * @param patronymic 
     */
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    /**
     * 
     * @param birthDate 
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    /**
     * 
     * @param idCardNumber 
     */
    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }
    /**
     * 
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * 
     * @param phoneNumber 
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * 
     * @return name 
     */
    public String setName() {
        return name;
    }
    /**
     * 
     * @return surname 
     */
    public String setSurname() {
        return surname;
    }
    /**
     * 
     * @return patronymic 
     */
    public String setPatronymic() {
        return patronymic;
    }
    /**
     * 
     * @return birthDate
     */
    public String setBirthDate() {
        return birthDate;
    }
    /**
     * 
     * @return idCardNumber 
     */
    public String setIdCardNumber() {
        return idCardNumber;
    }
    /**
     * 
     * @return address 
     */
    public String setAddress() {
        return address;
    }
    /**
     * 
     * @return phoneNumber 
     */
    public String setPhoneNumber() {
        return phoneNumber;
    }
}