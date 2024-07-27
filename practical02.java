import java.util.Scanner;

public class Studentmarks{
     
     private static final int num_subjects = 3;
     private static final int maths = 1;
     private static final int physics = 2;
     private static final int chemistry =3;

     private static int[][] marks;
     private static int num_of_students;

     //Student ID's Start from 1 and increase 

     public static void main(String args[]){
        
        Scanner mykeyboard = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        num_of_students = mykeyboard.nextInt();
        marks = new int[num_of_students][num_subjects];

        while(true){
            System.out.println("\n");
            System.out.println("1.Add Marks");
            System.out.println("2.Update Marks");
            System.out.println("3.Get the average marks of a student");
            System.out.println("4.Get the average marks of a subject");
            System.out.println("5.Get the total marks of a student");
            System.out.println("6.Exit");
            System.out.print("Enter your command: ");
            int command = mykeyboard.nextInt();
            System.out.println("\n"); 

            switch(command){

                case 1:
                    System.out.print("Enter the student ID: ");
                    int student_id = mykeyboard.nextInt();
                    Add_marks(student_id, mykeyboard);
                    break;
                
                case 2:
                    System.out.print("Enter the student ID: ");
                    student_id = mykeyboard.nextInt();
                    System.out.print("Enter Subject ID(1 - Maths, 2- Physics, 3 - Chemistry): ");
                    int subject_ID = mykeyboard.nextInt();
                    update_marks(student_id, subject_ID, mykeyboard);
                    break;

                case 3:
                    System.out.print("Enter the student ID: ");
                    student_id = mykeyboard.nextInt();
                    STD_avg(student_id);
                    break;

                case 4:
                  System.out.print("Enter the Subject ID(1 - Maths, 2 - Physics, 3 - Chemistry): ");    
                  subject_ID = mykeyboard.nextInt();
                  sub_avg(subject_ID, num_of_students);
                  break;

                case 5:
                  System.out.print("Enter the student ID: ");
                  student_id = mykeyboard.nextInt();  
                  calc_total(student_id, num_subjects);
                  break;

                default:
                  break;

        }
     }

   }


   private static void Add_marks(int student_id, Scanner mykeyboard){

      if(valid_ID(student_id)){
        System.out.print("Enter marks For Maths: ");
        marks[student_id - 1][maths-1] = mykeyboard.nextInt();
        System.out.print("Enter marks for Physics: ");
        marks[student_id - 1][physics-1] = mykeyboard.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        marks[student_id - 1][chemistry-1] = mykeyboard.nextInt();
      }
      else {
        System.out.println("Invalid Student ID");
      }
   }

   private static void update_marks(int student_id, int subject_ID, Scanner mykeyboard){
     
      if(valid_ID(student_id) && valid_subject_ID(subject_ID)){
        System.out.print("Enter the new marks: ");
        marks[student_id - 1][subject_ID-1] = mykeyboard.nextInt();
        int updated_marks = marks[student_id - 1][subject_ID-1];
        System.out.printf("Sudent %d's marks for %d updated to %d ", student_id, subject_ID, updated_marks);
      }else{
        System.out.println("Invalid Student ID or Sunject ID");
      }
   }

   private static void STD_avg(int student_id){

     if(valid_ID(student_id)){
        int total = 0; 
        for(int i = 0; i < num_subjects; i++){
            total += marks[student_id - 1][i];
        }
        double  avg = total/num_subjects;
        System.out.printf("The average mark of %d is %.2f\n", student_id, avg);
     }else{
        System.out.println("Invalid Student ID");
     }
       
   } 

   private static void sub_avg(int subject_ID, int num_of_students){

    if(valid_subject_ID(subject_ID)){
      int total = 0;
      for(int i = 0; i < num_of_students; i++){
          total += marks[i][subject_ID-1];
      }
      double AVG = total/num_of_students;
      System.out.printf("The average marks of this subject is %.2f\n", AVG);
    }else{
      System.out.println("Invalid Subject ID");
    }

   }

   private static void calc_total(int student_id, int num_subjects){

      if(valid_ID(student_id)){
        int total = 0;
        for(int i = 0; i <  num_subjects; i++){
            total += marks[student_id - 1][i];
        }
        System.out.printf("Total mark is %d ", total);
      }else{
        System.out.println("Invalid Student ID");
      }

   }
    
   private static boolean valid_ID(int student_id){
    return student_id > 0 && student_id <= num_of_students;
   }

   private static boolean valid_subject_ID(int subject_ID){
    return subject_ID > 0 && subject_ID <= num_subjects;
   }



}



