/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Jenny
 */
public class Carro {
    public static void main(String[] args){
        atributos objeto = new atributos();
    
        String propietario = JOptionPane.showInputDialog("Introduce el Propietario ");

        String valor = JOptionPane.showInputDialog("Introduce valor comercial");
        int valorcomercial = Integer.parseInt(valor);
        String color = JOptionPane.showInputDialog("Introduce el color ");
        String placa = JOptionPane.showInputDialog("Introduce la Placa ");
        String matriculado = JOptionPane.showInputDialog("Introduce si esta matriculado ");
        String anio = JOptionPane.showInputDialog("Introduce Año de Matriculacion ");
        int aniofabricacion = Integer.parseInt(anio);

        objeto.setPropietario(propietario);
        objeto.setValorcomercial(valorcomercial);
        objeto.setColor(color);
        objeto.setMatriculado(matriculado);
        objeto.setAniofabricacion(aniofabricacion);

        JOptionPane.showMessageDialog(null, objeto.datos() + "\n" + objeto.calcularAnio() + "\n");

       
    }
    
}
