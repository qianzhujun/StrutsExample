/**
 *
 */
package com.raph.struts.action;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * @author Raphael
 *
 */
public class DownloadFileAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		//return an application file instead of html page
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition","attachment;filename=test.zip");
        
        try 
    	{
        	
        	//First you should create the file test.zip in C: or StrutsExample/upload
        	
        	//method 1
        	//Get it from file system
        	//FileInputStream in = new FileInputStream(new File("C:\\test.zip"));
        	
        	
        	//method 2
        	//Get it from web path
        	//localhost/StrutsExample/upload/test.zip
        	URL url = getServlet().getServletContext().getResource("upload/test.zip");
        	InputStream in = url.openStream();
        	
        	
        	//method 3
        	//If you retrieve the files or blob data from database, it’s usually return as bytes array.
        	//Get it from bytes array
        	//byte[] bytes = new byte[4096];
        	//InputStream in = new ByteArrayInputStream(bytes);

        	ServletOutputStream out = response.getOutputStream();
        	 
        	byte[] outputByte = new byte[4096];
        	//copy binary contect to output stream
        	while(in.read(outputByte, 0, 4096) != -1)
        	{
        		out.write(outputByte, 0, 4096);
        	}
        	in.close();
        	out.flush();
        	out.close();

    	}catch(Exception e){
    		e.printStackTrace();
    	}

		return null;
	}
}
