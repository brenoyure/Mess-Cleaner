package br.albatross.messed.mensagens;

public class SoNaoSuportado {

	private static final short SB_SIZE = 5;

	public void exibir() {
		StringBuilder sb = new StringBuilder(SB_SIZE);
    	sb.append("\n#################### S.O Não Suportado ########################\n");
    	sb.append("#                                                             #\n");
    	sb.append("#    O aplicativo é suportado apenas no Microsoft Windows     #\n");
    	sb.append("#                                                             #\n");
    	sb.append("###############################################################");
    	System.out.println(sb.toString());
	}

}
