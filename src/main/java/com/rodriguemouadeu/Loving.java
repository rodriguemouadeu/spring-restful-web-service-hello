package com.rodriguemouadeu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Loving {

    	private final String dateString;
	private final String content;

    public Loving(String content) {
	dateString = new SimpleDateFormat("yyyy/MM/dd").format(new Date());
        this.content = content;
    }

	public String getDateString(){
		return dateString;
	}

    public String getContent() {
        return content;
    }
}
