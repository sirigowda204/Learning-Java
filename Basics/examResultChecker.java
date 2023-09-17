/**
 * The isPass(int marks) method should take an integer value representing the marks obtained by a student in an exam 
 * and determine whether the student has passed or failed the exam. In this case, a student is considered to have passed 
 * the exam if they have scored more than 50 marks. If the student's marks are 50 or less, 
 * they are considered to have failed.
 */

public class ExamResult {
    
    public boolean isPass(int marks) {
        
        // Update Code : If the student's marks are greater than 50, they have passed the exam.
        if (marks>50){
            return true;
        }
    
        return false;
    }
}