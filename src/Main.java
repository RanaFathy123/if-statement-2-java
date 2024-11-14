//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   /*  1 Write a program that takes the user's age as input and outputs whether they
        are a child (below 13, a teenager 13 to 19, an adult 20 to 59, or a senior 60
          and above).

          1- input : age
          2-validate age input
          3- check if age < 13 is child else if age >=13 and age <=19 is teenager else if age <=20 and age <=59 is
          adult else is senior
          4- print age category

      */

        int age = 12;
        if(age == 0 || age < 0){
            System.out.println("Please Write Avalid Age");
            return;
        }
        if(age < 13)
            System.out.println("Child");
        else if (age >=13 && age <= 19) {
            System.out.println("teenager");
        } else if (age <= 20 && age <= 59) {
            System.out.println("Adult");

        }else
            System.out.println("Senior");

/*     2 Write a program that takes the marks of a student as input and prints their
        grade according to the following criteria: 'A' for marks >= 90, 'B' for 8089, 'C'
        for 7079, 'D' for 6069, and 'F' for marks  60.
        1- input : studentMarks
        2- check grade of student according to marks
        3- print grade
        */

        int studentMarks = 90;
        if(studentMarks >= 90){
            System.out.println("A");
        } else if (studentMarks >=80 && studentMarks <= 89) {
            System.out.println("B");
        } else if (studentMarks >=70 && studentMarks <= 79) {
            System.out.println("C");
        } else if (studentMarks >=60 && studentMarks<= 69) {
            System.out.println("D");
        }else
            System.out.println("F");

 /*     3 Write a program to determine if a person is eligible to vote based on their
        age >=18 and citizenship status (must be a citizen).
        1- input : citizen age and citizen status
        2-check age >=18 and citizen status is citizen
        3- print this person eligible or not
        */

        int citizenAge = 15;
        String citizenStatus = "citizen";
        if(citizenAge >= 18 && citizenStatus == "citizen")
            System.out.println("this person eligible to vote");
        else
            System.out.println("this person not eligible to vote");

    }
}