package controlflowstatement;
//parent class
public class PetAnimal {
	String name;
	public void eat()
	{
		System.out.println("I Am Eating");
		}
	public void sleep()
	{
		System.out.println("I Am Slepping");
		
		}
	public void nature()
	{
		System.out.println("I Am joyful");
		}
	public class  Cat extends PetAnimal{
		public void colour() {
			System.out.println("my color is dark black");
				
		}
		public static void main(String[]args) {
			Cat d= new Cat();
         	d.name="manu";
			d.colour();
			d.eat();
			d.sleep();
			d.nature();
		}
	}
	}

	

		