/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author piero
 */
public class Operacion {
    private CajaValidacion caja1;
    private CajaValidacion caja2;
    private CajaValidacion resultado;

    public Operacion(CajaValidacion valor1, 
            CajaValidacion valor2, 
            CajaValidacion resultado) {
        this.caja1 = valor1;
        this.caja2 = valor2;
        this.resultado = resultado;
    }

    public void  suma(){
      float res= this.caja1.getValor()+
             this.caja2.getValor();
      
       this.resultado.mostrarInfo(res+"");
    }
    public void resta(){
      float res= this.caja1.getValor()-
             this.caja2.getValor();
      
       this.resultado.mostrarInfo(res+"");
    }
    public void div(){
      float res= this.caja1.getValor()/
             
              this.caja2.getValor();
      
      if(this.caja2.getValor()== 0){
          
          this.resultado.mostrarError("No se puede dividir entre cero");
      
      }else if(this.caja1.getValor()== 0 && this.caja2.getValor() == 0){
          
              this.resultado.mostrarError("Ambos números deben ser mayores a cero ");
      }else{
       
              this.resultado.mostrarInfo(res+"");}
    }
    public void mul(){
     float res= this.caja1.getValor()*
             this.caja2.getValor();
      
       this.resultado.mostrarInfo(res+"");
    }

    public CajaValidacion getCaja1() {
        return caja1;
    }

    public void setCaja1(float valor1) {
        this.caja1 = caja1;
    }

    public CajaValidacion getCaja2() {
        return caja2;
    }

    public void setCaja2(float valor2) {
        this.caja2 = caja2;
    }
    
}
