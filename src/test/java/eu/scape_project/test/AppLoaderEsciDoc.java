package eu.scape_project.test;

import org.apache.commons.cli.ParseException;
import org.junit.Test;

import eu.scape_project.pt.auth.EsciDocAuthentication;
import eu.scape_project.pt.main.Loader;

public class AppLoaderEsciDoc {
	
	
	@Test
	public void load() { 
		
		String[] args = {"-d /home/mhn/Entwicklung/scripts/loader/singlesip", "-r http://localhost:8080", "-i scape/entity-async", "-l scape/lifecycle", "-t 1", "-u sysadmin", "-p sysadmin"};
		try {
			Loader.main(args);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}
