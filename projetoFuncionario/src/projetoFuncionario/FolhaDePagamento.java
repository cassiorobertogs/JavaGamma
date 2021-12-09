package projetoFuncionario;

import nucleo.funcionario;

public class FolhaDePagamento {
	public static void main(String[] args) {
		funcionario f1, f2, f3;
		/*
		f1 = new funcionario();
		f2 = new funcionario();
		f3 = new funcionario();

		f1.setNumeroFuncional(112);
		f1.setNome("Abigaiu");
		f1.setCargo("Gerente Geral");
		f1.setSalario(20000.00);
		f1.setTempTrab(12);

		f2.setNumeroFuncional(223);
		f2.setNome("Acássio");
		f2.setCargo("Gerente Regional");
		f2.setSalario(15000.00);
		f2.setTempTrab(10);

		f2.setNumeroFuncional(334);
		f2.setNome("Acássio");
		f2.setCargo("Gerente Regional");
		f2.setSalario(10000.00);
		f2.setTempTrab(5);

		f3.setNumeroFuncional(445);
		f3.setNome("Adailson");
		f3.setCargo("Gerente Local");
		f3.setSalario(5000.00);
		f3.setTempTrab(3);
		*/
		
		f1 = new funcionario(112,"Abigaiu", "Gerente Geral", 20000.00, 20);
		f2 = new funcionario(334,"Acássia", "Gerente Regional", 15000.00, 15);
		f3 = new funcionario(445,"Adailson", "Gerente Local", 5000.00, 3);
		
		f1.mostrarDados();
		f2.mostrarDados();
		f3.mostrarDados();

		f1.aumentarSalario(5);
		f2.aumentarSalario(5);
		f3.aumentarSalario(5);

		f1.mostrarDados();
		f2.mostrarDados();
		f3.mostrarDados();
	}
}
