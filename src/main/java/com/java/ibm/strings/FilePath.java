package com.java.ibm.strings;

// /Users/ionut/workspace/code_samples/log4jdbc/scripts/build.xml
public class FilePath {
	
	private char separator;
	private String path; // -->  /Users/ionut/workspace/code_samples/log4jdbc/scripts/build.xml
	private String root;
	
	public FilePath(char separator, String path, String root) {
		this.separator = separator;
		this.path = path;
		this.root = root;
	}
	
	//filename
	//extensia
	//pwd
	
	public static void main(String[] args) {
		FilePath macPath = new FilePath('/', "/Users/ionut/workspace/code_samples/log4jdbc/scripts/build.xml", "");
		System.out.println("macPath.filename() = " + macPath.filename());
		System.out.println("macPath.extension() = " + macPath.extension());
		System.out.println("macPath.currentFolder() = " + macPath.currentFolder());
	}
	
	public String filename() { //  build.xml
		return extractSubstringFromCharacter(separator);
	}
	
	private String extractSubstringFromCharacter(char from) {
		int lastIndexOfSeparator = path.lastIndexOf(from);
		return path.substring(lastIndexOfSeparator + 1);
	}
	
	public String extension() {
		return extractSubstringFromCharacter('.');
	}
	
	public String currentFolder() { // /Users/ionut/workspace/code_samples/log4jdbc/scripts/
		int lastIndexOfSeparator = path.lastIndexOf(separator); // path.indexOf()
		return path.substring(0, lastIndexOfSeparator);
	}
}
