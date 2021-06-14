package main;

import java.util.Scanner;

public class Converter {
	
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		boolean continuation = true;
		
		System.out.println("Welcome to the Unit Convert:");
		while(continuation) {

			displayMenu(0);
			choice = input(8);
			if (choice == 8) {
				System.out.println("Thank you for Using Converter");
				continuation =false;
				continue;
			}
			convert(choice);
		}
		
		in.close();
	}

	public static int input(int numberOfChoices) {
		int parse;
		do {
			try {
				parse = in.nextInt();
			}catch (Exception e) {
				System.out.println("Invalid input\nPlease input a number:");
				in.nextLine();
				parse = 0;
			}
			if(parse >numberOfChoices || parse < 0)
				System.out.println("Invalid Choice.\n Please select a number between 1 and " + numberOfChoices);
		}
		while(parse <= 0 || parse > numberOfChoices);			
		return parse;
	}
	
	public static double inputDouble(String Units) {
		double convert;
		System.out.println("Please enther the number of "+ Units +":");
		try {
			convert = in.nextDouble();
		}catch (Exception e) {
			System.out.println("Invalid input\nPlease input a number:");
			in.nextLine();
			convert = in.nextDouble();
		}		
		return convert;
	}

	//Displays to be given
	public static void displayMenu(int choice) {
		
		switch (choice) {
		case 0:
			System.out.println("1. Area");
			System.out.println("2. Energy");
			System.out.println("3. Mass");
			System.out.println("4. Pressure");
			System.out.println("5. Speed");
			System.out.println("6. Temperature");
			System.out.println("7. Volume");
			System.out.println("8. Quit");
			System.out.println("Please Select an option: ");
			break;
		case 1:
			System.out.println("Area Menu");
			System.out.println("1.  Square Foot to Square Meter ");
			System.out.println("2.  Square Foot to Square Yard ");
			System.out.println("3.  Square Foot to Square Inch ");
			System.out.println("4.  Square Yard to Square Meter ");
			System.out.println("5.  Square Yard to Square Foot ");
			System.out.println("6.  Square Yard to Square Inch ");
			System.out.println("7.  Hectare to Square Kilometer ");
			System.out.println("8.  Hectare to Square Meter ");
			System.out.println("9.  Hectare to Square Mile ");
			System.out.println("10. Hectare to Square Yard ");
			break;
		case 2:
			System.out.println("Energy Menu");
			System.out.println("1.  Joule to Gram Calorie ");
			System.out.println("2.  Joule to Watt Hour ");
			System.out.println("3.  Joule to Foot-Pound ");
			System.out.println("4.  Gram Calorie to Joule ");
			System.out.println("5.  Gram Calorie to Foot Pound ");
			System.out.println("6.  Watt Hour to Joule ");
			System.out.println("7.  Watt Hour to Gram Calorie ");
			System.out.println("8.  Watt Hour to Foot-Pound ");
			System.out.println("9.  Foot-Pound to Joule ");
			System.out.println("10. Foot-Pound to Gram Calorie ");
			break;
		case 3:
			System.out.println("Mass Menu");
			System.out.println("1.  Metric Ton to Kilogram ");
			System.out.println("2.  Metric Ton to Imperial Ton ");
			System.out.println("3.  Metric Ton to US Ton ");
			System.out.println("4.  Metric Ton to Stone ");
			System.out.println("5.  Metric Ton to Pound ");
			System.out.println("6.  Metric Ton to Ounce ");
			System.out.println("7.  Kilogram to Metric Ton ");
			System.out.println("8.  Kilogram to Imperial Ton ");
			System.out.println("9.  kilogram to US Ton ");
			System.out.println("10. Kilogram to Stone ");
			break;
		case 4:
			System.out.println("Pressure Menu");
			System.out.println("1.  Bar to Pascal ");
			System.out.println("2.  Bar to Pound-Force per Square Inch ");
			System.out.println("3.  Bar to Standard Atmosphere ");
			System.out.println("4.  Bar to Torr ");
			System.out.println("5.  Pascal to Torr ");
			System.out.println("6.  Pound-Force per Square Inch to Bar ");
			System.out.println("7.  Pound-Force per Square Inch to Pascal ");
			System.out.println("8.  Pound-Force per Square Inch to Standard Atmosphere ");
			System.out.println("9 . Pound-Force per Square Inch to Torr ");
			System.out.println("10. Standard Atmosphere to Bar ");
			break;
		case 5:
			System.out.println("Speed Menu");
			System.out.println("1.  Miles per Hour to Foot per Second ");
			System.out.println("2.  Miles per Hour to Meters per Second ");
			System.out.println("3.  Miles per Hour to Kilometer per Hour ");
			System.out.println("4.  Miles per Hour to Knot ");
			System.out.println("5.  Feet per Second to Miles per Hour ");
			System.out.println("6.  Feet per Second to Meter per Second ");
			System.out.println("7.  Feet per Second to Kilometer per Hour ");
			System.out.println("8.  Feet per Second to Knot ");
			System.out.println("9.  Meters per Second to Miles per Hour ");
			System.out.println("10. Meters per Second to Feet per Second ");
			break;
		case 6:
			System.out.println("Length Menu");
			System.out.println("1.  Kilometers to Miles ");
			System.out.println("2.  Kilometers to Yards ");
			System.out.println("3.  Kilometers to Feet ");
			System.out.println("4.  Kilometers to Inches ");
			System.out.println("5.  Kilometers to Nautical Mile ");
			System.out.println("6.  Miles to Kilometer ");
			System.out.println("7.  Miles to Yards");
			System.out.println("8.  Miles to Feet");
			System.out.println("9.  Miles to Nautical Miles");
			System.out.println("10. Nautical Miles to Kilometers");
			break;
		case 7:
			System.out.println("Volume Menu");
			System.out.println("1.  Cup to Gallon ");
			System.out.println("2.  Cup to Quart ");
			System.out.println("3.  Cup to Pint ");
			System.out.println("4.  Cup to Ounces ");
			System.out.println("5.  Cup to Tablespoon ");
			System.out.println("6.  Cup to Teaspoon ");
			System.out.println("7.  Cup to Liter ");
			System.out.println("8.  Liter to Cups ");
			System.out.println("9.  Liter to Gallon");
			System.out.println("10. Liter to Pint ");
			break;
		case 8:
			break;
		default :
						
		}
	}
	
	public static void convert(int table) {
		//Conversion Matrix
		String[][][] conversions = {{{"Square Foot", "Square Meter", "0.0929"},{"Square Foot", "Square Yard", ".11111"},
									{"Square Foot", "Square Inch", "144"}, {"Square Yard", "Square Meter", ".836127"},
									{"Square Yard", "Square Foot", "9"}, {"Square Yard", "Square Inch", "1296"},
									{"Hectare", "Square Kilometer", ".01" }, {"Hectare", "Square Meter", "10000"}, 
									{"Hectare", "Square Mile", ".00386102"}, {"Hectare", "Square Yard", "11959.9"}},
									{{"Joule", "Gram Calorie",".239006"}, {"Joule", "Watt Hour", ".000277778"},
									{"Joule", "Foot-Pound",".737562"}, {"Gram Calorie", "Joule","4.184"},
									{"Gram Calorie", "Foot-Pound","3.08596"}, {"Watt Hour", "Joule", "3600"},
									{"Watt Hour", "Gram Calorie","860.421"}, {"Watt", "Foot-Pound","2655.22" },
									{"Foot-Pound", "Joule", "1.35582"}, {"Foot-Pound", "Gram Calorie",".324048" }},
									{{"Metric Ton", "Kilogram", "1000"}, {"Metric Ton", "Imperial Ton", ".984207"},
									{"Metric Ton", "US Ton","1.10231"}, {"Metric Ton", "Stone", "157.473"},
									{"Metric Ton", "Pound", "2204.62"}, {"Metric Ton", "Ounce", "35274"},
									{"Kilogram", "Metric Ton", ".001"}, {"Kilogram", "Imperial Ton", ".000984207"},
									{"Kilogram", "US Ton", ".00110231"}, {"Kilogram", "Stone", ".157473"}},
									{{"Bar", "Pascal", "100000"}, {"Bar", "Pound-Force per Square Ince","14.5038"},
									{"Bar", "Standard Atmosphere",".986956"}, {"Bar", "Torr","750.062"},
									{"Pascal", "Tor", ".00750062"}, {"Pound-Force per Square Inch", "Bar", ".0689476"},
									{"Pound-Force per Square Inch", "Pascal", "6894.76"}, {"Pound-Force per Square Inch", "Standard Atmosphere",".0686046"},
									{"Pound-Force per Square Inch", "Torr", "51.7149"}, {"Standard Atmosphere", "Bar", "1.01325" }},
									{{"Miles per Hour", "Feet per Second", "1.4667"}, {"Miles per Hour", "Meters per Second",".44704"},
									{"Miles per Hour", "Kilometer per Hour","1.60934"}, {"Miles per Hour", "Know", ".868976"},
									{"Feet per Second", "Miles per Hour", ".681818"}, {"Feet per Second", "Meters per Second", ".3048"},
									{"Feet per Second", "Kilometer per Hour", "1.09728"}, {"Feet per Second","Knot",".592484"},
									{"Meters per Second", "Miles per Hour", "2.23694"}, {"Meters per Second", "Feet per Second", "3.28084"}},
									{{"Kilometer", "Mile", ".621371"}, {"Kilometer", "Yard", "1093.61"},
									{"Kilometer", "Feet", "3280.84"}, {"Kilometer", "Inch" , "39370.1"},
									{"Kilometer", "Nautical Miles", ".539957"},{"Mile", "Kilometer","1.60934"},
									{"Mile","Yards", "1760"},{"Miles","Feet", "5280"}, 
									{"Miles","Nautical Miles", ".868976"}, {"Nautical Miles", "Kilometers", "1.852"}},
									{{"Cups", "Gallons", ".0625"}, {"Cups", "Quarts",".25"}, {"Cups", "Pints", ".5"},
									{"Cups", "Ounces","8"}, {"Cup", "Tablespoon", "16"}, {"Cups", "Teaspoon","48"},
									{"Cups", "Liters",".236588"},{"Liters", "Cups","4.22675"}, {"Liters", "Gallons",".264172"},
									{"Liters","Pints", "2.11338"}}};
		int choice, limiter = 10;
		double quantity;
		//Grabbing the appropriate units
		displayMenu(table);
		String firstUnits, secondUnits, ratio;
		System.out.println("Please enter a choice: ");
		choice = input(limiter);
		firstUnits = conversions[table-1][choice-1][0];
		secondUnits = conversions[table-1][choice-1][1];
		ratio = conversions[table-1][choice-1][2];
		
		//grabbing the the quantity of what is to be converted and displaying
		quantity = inputDouble(firstUnits);
		Display(firstUnits, secondUnits, ratio, quantity);
	}
	
	public static void Display(String first, String second, String conv, double quantity) {
		double answer = quantity * Double.parseDouble(conv);
		System.out.println(quantity + " "+ first +" equals "+ answer + " " + second);
	}
}
