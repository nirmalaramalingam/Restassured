package dataDriven;

import java.io.IOException;
import java.util.ArrayList;

public class testSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		dataDrivenRead d = new dataDrivenRead();
		ArrayList<String> data = d.getData("Add Profile");
		System.out.println(data.get(0));
	}

}
