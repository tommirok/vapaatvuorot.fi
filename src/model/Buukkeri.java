package model;

public class Buukkeri {

	public static void main(String[] args) {
		DAO_IF test = new DAO();
		SP pena = new SP("vuorot", "pena", "ronim@metropolia.fi", "0405353169");
		USER penanasiakas = new USER(0001, "Pertti", "Penanen", "yolo2000", "04077777", "perttip@penamail.com");
		test.createSP(pena);
		test.createUser(penanasiakas);

	}


}
