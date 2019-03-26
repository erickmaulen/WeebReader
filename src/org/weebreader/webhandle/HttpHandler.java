// TO-DO: Redo this shit, try getting a file from website or sum shet.

package org.weebreader.webhandle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class HttpHandler{
	OkHttpClient client = new OkHttpClient();  //Se crea el objeto cliente
	
	
	public String run(String url) throws IOException {
		Request req = new Request.Builder().url(url).build();
		try (Response response = client.newCall(req).execute()) {
			return response.body().string();
		}
	}
	
	public static void test() throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		HttpHandler client = new HttpHandler();
		
		System.out.println("Ingrese URL a descargar informacion: ");
		String search = client.run(r.readLine());
		System.out.println(search);
	}
	
	
	
	
}