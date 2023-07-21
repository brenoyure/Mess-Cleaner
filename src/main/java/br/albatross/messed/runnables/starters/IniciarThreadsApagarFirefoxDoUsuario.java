package br.albatross.messed.runnables.starters;
import java.io.File;

import br.albatross.messed.runnables.threads.ApagarPastaFirefoxDoUsuario;

public class IniciarThreadsApagarFirefoxDoUsuario implements Runnable {

	private final File usersDir;

	public IniciarThreadsApagarFirefoxDoUsuario(File usersDir) {
		this.usersDir = usersDir;
	}

	@Override
	public void run() {

		for (File userDir : usersDir.listFiles()) {
			new Thread(new ApagarPastaFirefoxDoUsuario(userDir)).start();
		}

	}

}
