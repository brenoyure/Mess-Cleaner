package br.albatross.messed.runnables.starters;

import java.io.File;

import br.albatross.messed.runnables.threads.ApagarPastaTempDoUsuario;

public class IniciarThreadsApagarTempDoUsuario implements Runnable {

	private final File usersDir;

	public IniciarThreadsApagarTempDoUsuario(File usersDir) {
		this.usersDir = usersDir;
	}

	@Override
	public void run() {

		for (File userDir : usersDir.listFiles()) {
			System.out.println("Iniciando Thread de apagar arquivos temp do " + userDir.getName() + "...");
			new Thread(new ApagarPastaTempDoUsuario(userDir)).start();
		}

	}

}
