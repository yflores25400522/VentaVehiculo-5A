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

    @Override
    public String toString() {
        return "rs = " + this.rs + "\n"
                + "rfc = " + this.rfc + "\n"
                + "email = " + this.email;
    }
}
