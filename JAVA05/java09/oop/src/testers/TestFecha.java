package testers;

import oop.Fecha;

public class TestFecha {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Fecha f = new Fecha();
f.setDia(6);
f.setMes(3);
f.setAño(2023);
System.out.println(f.diaMesAño());
	}

}
