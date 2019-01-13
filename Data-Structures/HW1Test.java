package hw1;

public class HW1Test {
	private static int score = 0;
	
	private static String[] array1 = {
			"box",
			"vegetable",
			"stop",
			"door",
			"apple",
			"bookkeeper",
			"tiger",
			"banana",
			"chimpanzee",
			"television",
			"wireless",
			"dexterity",
			"division",
			"extra",
			"intoxicated",
			"fireproof",
			"daily",
			"extra",
			"very"
	};
	
	private static String[] array2 = {
			"box",
			"vegetable",
			"stop",
			"door",
			"apple",
			"bookkeeper",
			"tiger",
			"banana",
			"chimpanzee",
			"television",
			"wireless",
			"dexterity",
			"divison",
			"fireproof",
			"daily",
			"very",
			"stop"
	};
	
	private static String[] array3 = {
			"vegetable",
			"stop",
			"door",
			"apple",
			"tiger",
			"banana",
			"chimpanzee",
			"television",
			"wireless",
			"dexterity",
			"division",
			"fireproof",
			"daily",
			"very"
	};
	
	private static String[] array4 = {"yellow"};
	
	private static String[] array5 = {
			"box",
			"vegetable",
			"stop",
			"door",
			"apple",
			"bookkeeper",
			"tiger",
			"banana",
			"chimpanzee",
			"television",
			"wireless",
			"dexterity",
			"division",
			"extra",
			"intoxicated",
			"fireproof",
			"daily",
			"extra",
			"very"
	};
	
	private static String[] array6 = {
			"box",
			"vegetable",
			"stop",
			"door",
			"apple",
			"bookkeeper",
			"tiger",
			"banana",
			"chimpanzee",
			"television",
			"wireless",
			"dexterity",
			"division",
			"extra",
			"intoxicated",
			"fireproof",
			"daily",
			"extra",
			"very"
	};
	
	private static String[] array7 = {
			"box",
			"vegetable",
			"stop",
			"door",
			"apple",
			"bookkeeper",
			"tiger",
			"banana",
			"chimpanzee",
			"television",
			"wireless",
			"dexterity",
			"division",
			"extra",
			"intoxicated",
			"fireproof",
			"daily",
			"extra",
			"very"
	};

	
	public static void main(String[] args) {
		testCountBeginsWith();
		testLongest();
		testMin();
		testContainsDuplicate();
		testLeftmostOccurrence();
		System.out.printf("Score: %d%n", score);
	}
	
	private static void testCountBeginsWith() {
		int localScore = 0;
		if (HW1.countBeginsWith(array1, 'a') == 1)
			localScore += 1;
		if (HW1.countBeginsWith(array1, 'b') == 3)
			localScore += 1;
		if (HW1.countBeginsWith(array1, 'i') == 1)
			localScore += 1;
		if (HW1.countBeginsWith(array1, 'j') == 0)
			localScore += 1;
		if (HW1.countBeginsWith(array1, 'e') == 2)
			localScore += 1;
		
		if (HW1.countBeginsWith(array2, 'a') == 1)
			localScore += 1;
		if (HW1.countBeginsWith(array2, 'b') == 3)
			localScore += 1;
		if (HW1.countBeginsWith(array2, 'i') == 0)
			localScore += 1;
		if (HW1.countBeginsWith(array2, 'y') == 0)
			localScore += 1;
		if (HW1.countBeginsWith(array2, 'e') == 0)
			localScore += 1;
		
		if (HW1.countBeginsWith(array3, 'v') == 2)
			localScore += 1;
		if (HW1.countBeginsWith(array3, 'b') == 1)
			localScore += 1;
		if (HW1.countBeginsWith(array3, 'w') == 1)
			localScore += 1;
		if (HW1.countBeginsWith(array3, 'y') == 0)
			localScore += 1;
		if (HW1.countBeginsWith(array3, 't') == 2)
			localScore += 1;
		
		if (HW1.countBeginsWith(array4, 'v') == 0)
			localScore += 1;
		if (HW1.countBeginsWith(array4, 'b') == 0)
			localScore += 1;
		if (HW1.countBeginsWith(array4, 'w') == 0)
			localScore += 1;
		if (HW1.countBeginsWith(array4, 'y') == 1)
			localScore += 1;
		if (HW1.countBeginsWith(array4, 't') == 0)
			localScore += 1;
		
		System.out.printf("countBeginsWith: %d / 20%n", localScore);
		score += localScore;
	}
	
	private static void testLongest() {
		int localScore = 0;
		if (HW1.longest(array5).equals("intoxicated"))
			localScore += 2;
		replace(array5, "intoxicated", "laser");
		if (HW1.longest(array5).equals("bookkeeper"))
			localScore += 2;
		replace(array5, "bookkeeper", "book");
		if (HW1.longest(array5).equals("chimpanzee"))
			localScore += 2;
		replace(array5, "chimpanzee", "chimp");
		if (HW1.longest(array5).equals("television"))
			localScore += 2;
		replace(array5, "television", "tv");
		if (HW1.longest(array5).equals("vegetable"))
			localScore += 2;
		replace(array5, "vegetable", "fruit");
		if (HW1.longest(array5).equals("dexterity"))
			localScore += 2;
		replace(array5, "dexterity", "speed");
		if (HW1.longest(array5).equals("fireproof"))
			localScore += 2;
		replace(array5, "fireproof", "fire");
		if (HW1.longest(array5).equals("wireless"))
			localScore += 2;
		replace(array5, "wireless", "wire");
		if (HW1.longest(array5).equals("division"))
			localScore += 2;
		replace(array5, "box", "government");
		if (HW1.longest(array5).equals("government"))
			localScore += 2;
		
		System.out.printf("longest: %d / 20%n", localScore);
		score += localScore;
	}
	
	private static void testMin() {
		int localScore = 0;
		if (HW1.min(array6).equals("apple"))
			localScore += 2;
		replace(array6, "vegetable", "and");
		if (HW1.min(array6).equals("and"))
			localScore += 2;
		replace(array6, "and", "zoo");
		if (HW1.min(array6).equals("apple"))
			localScore += 2;
		replace(array6, "apple", "ax");
		if (HW1.min(array6).equals("ax"))
			localScore += 2;
		replace(array6, "ax", "tube");
		if (HW1.min(array6).equals("banana"))
			localScore += 2;
		replace(array6, "box", "car");
		if (HW1.min(array6).equals("banana"))
			localScore += 2;
		replace(array6, "banana", "sand");
		if (HW1.min(array6).equals("bookkeeper"))
			localScore += 2;
		replace(array6, "bookkeeper", "top");
		if (HW1.min(array6).equals("car"))
			localScore += 2;
		replace(array6, "car", "pop");
		if (HW1.min(array6).equals("chimpanzee"))
			localScore += 2;
		if (HW1.min(array4).equals("yellow"))
			localScore += 2;
		System.out.printf("min: %d / 20%n", localScore);
		score += localScore;
	}
	
	private static void testContainsDuplicate() {
		int localScore = 0;
		if (HW1.containsDuplicate(array7) == true)
			localScore += 4;
		replace(array7, "extra", "pop");
		if (HW1.containsDuplicate(array7) == false)
			localScore += 4;
		replace(array7, "television", "daily");
		if (HW1.containsDuplicate(array7) == true)
			localScore += 4;
		replace(array7, "daily", new String("very"));
		if (HW1.containsDuplicate(array7) == true)
			localScore += 4;
		if (HW1.containsDuplicate(array4) == false)
			localScore += 4;
		System.out.printf("containsDuplicate: %d / 20%n", localScore);
		score += localScore;
	}
	
	private static void testLeftmostOccurrence() {
		int localScore = 0;
		if(HW1.leftmostOccurrence(array1, 'a').equals("apple"))
			localScore += 2;
		if(HW1.leftmostOccurrence(array1, 'b').equals("box"))
			localScore += 2;
		if(HW1.leftmostOccurrence(array1, 'g').equals("vegetable"))
			localScore += 2;
		if(HW1.leftmostOccurrence(array1, 'l').equals("television"))
			localScore += 2;
		if(HW1.leftmostOccurrence(array1, 'n').equals("intoxicated"))
			localScore += 2;
		if(HW1.leftmostOccurrence(array1, 'p').equals("apple"))
			localScore += 2;
		if(HW1.leftmostOccurrence(array1, 'q').equals(""))
			localScore += 2;
		if(HW1.leftmostOccurrence(array1, 'r').equals("wireless"))
			localScore += 2;
		if(HW1.leftmostOccurrence(array4, 'w').equals("yellow"))
			localScore += 2;
		if(HW1.leftmostOccurrence(array4, 'a').equals(""))
			localScore += 2;
		System.out.printf("leftmostOccurrence: %d / 20%n", localScore);
		score += localScore;
	}
	
	private static void replace(String[] array, String oldString, String newString) {
		for(int i = 0; i < array.length; i++) {
			if (array[i].equals(oldString)) {
				array[i] = newString;
				return;
			}
		}
	}
}
