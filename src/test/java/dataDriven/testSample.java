package dataDriven;

import java.io.IOException;
import java.util.ArrayList;

public class testSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		dataDrivenRead d = new dataDrivenRead();
		ArrayList<String> data = d.getData("Add Profile");
		System.out.println(data.get(0));
		
		System.out.println("added comment to check for git");
		System.out.println("line1");
		System.out.println("line2");
		//new lines added
		System.out.println("line8");
		System.out.println("Line9");
		System.out.println("Line 10");
		//new branch created in git repo
		System.out.println("Added new branch develop");
		System.out.println("Working on new branch - develop");
		
		//second time add to new branch
		System.out.println("Added code to new branch");
	}

}
