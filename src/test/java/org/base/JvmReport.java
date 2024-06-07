package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJVMReport(String json) {
		//File location
		File loc=new File("C:\\Users\\dell\\eclipse-workspace\\Cucumber_May_Revathy\\src\\test\\resources\\Reports\\JVMReport");

		//configration---some details about project
		Configuration con=new Configuration(loc, "Facebook");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser Version", "111");
		con.addClassifications("Os Name", "Window 11");
		con.addClassifications("Environment", "QA");
		con.addClassifications("Sprint", "26");
		
		//report builder
		List<String> jsonFiles=new ArrayList<>();
		jsonFiles.add(json);
		
		ReportBuilder re=new ReportBuilder(jsonFiles, con);
		re.generateReports();
		
	}
	
}
