class Student extends Person{
	private int[] testScores;
	
	
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
	Student(String firstName, String lastName, int id, int[] scores){
		super(firstName,lastName,id);
		testScores = scores;
	}
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
	char calculate() {
		int sum = 0;
		int average;
		for(int i = 0; i < testScores.length;i++) {
			sum += testScores[i];
		}
		average = sum / testScores.length;
		if(average >= 90)
			return 'O';
		else if(average >= 80)
			return 'E';
		else if(average >= 70)
			return 'A';
		else if(average >= 55)
			return 'P';
		else if(average >= 40)
			return 'D';
		
		return 'T';	
	}
}