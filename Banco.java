public class Banco{
	private Cuenta cuentas;
	
	public void nuevaCuenta(){
		int i = 0;
		
		/*
		while(!cuentas[i].getNombre().equals("") && i < 5){
			i++;
		}
		*/
		cuentas = new Cuenta(CapturaEntrada.capturarString("Nombre: "), CapturaEntrada.capturarEntero("Saldo Inicial: "), CapturaEntrada.capturarEntero("PIN de seguridad(6 digitos): "));
	}
	
	public void abrirCuenta(){
		String nombre;
		int i = 0;
		nombre = CapturaEntrada.capturarString("Nombre del titular: ");
		
		/*
		while(!cuentas[i].getNombre().equalsIgnoreCase(nombre) && i < 5){
			i++;
		}
		*/
		while(CapturaEntrada.capturarEntero("PIN: ") != cuentas.getPIN()){}
		
		
		System.out.println("Nombre: " + cuentas.getNombre());
		System.out.println("Saldo actual: " + cuentas.getSaldo());
	}
	
	public void deposito(int dinero){
		cuentas.setSaldo(cuentas.getSaldo() + dinero);
		System.out.println(cuentas.getSaldo());
	}
	
	public void retiro(int dinero){
		cuentas.setSaldo(cuentas.getSaldo() - dinero);
		System.out.println(cuentas.getSaldo());
	}
}