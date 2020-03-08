package com.company;

public class Main {
    public void  main(String[] args) {

        Student nunnin = new Student();

        nunnin.name= "Tichaporn  Leedee";
        nunnin.id= "623410005-4";
        nunnin.major= "CIS";

        System.out.println("1."+ nunnin.name +" "+ nunnin.major);

        Student[] oopStudents = {nunnin,};

        System.out.println("1."+oopStudents[0].name);

        find_CIS_student(oopStudents);
    }

    private void find_CIS_student(Student[] oopStudents) {
    }

    public void  find_CIS_Student(Student[] students){
        for(int i = 0; i < students.length; i++){
            // check student.major is "CIS"
            if (students[i].major.equals("CIS")){
                System.out.println(i+1 + ". "+ students[i].name);
            }
        }

    }

}
