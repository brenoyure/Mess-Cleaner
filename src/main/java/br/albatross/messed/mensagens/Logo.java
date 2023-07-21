package br.albatross.messed.mensagens;

public class Logo {

	public void exibir() {
		StringBuilder sb = new StringBuilder(5);
    	sb.append("###########################################\n");
    	sb.append("#                                         #\n");
    	sb.append("#        Mess Cleaner by Albatross        #\n");
    	sb.append("#                                         #\n");
    	sb.append("###########################################\n");
    	System.out.println(sb.toString());
	}

}
