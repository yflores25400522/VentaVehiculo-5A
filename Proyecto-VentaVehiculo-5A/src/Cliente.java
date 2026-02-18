/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yulio
 */
public class Cliente {

    private String rs;
    private String rfc;
    private String email;

    public Cliente(String rs, String rfc, String email) {
        this.rs = rs;
        this.rfc = rfc;
        this.email = email;

    }
    
    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    @Override
    public String toString() {
        return "rs = " + this.rs + "\n"
                + "rfc = " + this.rfc + "\n"
                + "email = " + this.email;
    }
}
