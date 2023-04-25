package POO;

public class TestaCliente {

	public static void main(String[] args) {

		ClasseCliente[] lista = new ClasseCliente[2];
		
		lista[0] = new ClasseCliente("Maria", "14.05.1987", "roxo", 36, (float) 1.62);
		lista[1] = new ClasseCliente("José", "14.05.1988", "verde", 35, (float) 1.73);
				
		for(ClasseCliente roda:lista) {			
			roda.imprimirInfo();
		}
		
		System.out.println("\n**************************************************");
	}
}