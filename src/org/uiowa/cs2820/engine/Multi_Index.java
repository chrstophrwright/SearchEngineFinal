package org.uiowa.cs2820.engine;

import java.util.ArrayList;
import java.lang.String;
import java.nio.file.Files;
import org.apache.commons.io.FilenameUtils;

public class Multi_Index {
	
	public static Files[] folder;
	public static Database dirDatabase; //master database for all files in the directory
	
	
	public Files[] getTxtFiles(){
		ArrayList <Files> txtFiles;
		for (int i = 0; i< folder.length; i++){
			if (folder[i].getName().getExtension() == ".txt"){
				txtFiles.add(folder[i])
			};
		}
	}
	
	public boolean is(String filename){
		return filename.endsWith(suffix".txt");
	}
	
	public boolean isTxt(String filename){
		//ext = filename.reverse().slice(0,4);
		//if (ext == "txt.") return true;
		//else return false;
		return filename.getExtension();
	}
	

}
