package finalProjectCYOA;
import java.util.*;

public class CYOAClass {
 private String name;
 private String type;
 private String firstAct;
 private int secondAct;
 private int thirdAct;
 private int fourthAct;

 

 public CYOAClass(String name, String type, String firstAct, int secondAct, int thirdAct, int fourthAct) {
	 this.name = name;
	 this.type = type;
	 this.firstAct = firstAct;
	 this.secondAct = secondAct;
	 this.thirdAct = thirdAct;
	 this.fourthAct = fourthAct;
 }
 
 public CYOAClass(String name, String type, String firstAct, int secondAct, int thirdAct) {
	 this.name = name;
	 this.type = type;
	 this.firstAct = firstAct;
	 this.secondAct = secondAct;
	 this.thirdAct = thirdAct;
 }
 
 public CYOAClass(String name, String type, String firstAct, int secondAct) {
	 this.name = name;
	 this.type = type;
	 this.firstAct = firstAct;
	 this.secondAct = secondAct;
 }
 
 public CYOAClass(String name, String type, String firstAct) {
	 this.name = name;
	 this.type = type;
	 this.firstAct = firstAct;
 }
 
 
 public String getName() {
	 return name;
 }
 
 public String getType() {
	 return type;
 }
 
 
 public String getFirstAct() {
	return firstAct;
 }
 
 public String firstAct() {
	 if(getFirstAct().equals("left")) {
		return "You lived!" + '\n'; 
	 } 
	 else if(getFirstAct().equals("right")) {
		return "You trip over a rock!" + '\n';
	 } else {
		 return "You fall in a pit of lava!" + '\n';
	 }
}
 
public boolean firstDeath() {
	if(getFirstAct().equals("right") || getFirstAct().equals("forward")) {
		return false;
	} else {
		return true;
	}
}

 public int getSecondAct() {	
	return secondAct;
 }
 
 public String secondAct() {
	if(getSecondAct() == 1 && getType().equals("samurai")) {
		return "The dragon eats you!";
	}
	else if(getSecondAct() == 1 && getType().equals("knight")) {
		return "You lived!" + '\n';
	}
	else if(getSecondAct() == 2 && getType().equals("samurai")) {
		return "You lived!" + '\n';
	} else {
		return "The dragon eats you!";
	}
 }
 
 public boolean secondDeath() {
	if(secondAct().equals("The dragon eats you!")) {
		return false;
	} else {
		return true;
	}
 }
 
 public int getThirdAct() {
	return thirdAct;
 }
 
 public String thirdAct(){
	if (getThirdAct() == 1) {
		return "God strikes you with lightning!";
	} else {
		return "You head over to the castle!" + '\n';
	}
 }
 
 public boolean thirdDeath() {
	if(getThirdAct() == 1) {
		return false;
	} else {
		return true;
	}
}
 
 public int getFourthAct() {
	return fourthAct;
 }
 
 public String fourthAct() {
	 if(getFourthAct() == 1) {
		 return "You fall to your death";
	 }
	 else if(getFourthAct() == 2) {
		 return "A guard catches you!";
	 } 
	 else if (getFourthAct() == 4) {
		 return "You get shot with an arrow!";
	 } else {
		 return "You get the princess!";
	 }
 }
 
 public boolean fourthDeath() {
	if(getFourthAct() == 1 || getFourthAct() == 2 || getFourthAct() == 4) {
		return false;
	} else {
		return true;
	}
 }
 

 // ended up not using but proud of it
 public boolean error(int num, int questionNum) {
	 int[] questionList = new int[questionNum];
	 for(int i = 0; i < questionList.length; i++) {
		 questionList[i] = i + 1;
		 if(!(num == questionList[i])) {
			 return false;
		 }
	 }
	 		return true;
 }
 
 

 

 

 
}
