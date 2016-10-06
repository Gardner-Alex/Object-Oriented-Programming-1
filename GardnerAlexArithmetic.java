/* Directions:
 * 1. One or two days before we discuss a chapter in class, download this
 *    file (Arithmetic.java), from I-Learn to your computer's hard drive.
 * 2. Answer all the questions in this file and save it.
 * 3. Rename the Java class and .java file to include your last name
 *    and first name.  For example, if my name were Rachelle Smith, I
 *    would rename the Java class below to SmithRachelleArithmetic
 *    and this file to SmithRachelleArithmetic.java
 * 4. Compile your renamed .java file and make sure it compiles without
 *    any errors.
 * 5. Submit your renamed .java file by copying it to your shared folder
 *    within your DropBox folder before class begins on the day we will
 *    discuss the corresponding chapter.
 * 6. At the beginning of class, the teacher will run a grading program
 *    which will e-mail you a score for each question.
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
 *    on the first submission.
 */
 
public class GardnerAlexArithmetic {  /* (12 points) */
	/* 1. (1 point) List the four Java integer primitive variable types
	 * from smallest to largest separated by commas.
	 */
	String response1 = "byte, short, int, long";

	/* 2. (1 point) List the Java floating point primitive variable types
	 * from smallest to largest separated by commas.
	 */
	String response2 = "float, double";

	/* 3. (1 point) What is the value of result after the following Java
	 * statements execute?
	 * 	int a = 1, b = 3, c = 2;
	 * 	int result = a + b * c - 4;
	 */
	int response3 = 3;

	/* 4. (1 point) What is the value of result after the following Java
	 * statements execute?
	 * 	int a = 2, b = 5, c = 4, d = 3;
	 * 	int result = b + d / a * c;
	 */
	int response4 = 9;

	/* 5. (1 point) What is the value of result after the following Java
	 * statements execute?
	 * 	int a = 3, b = 1, c = 2, d = 5;
	 * 	int result = b + d % a * c;
	 */
	int response5 = 5;

	/* 6. (1 point) Here are four variable declarations and assignments. */
	double a = 2.3;
	double b = 5.01;
	double c = -3.9;
	double d = 6.4;
	/* Declare a variable named q and assign the result of the following
	 * algebraic expression to it.  Hint: don't use a calculator.
	 * 	                c(2 - a) - d
	 * 	q = 7(ab + 3) - ------------
	 * 	                   a + bd
	 */
	 double q = 7 * (a * b + 3) - ((c * (2 - a) - d) / (a + b * d));

	/* 7. (1 point) What is the value of i after the following Java
	 * statements execute?
	 * 	double d = 8.75;
	 * 	int i = (int)d;
	 */
	int response7 = 8;

	/* 8. (1 point) What is the value of d after the previous statements
	 * execute?
	 */
	double response8 = 8.75;

	/* 9. (1 point) What is the Java primitive type that stores a single
	 * unicode character?
	 */
	String response9 = "char";

	/* 10. (1 point) What is the Java type that stores a string of text
	 * characters?
	 */
	String response10 = "String";

	/* 11. (1 point) On a single line, write Java code to declare a
	 * variable named input of type String and assign the value
	 * "1.602176487" to it.
	 */
	String input = "1.602176487";

	/* 12. (1 point) On a single line, write Java code to convert (parse)
	 * the String from the previous question into a double and assign the
	 * converted double to a variable named charge.
	 */
	double charge = Double.parseDouble(input);

}
