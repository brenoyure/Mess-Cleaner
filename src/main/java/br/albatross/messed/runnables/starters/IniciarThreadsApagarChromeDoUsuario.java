package br.albatross.messed.runnables.starters;
import java.io.File;

import br.albatross.messed.runnables.threads.ApagarPastaGoogleChromeDoUsuario;

public class IniciarThreadsApagarChromeDoUsuario implements Runnable {

	private final File usersDir;

	public IniciarThreadsApagarChromeDoUsuario(File usersDir) {
		this.usersDir = usersDir;
	}

	@Override
	public void run() {

		for (File userDir : usersDir.listFiles()) {
			new Thread(new ApagarPastaGoogleChromeDoUsuario(userDir)).start();
		}

	}

}
