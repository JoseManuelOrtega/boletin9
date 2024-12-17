package ej1;

public class Terminal {
	String terminal;
	int tiempo;
	public Terminal(String terminal) {
		super();
		this.terminal = terminal;
	}
	public String toString() {
		return "Nº " + terminal + " - " + tiempo + "s de conversación";
	}
	public void llama(Terminal terminal, int i) {
		this.tiempo += i;
		terminal.tiempo += i;
		
	}
	

}
