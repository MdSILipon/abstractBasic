package root;

import lib.cusTomer;
import lib.mobliePhone;
import lib.phone;
import lib.smartPhone;
import lib.telephone;

public class Main {
	public static void main(String []args) {
		
		phone ph = new telephone();
		mobliePhone mp = new smartPhone();
		
		cusTomer person = new cusTomer();
		
		person.corporateContact(ph);
		person.personalContact(mp);
		
	}
}
