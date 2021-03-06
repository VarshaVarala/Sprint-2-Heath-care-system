package com.pdw;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.pdw.entity.Appointment;

import junit.framework.Assert;
@SuppressWarnings("deprecation")
@RunWith(SpringRunner.class)
@SpringBootTest
public class HcsAppointmentViewApplicationTests {
	
	@Test
	public void TestDiagnosticListSuccess() throws URISyntaxException{
		RestTemplate rest=new RestTemplate();
		final String baseUrl="http://localhost:"+1110+"/User/FetchAppList";
		URI uri=new URI(baseUrl);
		
		ResponseEntity<Appointment []> result=rest.getForEntity(uri,Appointment[].class);
		Appointment[] appointments=result.getBody();
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertNotNull(appointments);
	
	}
	
	@Test
	public void TestDiagnosticListFail() throws URISyntaxException{
		RestTemplate rest=new RestTemplate();
		final String baseUrl="http://localhost:"+1110+"/User/FetchAppList";
		URI uri=new URI(baseUrl);
		
		ResponseEntity<Appointment[]> result=rest.getForEntity(uri,Appointment[].class);
		Assert.assertEquals(400, result.getStatusCodeValue());
	
	}

}
