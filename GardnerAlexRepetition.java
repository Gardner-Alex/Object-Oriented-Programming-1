/* Directions:
 * 1. One or two days before we discuss a chapter in class, download this
 *    file (Repetition.java), from I-Learn to your computer's hard drive.
 * 2. Answer all the questions in this file and save it.
 * 3. Rename the Java class and .java file to include your last name
 *    and first name.  For example, if my name were Rachelle Smith, I
 *    would rename the Java class below to SmithRachelleRepetition
 *    and this file to SmithRachelleRepetition.java
 * 4. Compile your renamed .java file and make sure it compiles without
 *    any errors.
 * 5. Submit your renamed .java file by copying it to your shared folder
 *    within your DropBox folder before class begins on the day we will
 *    discuss the corresponding chapter.
 * 6. At the beginning of class, the teacher will run a grading program
 *    which will put a file containing your score in your shared folder
 *    in DropBox.
 * 7. During class, we will discuss the material in the chapter, the
 *    teacher will present and demonstrate some concepts, and we will
 *    write example programs together.
 * 8. If you missed any of the questions, correct them and resubmit them
 *    before we study the next chapter.
 * 9. The teacher will run the grading program again and enter your score
 *    in the grade book.  Your score in the grade book will be your later
 *    score or double your first score, whichever is less.  In other
 *    words, in order to earn a score of 100% in the grade book for a set
 *    of chapter questions, you must get at least half the questions right
 *    on the first grading.
 */
public class GardnerAlexRepetition {  /* (8 points) */
	/* 1. (1 point) List the three types of Java repetition statements
	 * separated by commas.
	 */
	String response1 = "while, do-while, for";

	/* 2. (1 point) What is the output of the following Java code?
	 * 	for (int i = 0;  i < 3;  i++) {
	 * 		System.out.print(i + " ");
	 * 	}
	 */
	String response2 = "0 1 2 ";

	/* 3. (1 point) Given the following Java code, how many times will
	 * "Hello" be printed?
	 * 	int i = 0;
	 * 	while (i < 25) {
	 * 		System.out.println("Hello");
	 * 	}
	 */
	String response3 = "forever";

	/* 4. (1 point) Given the following Java code, how many times will
	 * "Goodbye" be printed?
	 * 	for (int i = 0;  i > 3;  i++) {
	 * 		System.out.println("Goodbye");
	 * 	}
	 */
	int response4 = 0;

	/* 5. (4 points) Inside main write four loops in this order that print
	 * the following to the console:
	 * 	a. the integers from 0 to 50 inclusive, each on a separate
	 * 	   line
	 * 	b. the integers from -3 to -19 inclusive, separated by a
	 * 	   single space, all on the same line
	 * 	c. the integers 5, 7, 9, . . . 31 inclusive, separated by
	 * 	   a single space, all on the same line
	 * 	d. the integers 4, 1, -2, . . . -14 inclusive, separated by
	 * 	   a single space, all on the same line
	 * The output of parts b, c, and d must be on separate lines and there
	 * must be no blank or empty lines anywhere in the output.  In other
	 * words, the entire output must look like this:
	 * 0
	 * 1
	 * . . .
	 * 50
	 * -3 -4 -5 -6 -7 -8 -9 -10 -11 -12 -13 -14 -15 -16 -17 -18 -19 
	 * 5 7 9 11 13 15 17 19 21 23 25 27 29 31 
	 * 4 1 -2 -5 -8 -11 -14  */
	public static void main(String[] args) {
	for(int i = 0; i < 51; i ++ ){
			System.out.println(i);
		}
		
		for(int a = -3; a > -20; a -- ){
			System.out.print(a + " ");
		}
		System.out.println("");
		int x = 5;
		while(x < 32){
			System.out.print(x + " ");
			x += 2;
		}
		System.out.println("");
		int y = 4;
		while(y > -15){
			System.out.print(y + " ");
			y -= 3;
		}
	}


}
