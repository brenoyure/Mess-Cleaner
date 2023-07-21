package br.albatross.messed.runnables.starters;

import java.io.File;

import br.albatross.messed.runnables.threads.ApagarPastasTempDoWindowsUpdate;

public class IniciarThreadApagarTempDoWindowsUpdate implements Runnable {

	private final File windowsUpdateDowloadDir;

	public IniciarThreadApagarTempDoWindowsUpdate(File windowsUpdateDowloadDir) {
		this.windowsUpdateDowloadDir = windowsUpdateDowloadDir;
	}

	@Override
	public void run() {
		new Thread(new ApagarPastasTempDoWindowsUpdate(windowsUpdateDowloadDir)).start();
	}

}
