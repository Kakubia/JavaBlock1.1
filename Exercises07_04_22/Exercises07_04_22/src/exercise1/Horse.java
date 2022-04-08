package exercise1;

public class Horse extends Animals{

	@Override
	public void emitirSom() {
		System.out.println("Cavalo relinchando");
	}
	
	public void correr() {
		System.out.println("Cavalo correndo");
	}
}
