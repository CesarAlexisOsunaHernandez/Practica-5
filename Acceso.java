public class Acceso{
	public static void main(String args[]){
		int op;
		Banco bank = new Banco();
		
		do{
			op = CapturaEntrada.capturarEntero("1)Nueva cuenta\n2)Abrir cuenta\n3)Salir\n");
			switch(op){
				case 1:
					bank.nuevaCuenta();
				break;
				case 2:
					bank.abrirCuenta();
					switch(CapturaEntrada.capturarEntero("1)Deposito\n2)Retiro\n")){
						case 1:
							bank.deposito(CapturaEntrada.capturarEntero("Cantidad: "));
						break;
						case 2:
							bank.retiro(CapturaEntrada.capturarEntero("Cantidad: "));
						break;
					}
				break;
			}
		}while(op != 3);
		
	}
}