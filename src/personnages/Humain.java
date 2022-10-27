package personnages;

public class Humain {
	private String name;
	private String boisson;
	private int argent;
	
	public String getName() {
		return name;
	}
	public String getBoisson() {
		return boisson;
	}
	public int getArgent() {
		return argent;
	}
	
	public String bonjour() {
		return "Bonjour ! Je m'appelle" + name + " et j'aime boire du " + boisson;
	}
	public String boire() {
		return "Mmmm, un bon verre de " + boisson + " ! GLOUPS !";
	}
}
