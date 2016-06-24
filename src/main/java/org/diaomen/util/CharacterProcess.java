/**
 * 
 */
package org.diaomen.util;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * @author Xie
 *
 */
public class CharacterProcess {
	/**
	 * 获取文件里面的内容 
	 * @create 2016年6月24日 下午10:15:24
	 * @by xiehuihui
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static String getContent(File file) throws IOException {
		String content = "";
		if (file == null || !file.exists()) {
			file = new File(System.getProperty("user.dir") + "/file/in");
		}
		Reader reader = new FileReader(file);
		if (reader.ready()) {
			int i = -1;
			char[] cbuf = new char[1024];// 1024char*2=2048bytes
			while ((i = reader.read(cbuf)) != -1) {
				content += new String(cbuf).substring(0, i);
			}
			reader.close();
		}
		return content;
	}
	
	public static void setContent(File file,String content) throws IOException{
		if (file == null || !file.exists()) {
			file = new File(System.getProperty("user.dir") + "/file/out");
		}
		Writer writer = new FileWriter(file);
		writer.write(content.toCharArray());
		writer.flush();
		writer.close();
	}
}
