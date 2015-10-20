package com.himline.cloud.json;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JSONTest {
	@Test
	public void xml2json(){
		int PRETTY_PRINT_INDENT_FACTOR = 4;
	    String TEST_XML_STRING ="<?xml version=\"1.0\" ?><test attrib=\"moretest\">Turn this to JSON</test>";
	    String actualJson="";
	    String expectedJson = "{\"test\": {\n" +
	    		"    \"attrib\": \"moretest\",\n" +
	    		"    \"content\": \"Turn this to JSON\"\n" +
	    		"}}";
	    try {
            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
            actualJson = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
        } catch (JSONException je) {
            System.out.println(je.toString());
        }
        assertTrue(expectedJson.equals(actualJson));
	}

}
