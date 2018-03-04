package com.Test_project;

import java.util.ArrayList;

public class Info {

	ArrayList<RListDTO> readingList = null;

	public ArrayList<RListDTO> getReadingList() {
		return readingList;
	}

	public void setReadingList(ArrayList<RListDTO> readingList) {
		this.readingList = readingList;
	}

	public String execute() {

		readingList = FetchRList.show();
		int i = readingList.size();

		if (i > 0) {
			return "success";
		}
		return "error";

	}

}
