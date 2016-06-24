package org.diaomen;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class App {
	public static void main(String[] args) throws Exception {
		String project_path = System.getProperty("user.dir");
		File in = new File(project_path + "/file/in");
		File out = new File(project_path + "/file/out");
		Reader reader = new FileReader(in);
		if (reader.ready()) {
			char[] cbuf = new char[100];
			int i = -1;
			while ((i = reader.read(cbuf)) != -1) {
				System.out.print(new String(cbuf).substring(0, i));
			}
		}
	}
}
