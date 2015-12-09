package Kata4;

/**
 *
 * @author Khondax
 */
public class Mail {
    
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
    
    public String getDominio (){
        return mail.split("@")[1];
    }
    
}