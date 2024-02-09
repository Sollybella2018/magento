import java.util.Random;

public class parameters {

	
	Random rand= new Random();
	String[] FirstNames = {"Aseel","Amal","Bob","Alice","Sara","Nora","Bella","Bana","Nasra","Reem"};
	String [] LastNames = {"khalid","Nizar","Haitham","Nader","salim","Omar","Sami","Naser","Mamon","Nathem"};
	String CommonPassword = "Asel99@@";
	int randomIndex = rand.nextInt(10);
	int randomEmailId=rand.nextInt(9999);
	String emailId = FirstNames[randomIndex]+LastNames[randomIndex]+"@"+"gmail.com";

}

