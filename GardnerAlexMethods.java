/* Directions:
 * 1. One or two days before we discuss a chapter in class, download this
 *    file (Methods.java), from I-Learn to your computer's hard drive.
 * 2. Answer all the questions in this file and save it.
 * 3. Rename the Java class and .java file to include your last name
 *    and first name.  For example, if my name were Rachelle Smith, I
 *    would rename the Java class below to SmithRachelleMethods
 *    and this file to SmithRachelleMethods.java
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
public class GardnerAlexMethods {  /* (16 points) */
	/* 1. (1 point) List one advantage of writing code inside a method
	 * instead of writing it outside of methods.
	 */
	String response1 = "the method can be reused by other programs";

	/* 2. (1 point) What is the very first line of a method called?
	 */
	String response2 = "method header";

	/* 3. (1 point) Consider the following method.  In the next four
	 * questions label the parts of its header. */
	public static double coneVolume(float radius, float height) {
		double volume = (Math.PI / 3.0) * radius * radius * height;
		return volume;
	}
	/* The keywords "public" and "static" are called what?
	 */
	String response3 = "modifiers";

	/* 4. (1 point) Within the previous method header the keyword "double"
	 * is called what?
	 */
	String response4 = "return value type";

	/* 5. (1 point) Within the previous method header the words
	 * "coneVolume" are called what?
	 */
	String response5 = "method name";

	/* 6. (1 point) Within the previous method header the part "(float
	 * radius, float height)" is called what?
	 */
	String response6 = "formal parameters";

	/* 7. (2 points) Practice calling a method by doing the following, all
	 * on a single line of code.
	 * 	a) declare a variable named vol of type double
	 * 	b) call the method coneVolume with 8 and 11 as the arguments for
	 * radius and height
	 * 	c) assign the value returned from the method to the variable vol
	 */
        double vol = coneVolume(8,11);
		
		

	/* 8. (1 point) What is the return type of main?
	 */
	String response8 = "void";

	/* 9. (3 points) Write a method named equation that has three
	 * parameters named x, y, and n, all of type double.  The method should
	 * compute and return the result of this expression:
	 * 
	 * 	         n
	 * 	3(xy + 5)
	 * 	---------
	 * 	 (y - 2)
	 */
	 public static double equation(double x, double y, double n){
		double result = (3 * Math.pow((x * y + 5), n)) / (y - 2);
		return result;
	 }

	/* 10. (2 points) Practice calling a method by doing the following, all
	 * on a single line of code.
	 * 	a) declare a variable named ez of type double
	 * 	b) call the method from the previous question with -5.1, 2.5,
	 * and 4 as the arguments for x, y, and n
	 * 	c) assign the value returned from the method to the variable ez
	 */
	 
	double ez = equation(-5.1, 2.5, 4);

	/* 11. (1 point) What is the name of the technique of writing two
	 * methods with the same name but with different parameter lists in a
	 * single class?
	 */
	String response11 = "overloading";

	/* 12. (1 point) What is the name of the built-in Java method to
	 * compute the square root of a number?
	 */
	String response12 = "Math.sqrt();";

}
