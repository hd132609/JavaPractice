/**
 * 
 */
package org.dimigo.io;

import java.net.MalformedURLException;
import java.net.URL;

import java.io.*;

/**
 * <pre>
 * org.dimigo.io
 *   |_SaveImageFromUrl
 *
 * 1. 개요 : 
 * 2. 작성일 : #{date}
 * </pre>
 *
 * @author : hd132609
 * @version : 1.0
 */
public class SaveImageFromUrl {
	public static void main(String[] args) {
		String imageUrl = "https://static.dimigo.in/img/logobeta.png";
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("files/logo.png")) {
				
				byte[] buf = new byte[100];
				int result;
				
				while((result = is.read(buf)) != -1) {
					os.write(buf, 0, result);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
