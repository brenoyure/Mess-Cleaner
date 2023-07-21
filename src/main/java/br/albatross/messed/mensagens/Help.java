package br.albatross.messed.mensagens;

import static java.lang.System.lineSeparator;

public class Help {

	private static final short SB_SIZE = 27;

	public void exibir() {
		StringBuilder sb = new StringBuilder(SB_SIZE);
		sb.append("#######################################################  Resumo Rápido  ###################################################################\n");
		sb.append("#                                                                                                                                         #\n");
		sb.append("# O Mess Cleaner executará uma limpeza dos componentes:                                                                                   #\n");
		sb.append("#                                                      * Arquivos temporários dos usuários.                                               #\n");
		sb.append("#                                                      * Cache do Windows Update.                                                         #\n");
		sb.append("#                                                      * Limpará e restaurará as configurações padrões dos navegadores Chrome e Firefox.  #\n");
		sb.append("#                                                                                                                                         #\n");
		sb.append("###########################################################################################################################################\n");

		sb.append(lineSeparator());

		sb.append("#####################################################  AVISO Quanto a Limpeza  ############################################################\n");
		sb.append("#                                                                                                                                         #\n");
		sb.append("# Os arquivos temporários, cache do Windows Update e dos Navegadores de outros usuários,                                                  #\n");
		sb.append("# só será efetuada caso o aplicativo seja executado como administrador.                                                                   #\n");
		sb.append("#                                                                                                                                         #\n");
		sb.append("###########################################################################################################################################\n");

		sb.append(lineSeparator());		

		sb.append("#########################################################################################################\n");
		sb.append("#                                                                                                       #\n");
		sb.append("# Execute o aplicativo através da linha de comando 'java -jar MessedApp' que a limpeza será executada.  #\n");
		sb.append("#                                                                                                       #\n");		
		sb.append("# Ou passando manualmente a pasta de usuários e do cache do Windows Update                              #\n");
		sb.append("# como argumentos da linha de comando, ao executar o app.                                               #\n");
		sb.append("# Por exemplo, java -jar MessedApp C:\\Users C:\\Windows\\SoftwareDistribution\\Download                    #\n");
		sb.append("#                                                                                                       #\n");
		sb.append("# Bem útil caso queira limpar o cache de um Windows que esteja em outro disco, como D:\\ ou E:\\          #\n");
		sb.append("#                                                                                                       #\n");
		sb.append("#########################################################################################################");

		System.out.println(sb.toString());

	}

}
