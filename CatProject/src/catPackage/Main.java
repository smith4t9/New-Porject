package catPackage;

public class Main {

	public static void main(String[] args) {
		// Declare and instantiate a Cat object called martha

		Cat martha = new Cat();
		martha.setColor("black"); // set color
		// use the getcolor to print out the  color of martha
		System.out.println(martha.getColor());
		
		Cat hungryMartha = new Cat();
		hungryMartha.setIsHungry(50);
		System.out.println(hungryMartha.getIsHungry());
		
		// make another cat and set the color and hungry
		
		
		Cat jaba = new Cat();
		jaba.setColor("Grey");
		System.out.println(jaba.getColor());
		Cat hungryJaba = new Cat();
		hungryJaba.setIsHungry(17);
		System.out.println(hungryJaba.getIsHungry());
	}

}
