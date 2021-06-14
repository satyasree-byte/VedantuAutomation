package Helpers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;

public class TestDataReader {
		
		private static final String CSVTESTDATAPATH = "./src/test/resources/TestDataVedantu.csv";
		
		public String getValue(String TestID ,String Param) throws IOException {
			
			File file = new File(CSVTESTDATAPATH);
			byte[] bytes = FileUtils.readFileToByteArray(file);
			String data = new String(bytes);
			
			data = RegExUtils.replaceAll(data, "\r", "");
			String[] dataArray =  data.split("\n");
			
			String keys = dataArray[0];
			List<String> KeysFromFile = new ArrayList<String>();
			String[] keyArr = keys.split(",");
			
			KeysFromFile.addAll(Arrays.asList(keyArr));
			KeysFromFile.remove(0);
			//System.out.println(dataArray[0]);
			Map<String , Map<String, String>> OuterMap = new HashMap<String, Map<String, String>>();
			
			for(int d = 1 ; d < dataArray.length ; d++) {
				
				Map<String , String> hmp = new HashMap<String, String>();
				ArrayList<String> row = new ArrayList<String>();
				
				String[] rowArr = dataArray[d].split(",");
				row.addAll(Arrays.asList(rowArr));
				String KeyForTestCase = row.get(0);
				row.remove(0);
				
				for(int i = 0 ; i < KeysFromFile.size() ; i++) {
					hmp.put((KeysFromFile.get(i)).trim(), row.get(i).trim());
					
				}
				OuterMap.put(KeyForTestCase, hmp);	
			}	
			//System.out.println(OuterMap.get("MiCreditReport_Generation1"));
			
			Map<String, String> rowMap = OuterMap.get(TestID);
			//System.out.println(rowMap.get("MIID"));
			return (rowMap.get(Param));
			
			
		}

}
