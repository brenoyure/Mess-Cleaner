package br.albatross.messed.runnables.threads;

import java.io.File;

public class ApagarPastasTempDoWindowsUpdate implements Runnable {

	private final File windowsUpdateDownloadDir;

	public ApagarPastasTempDoWindowsUpdate(File windowsUpdateDownloadDir) {
		this.windowsUpdateDownloadDir = windowsUpdateDownloadDir;
	}

	@Override
	public void run() {

		try {
			if (windowsUpdateDownloadDir.exists() && windowsUpdateDownloadDir.isDirectory() && windowsUpdateDownloadDir.canWrite()) {
				File newTempDir = new File(windowsUpdateDownloadDir.getAbsolutePath() + System.currentTimeMillis());
				if (windowsUpdateDownloadDir.renameTo(newTempDir)) {
					System.out.println(windowsUpdateDownloadDir + " renomeada para " + newTempDir);
				}

				Runtime.getRuntime().exec("cmd.exe /c rmdir /s /q " + windowsUpdateDownloadDir.getAbsolutePath());
				System.out.println("Arquivos temp do Windows Update apagados.");

			}

		} catch (Exception e) {	throw new RuntimeException(e); }

	}

}
