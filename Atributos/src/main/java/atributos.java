/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Jenny
 */
public class atributos {
 
    private String propietario;
    private double valorcomercial;
    private String color;
    private String placa;
    private String matriculado;
    private int aniofabricacion;

    atributos() {
       
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public double getValorcomercial() {
        return valorcomercial;
    }

    public void setValorcomercial(double valorcomercial) {
        this.valorcomercial = valorcomercial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(String matriculado) {
        this.matriculado = matriculado;
    }

    public int getAniofabricacion() {
        return aniofabricacion;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }

    
    public atributos (String propietario){
        this.propietario = propietario;
        JOptionPane.showInternalMessageDialog(null, "Bienvenidos. Los datos del vehiculo son:");
    }
    
    public String calcularAnio(){
        double anioActual = 2021-aniofabricacion;
        if(anioActual >= 2){
            return "no debe presentarse a la revision";
        }else{
            return "Si debe presentarse a la revision";
        }
    }
    
    public String datos(){
        String informacion = "Informacion del vehiculo\n"
                + "Propietario: " + propietario + "\n"
                + "Valor Comercial: " + valorcomercial + "\n"
                + "Color: " + color + "\n"
                + "Placa: " + placa + "\n"
                + "Matriculado: " + matriculado + "\n"
                + "Anio Fabricacion: " + aniofabricacion + "\n";
                      
        return informacion;
    }
    
    
}
