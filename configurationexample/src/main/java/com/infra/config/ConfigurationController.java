package com.infra.config;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {
	
	@Autowired
	private DBProperties dbprop;

	@Value("${server.port}")
	private String serverPort;

	@Value("${name}")
	private String myName;

	@Value("${city}")
	private String myCity;

	@Value("${greeting}")
	private String myGreeting;

	@Value("${list.cities}")
	private List<String> listCities;

	@Value("#{${map.electionrules}}")
	private Map<String, String> mapelectionrules;

	@RequestMapping("/props")
	public String readProperties() {

		System.out.println("serverPort :" + serverPort + ", " + "myName :" + myName + ", " + "myCity :" + myCity);
		String lStr = "serverPort :" + serverPort + ", " + "myName :" + myName + ", " + "myCity :" + myCity;
		return lStr;
	}

//cross reference

	@RequestMapping("/crosprops")
	public String readCrossProperties() {

		System.out.println("Greetings :" + ", " + myGreeting);
		String lStr = "Greetings :" + ", " + myGreeting;
		return lStr;
	}

//List

	@RequestMapping("/listProps")
	public List readListProperties() {

		return listCities;
	}

//Map

	@RequestMapping("/mapelectionrules")
	public Map<String, String> readMapProperties() {

		// Iterator itr = (Iterator) mapelectionrules.entrySet();
		for (Entry<String, String> ruleId : mapelectionrules.entrySet()) {
			// String lStr =(String)itr.next();
			System.out.println(ruleId.toString());

		}

		return mapelectionrules;
	}

	@RequestMapping("/dbconnectionprop")
	public String readDBConnection() {

		String lStr = dbprop.getConnection() + ":" + dbprop.getHost() + ":" + dbprop.getPort();
		return lStr;
	}

}
