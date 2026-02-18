/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yulio
 */
public class Vehiculo {

    private String Marca;
    private double Precio;
    private String motor;
    public Vehiculo(String Marca,double Precio,String motor){
    this.Marca = Marca;
    this.motor = motor;
    this.Precio = Precio;
    
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    @Override
  public String toString(){
  return "La marca del Vehiculo es" + this.Marca + "\n" + 
          "Precio = " + this.Precio + "\n" + 
          "Motor = " + this.motor;
  }
}
