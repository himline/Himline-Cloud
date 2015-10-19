package com.himline.cloud.request;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Request {
	Object input ;

	public Object getInput() {
		return input;
	}

	public void setInput(Object input) {
		this.input = input;
	}
}