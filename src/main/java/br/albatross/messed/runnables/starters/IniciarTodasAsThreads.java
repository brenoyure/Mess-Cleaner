package br.albatross.messed.runnables.starters;

import java.util.List;

public class IniciarTodasAsThreads {

	public void iniciarTodas(List<Thread> threads) {
		threads.stream().forEach(Thread::start);
	}

}
