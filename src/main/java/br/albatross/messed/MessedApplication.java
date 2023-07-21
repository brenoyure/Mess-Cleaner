package br.albatross.messed;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import br.albatross.messed.mensagens.Help;
import br.albatross.messed.mensagens.Logo;
import br.albatross.messed.mensagens.SoNaoSuportado;
import br.albatross.messed.runnables.starters.IniciarThreadApagarTempDoWindowsUpdate;
import br.albatross.messed.runnables.starters.IniciarThreadsApagarChromeDoUsuario;
import br.albatross.messed.runnables.starters.IniciarThreadsApagarFirefoxDoUsuario;
import br.albatross.messed.runnables.starters.IniciarThreadsApagarTempDoUsuario;
import br.albatross.messed.runnables.starters.IniciarTodasAsThreads;

public class MessedApplication {

    public static void main(String[] args) throws Exception {

    	Logo logo = new Logo();
    	logo.exibir();

    	if (args.length == 1) {
    		if (args[0].contentEquals("-h") || args[0].contentEquals("--help")) {
    			Help help = new Help();
    			help.exibir();
    			return;
    		}
    	}

    	if (!System.getProperty("os.name").contains("Windows")) {
			SoNaoSuportado soNaoSuportado = new SoNaoSuportado();
			soNaoSuportado.exibir();
			return;
    	}

    	final File windowsUsersDir;
    	final File windowsUpdateDownloadDir;

    	if (args.length == 0) {
       		windowsUsersDir = new File("C:\\Users");
       		windowsUpdateDownloadDir = new File("C:\\Windows\\SoftwareDistribution\\Download");
    	}

    	else {
    		if (args[0].contains("Windows\\SoftwareDistribution\\Download") && args[1].contains("Users") ) {
    			windowsUpdateDownloadDir = new File(args[0]);
    			windowsUsersDir = new File(args[1]);
    		}
    		else {
    			windowsUsersDir = new File(args[0]);    			
    			windowsUpdateDownloadDir = new File(args[1]);
    		}
    	}

    		Thread apagarTempDoUsuario = new Thread(new IniciarThreadsApagarTempDoUsuario(windowsUsersDir));
    		Thread apagarChromeDoUsuario = new Thread(new IniciarThreadsApagarChromeDoUsuario(windowsUsersDir));
        	Thread apagarTempDoWindowsUpdate = new Thread(new IniciarThreadApagarTempDoWindowsUpdate(windowsUpdateDownloadDir));
        	Thread apagarFirefoxDoUsuario = new Thread(new IniciarThreadsApagarFirefoxDoUsuario(windowsUsersDir));

        	List<Thread> threads = new ArrayList<>();
        	threads.add(apagarTempDoUsuario);
        	threads.add(apagarChromeDoUsuario);
        	threads.add(apagarTempDoWindowsUpdate);
        	threads.add(apagarFirefoxDoUsuario);

        	IniciarTodasAsThreads iniciarThreads = new IniciarTodasAsThreads();
        	iniciarThreads.iniciarTodas(threads);
    	}

    }
