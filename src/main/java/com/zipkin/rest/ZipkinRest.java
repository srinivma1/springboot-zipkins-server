package com.zipkin.rest;
import javax.ws.rs.GET;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ZipkinRest {
	@GET
	@RequestMapping("/zipkinPOCServer")
	@ResponseBody
	public String getZipkin() throws Exception{
		return "Zipkin Server Up and Running";
	}
	

	
	

}

