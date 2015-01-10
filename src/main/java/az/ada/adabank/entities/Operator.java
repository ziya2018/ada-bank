package az.ada.adabank.entities;
/**
 * Operator should enter the username and password into account
 * Author: Mr.JAHAR
*/
public class Operator {

   private String username;

   private String password;

  /**
   * 
   * this method enables to set the name of user 
   */
   public void setUserName(String username)
   {
       this.username = username;
   }
/**
 * 
 * this method gets the name of user 
 */
   public String getUserName()
   {
       return username;
   }
/**
 * 
 * this method sets the password of user
 */
   public void setPassword(String password)
   {
       this.password= password;
   }
   /**
    * this method enables to get the password 
    */
   public String getPassword ()
 
   {
       return password;
   }


}
