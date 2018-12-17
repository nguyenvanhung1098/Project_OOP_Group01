package createdata;

import java.util.Random;
import java.util.Vector;

public class CreateData {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	// Tao quan he nguoi voi nguoi
	Random rd = new Random();
	@SuppressWarnings("rawtypes")
	Vector v = new Vector();
    int iNew = 0 ;
    for (int i = 0; i < 10;  ) {
        iNew = rd.nextInt(100);
        if (!v.contains(iNew)){
            i++;
            v.add(iNew);
            System.out.println("Item " + (i+1) + ":" + iNew);
        }
    }
	
	
}
}
