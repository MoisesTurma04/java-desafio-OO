package entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public Bill(char gender, int beer, int barbecue, int softDrink) {
		this.gender = gender;
		this.beer = beer;
		this.barbecue = barbecue;
		this.softDrink = softDrink;

	}

	public double feeding() {
		return  beer * 5.00 + softDrink * 3.00 + barbecue * 7.00;

	}

	public double cover() {

		if (feeding() > 30.00) {
            System.out.println("Isento de Couvert");
            return 0.00;
        } else {
            System.out.println("Couvert = R$ 4.00");
            return 4.00;
        }
	}

	public double ticket() {
		double ticket = 0;
		if (gender == 'M') {
			ticket = 10.00;
			System.out.printf("Ingresso = R$ %.2f%n" , ticket);
			System.out.println("");

		} else if (gender == 'F') {
			ticket = 8.00;
			System.out.printf("Ingresso = R$ %.2f%n" , ticket);
			System.out.println("");
		} else {
			System.out.println("'M' para Masculino ou 'F' para Feminino");
		}
		return ticket;
	};

	public double total() {
		double feeding = feeding();
        double couvert = cover();
        double ticket = ticket();
        return feeding + couvert + ticket;
	}
	 


}
