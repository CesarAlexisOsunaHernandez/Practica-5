public class Cuenta{
	private String nombre = "";
	private int saldo = 0, PIN = 0;
	
	public Cuenta(String nombre, int saldo, int PIN){
		this.nombre = nombre;
		this.saldo = saldo;
		this.PIN = PIN;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getPIN(){
		return PIN;
	}
	
	public int getSaldo(){
		return saldo;
	}
	
	public void setSaldo(int saldo){
		this.saldo = saldo;
	}
}