
public class Cuenta
{
  private String propietario;
  private int carnet;
  private String domicilio;
  private int numTelef;
  private double saldo;
  public Cuenta(String propietario, int carnet, String domicilio, int numTelef){
    this.propietario = propietario;
    this.carnet = carnet;
    this.domicilio = domicilio;
    this.numTelef = numTelef;
    saldo = 0.0;
    }
  
     public double depositarMonto(double monto2){
     saldo = saldo + monto2;
     return saldo;
   }
   public double retirarMonto(double monto3){
     saldo = saldo - monto3;
     return saldo;
   }
    
  public void setCambiarPropietario(String propietario){
    this.propietario = propietario;
    }
  public String getPropietario(){
    return propietario;
    }
  public void setCambiarCarnet(int carnet){
    this.carnet = carnet;
    }
  public int getCarnet(){
    return carnet;
    }
  public void setCambiarDomicilio(String domicilio){
    this.domicilio = domicilio;
    }
  public String getDomicilio(){
    return domicilio;
    }
  public void setCambiarNumTelef(int numTelef){
    this.numTelef = numTelef;
    }
  public int getNumTelef(){
    return numTelef;
    }
   
}
