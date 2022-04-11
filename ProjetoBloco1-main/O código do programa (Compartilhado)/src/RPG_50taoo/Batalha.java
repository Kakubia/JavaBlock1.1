package RPG_50taoo; 

import java.util.ArrayList;
import java.util.Scanner;

//Esperar pra ver como utilizar Collections

public class Batalha {

	public static void main(String[] args) throws InterruptedException {
		Personagem per = new Personagem();
		Imperador imp = new Imperador();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo a 50T�OO, o RPG do Imp�rio da Cevada!\n");
		Thread.sleep(3000);
		
	    System.out.print("Digite o nome do seu personagem: ");
		per.setNome(leia.next());

		while (per.getClasse() != 1 || per.getClasse() != 2 && per.getArquetipo() != 1 || per.getArquetipo() != 2) {
			System.out.println("Agora escolha sua classe, caro(a) jogador(a)!");
			System.out.print("1 - Mago/Feiti�eira | 2 - Guerreiro(a): ");
			per.setClasse(leia.nextInt());
			System.out.println();
			
			if (per.getClasse() == 1) {
				per.setArmadura(8);
				per.setVida(35);
				
				System.out.print("Classe escolhida: Mago/Feiti�eira \n");
				System.out.println("Voc� estudou magia toda sua vida...agora � " 
				+ "hora de por em pr�tica tudo o que aprendeu!");

				System.out.println("Em que tipo de magia voc� � proficiente?");
				System.out.print("1 - Piromancia(Fogo) | 2 - Criogenia(Gelo) - ");
				per.setArquetipo(leia.nextInt());

				if (per.getArquetipo() == 1) {
					System.out.println();
					System.out.println("Arquetipo escolhido: Piromancia");
					System.out.println("Voc� � um(a) mago/feiti�eira que usa de sua magia para queimar a carne "
					+ " de seus inimigos enquanto assiste as chamas tornarem tudo em cinzas.");
					break;
				} else if (per.getArquetipo() == 2) {
					System.out.println();
					System.out.println("Arquetipo escolhido: Criogenia");
					System.out.println("Voc� � um(a) mago/feiti�eira que congela cada cent�metro de seus inimigos, "
					+ "sua alma t�o g�lida quanto sua magia.");
					break;
				} else {
					System.out.println("Eu t� falando que vou te kickar do servidor, tu n�o acredita...");
					System.out.println();
				}
			}

			if (per.getClasse() == 2) {
				per.setArmadura(10);
				per.setVida(40);
				
				System.out.print("Classe escolhida: Guerreiro(a) \n");
				System.out.println("Voc� estudou a arte da guerra por toda a sua vida... "
				+ "mas agora � hora de por em pr�tica tudo o que aprendeu!");

				System.out.println("Em que tipo de arma voc� � proficiente?");
				System.out.print("1 - Arqueiro(a) (Arco de Precis�o) | 2 - Samurai (Katana) - ");
				per.setArquetipo(leia.nextInt());

				if (per.getArquetipo() == 1) {
					System.out.println();
					System.out.println("Arquetipo escolhido: Arqueiro(a)");
					System.out.println("Voc� treinou com um arco sua vida toda, aperfei�oando sua "
					+ " mira e perfurando, com maestria, todos seus inimigos com suas flechas. " 
					+ "Que nem o L�golas.");
					break;
				} else if (per.getArquetipo() == 2) {
					System.out.println();
					System.out.println("Arquetipo escolhido: Samurai");
					System.out.println("Voc� treinou com a espada que voc� herdou de seus antepassados "
					+ "samurai, fatiando e cortando todos pela sua frente. S� n�o a coloque em uma pedra...");
					break;
				} 
				else {
					System.out.println("Escolha um, � seu(ua) palha�o(a).");
				}
			}
			else {
				System.out.println("Vou te kickar do servidor, hein? Escolhe logo!");
				System.out.println();
			}
		}
		Thread.sleep(4000);
		System.out.println();
		per.informacoesPersonagem();
		per.checarClasse(per.getClasse());
		System.out.println();
		Thread.sleep(4500);
		
		System.out.println("Em uma linda sexta-feira, voc� acorda querendo sextar e vai para a sua taverna favorita "
		+ "� fim de se divertir e tomar um suco de cevada geladinho, \nenquanto assiste duelos em sua bola de cristal "
		+ "port�til, um presente de seu av�, Gerenay Icho Brasilis.\n");
		Thread.sleep(7000);
		
		System.out.println("Como hoje � dia de maldade, voc� decide comprar as dez �ltimas garrafas da taverna. "
		+ "Enquanto voc� curte suas loiras geladas, Cezanthersoon, o \nImperador da Cevada, reclama da falta de cerveja "
		+ "na taverna e, apenas pelo cheiro de �lcool, come�a a se aproximar de voc�, derrubando mesas \ne cadeiras em "
		+ "seu caminho, completamente furioso. � hora de lutar!");
		Thread.sleep(11250);
		
		System.out.println();
		System.out.println("Voc� acaba de encontrar...Cezanthersoon, o Imperador da Cevada!");
		System.out.println();
		Thread.sleep(2500);
		
		imp.setVida(50);
		int vidaImp = imp.getVida();
		int vidaPer = per.getVida();
		int contTurno = 1;
		
		while (vidaPer > 0 && vidaImp > 0) {
			System.out.println("Vida do(a) " +  per.getNome() + ": " + vidaPer + " | "
							 + "Vida do Cezantherson: " + vidaImp);
			per.atacar();
			vidaImp -= per.getDano();
		
			if (vidaImp <= 0) {
				System.out.println("Turnos percorridos at� o final da batalha: " + contTurno + "\n");
				break;
			}
		
			imp.atacar();
			vidaPer -= imp.getDanu();
			
			if (vidaPer <= 0) {
				System.out.println("Turnos percorridos at� o final da batalha: " + contTurno + "\n");
				break;
			}
			System.out.println("Fim do turno " + contTurno + "\n");
			contTurno++;
			Thread.sleep(3000);
		}
		
		if (vidaPer <= 0) {
			System.out.println("Voc� foi derrotado(a) pelo Imperador da Cevada...e perdeu todas as suas cervejas.\n");
			Thread.sleep(1000);
			System.out.println("Quem sabe da pr�xima vez? De qualquer forma, parab�ns por (n�o)completar o jogo!\n");
			System.out.println("Cesar e Anderson n�s te amamos! PS: Isso n�o � chantagem pra dar bom feedback kkkk");
			Thread.sleep(4000);
		} 
		else {
			System.out.println("Voc� derrotou o Imperador da Cevada e agora � o novo Imperador! Toda a cevada gelada "
							  + "pertence � voc� agora!\n");
			Thread.sleep(1000);
			System.out.println("Parab�ns por completar nosso jogo '50t�oo'! Deixa um like e nos avalie com 5 estrelas se gostou! " + 
							  "E tamb�m se n�o gostou. Por favor, esse foi nosso primeiro projeto! ;-;\n");
			System.out.println("Cesar e Anderson, n�s te amamos! PS: Isso n�o � chantagem pra dar bom feedback kkkk");
			Thread.sleep(4000);
		}
		
		ArrayList<String> pes = new ArrayList<>();
		
		String pessoa1 = "-Rafael: " + "Programador Chefe\n";
		String pessoa2 = "Mayara: " + "Padroeira dos Programadores que a B�n zuou nosso projeto\n";
		String pessoa3 = "Beatrice: " + "C� t� beijando(muito)????? Ah, o �udio t� ligado...\n";
		String pessoa4 = "L�o: " + "Arrumou o c�digo e deixou todos felizes\n";
		String pessoa5 = "Marcos: " + "Futuro fazedor de trilha de som\n";
		String pessoa6 = "Wesley: " + "N�o � o safad�oo(infelizmente)\n";
		String pessoa7 = "Daniel: " + "Nosso idealizador, mas j� pode tirar do grupo kkkk-";

		pes.add(pessoa1);
		pes.add(pessoa2);
		pes.add(pessoa3);
		pes.add(pessoa4);
		pes.add(pessoa5);
		pes.add(pessoa6);
		pes.add(pessoa7);
		
		System.out.println("\n---> Pessoal que fez o projeto <---");
		System.out.println("\n" + pes);
	}
}
