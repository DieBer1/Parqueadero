/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author estudiante
 */
public class Control implements ActionListener{
    
    private Vehiculo Modelo;
    private Vista Vista;
    
    public Control(){}

    public Control(Vehiculo Modelo, Vista Vista) {
        this.Modelo = Modelo;
        this.Vista = Vista;
    }
    
    public void ActionListener (ActionListener Control)
    {
        Vista.btnAgregar.addActionListener(Control);
        Vista.btnLimpiar.addActionListener(Control);
        Vista.btnReiniciar.addActionListener(Control);
        Vista.btnTotalizar.addActionListener(Control);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Agregar"))
        {
            
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
