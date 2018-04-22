/**
 @Title: Coin
 @Purpose: To get familiar with UML class diagrams
 @Author: Zamzow, Avery
 @Date: 3/10/15
 @Version: 1.0
 */

import java.util.Scanner;
import java.util.Random;

public class Coin {

	private String sideUp;

	public Coin(){
	    toss();
	}

	public void toss(){
	    Random myRand = new Random();
	    int face = myRand.nextInt(2);
	    if(face == 0){
	        sideUp = "Heads";
	    }
	    else{
	        sideUp = "Tails";
	    }
	    //System.out.println(getSideUp());
	}
	public String getSideUp(){
		
	    return sideUp;
	}
}
