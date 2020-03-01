abstract class Pet{
	String name;
  String gender;
  String sound;
	
	Pet(String PetName, String PetGender, String PetSound){
		name = PetName;
    gender = PetGender;
    sound = PetSound;
	}

  public String toString(){
    String printString;
    printString= "Pet: " +name;
    return printString;
  }

  String getName(){
    return name;
  }
}