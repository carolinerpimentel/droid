package droid;

public class App {

	public static void main(String[] args) {
		
		Droid codey = new Droid("Codey");
		Droid akinator = new Droid("Akinator");
		Droid asimo = new Droid("Asimo");

		System.out.println(codey);

		codey.performTask("to dance");
		codey.performTask("talk");
		codey.performTask("jump");

		System.out.println(akinator);

		codey.energyReport();

		akinator.energyReport();

		codey.energyTransfer(akinator);
		codey.energyReport();

		akinator.energyReport();
		akinator.performTask("guess");
		akinator.energyReport();

		System.out.println(asimo);

		asimo.performTask("walk");
		asimo.energyReport();
		asimo.energyTransfer(codey);
		asimo.energyReport();

		codey.energyReport();
		
		akinator.performTask("cry");
		akinator.performTask("drink");
		akinator.performTask("sing");
		akinator.performTask("smile");
		akinator.energyReport();

	}

}
