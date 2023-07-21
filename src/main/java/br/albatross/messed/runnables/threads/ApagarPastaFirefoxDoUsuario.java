package br.albatross.messed.runnables.threads;

import java.io.File;

public class ApagarPastaFirefoxDoUsuario implements Runnable {

    private final File userFolder;

    public ApagarPastaFirefoxDoUsuario(File userFolder) {
        this.userFolder = userFolder;
    }

	@Override
	public void run() {
		try {
			File tempDir = new File(userFolder, "AppData/Local/Mozilla/");

			if (tempDir.exists() && tempDir.isDirectory() && tempDir.canWrite()) {
				File newTempDir = new File(tempDir.getAbsolutePath() + System.currentTimeMillis());
				if (tempDir.renameTo(newTempDir)) {
					System.out.println(tempDir + " renomeada para " + newTempDir);
					tempDir = newTempDir;
				}
				Runtime.getRuntime().exec("cmd.exe /c rmdir /s /q " + tempDir.getAbsolutePath());
				System.out.println("Arquivos temp do navegador Chrome do usuário " + userFolder.getName() + " apagados.");

			}
		} catch (Exception e) {	throw new RuntimeException(e); }
	}

}