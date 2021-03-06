package model;

public class TocaMusicaComando implements Comando {
	
	private Player player;
	private String file;
	
	public TocaMusicaComando(Player player, String file) {
		this.player = player;
		this.file = file;
	}
	
	
	public void executa(Player player) {
		try {
			this.player.play(this.file);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	
}
