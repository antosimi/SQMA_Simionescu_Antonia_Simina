package ism.ase.ro;

public class Dog {
	private String name;
	private Breed breed;
	private int age;
	
	
	public Dog() {
		super();
		this.name = "Unknown";
		this.breed = Breed.DEFAULT;
		this.age = -1;
	}
	
	
	public Dog( String name, Breed breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Breed getBreed() {
		return breed;
	}


	public void setBreed(Breed breed) {
		this.breed = breed;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	public int getAgeInHumanYears() {
		return 7 * this.age;
	}
	
	public boolean isPuppy() {
		
		boolean result = true;
		if((this.breed == Breed.CANICHE || this.breed== Breed.HUSKY) && this.getAgeInHumanYears() >18 ){
			
			result = false;
			System.out.println("Dog.isPuppy() result=="+result);
		}
		else if(this.breed == Breed.GOLDEN && this.getAgeInHumanYears() > 22 ) {
			result = false;
		}
		return result;
	}
	
	
	

}
