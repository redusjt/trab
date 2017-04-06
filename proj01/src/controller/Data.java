package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	public String getData() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dt = new Date();
		return df.format(dt);
	}

}
