
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author piero
 */
public class CajaValidacion {
    private JTextField caja;
    private JLabel error;

    public CajaValidacion(JTextField caja, JLabel error) {
        this.caja = caja;
        this.error = error;
    }
 
    public float getValor(){
        float valor = 0;
        error.setText("");
        try{
            String valoTexto = caja.getText();
            valor = Float.parseFloat(valoTexto);          
        } catch(NumberFormatException ex){
               error.setText("Error de formato");
        
        }
        return valor;
        
    }
    
    public void mostrarInfo(String t){
        this.error.setText("");
        this.caja.setText(t);    
    }
    
    public void mostrarError(String er){
          this.error.setText(er);
    }
    
    
    public JTextField getCaja() {
        return caja;
    }

    public void setCaja(JTextField caja) {
        this.caja = caja;
    }

    public JLabel getError() {
        return error;
    }

    public void setError(JLabel error) {
        this.error = error;
    }
    
}
