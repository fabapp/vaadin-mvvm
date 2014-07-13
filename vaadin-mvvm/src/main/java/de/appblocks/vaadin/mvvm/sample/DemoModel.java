package de.appblocks.vaadin.mvvm.sample;

import java.io.Serializable;

public class DemoModel  implements Serializable{
	private String name;
	private String value;

	public DemoModel() {	}
	
	public DemoModel(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	
}
