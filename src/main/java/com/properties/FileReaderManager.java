package com.properties;

public class FileReaderManager {

	private FileReaderManager() {

	}

	public static FileReaderManager get_F_R_M() {

		FileReaderManager frm = new FileReaderManager();
		
		return frm;

	}

	public Configuration_Reader confiReader() {

		Configuration_Reader cr = new Configuration_Reader();

		return cr;
	}

}
