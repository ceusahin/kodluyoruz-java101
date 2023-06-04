package com.practices.OBS;

public class OBS {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut hoca", "1111", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "2222", "FZK");
        Teacher t3 = new Teacher("Albert Einstein", "3333", "MAT");

        Course tarih = new Course("Tarih", "101", "TRH");
        Course fizik = new Course("Fizik", "102", "FZK");
        Course mat = new Course("Matematik", "103", "MAT");

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        mat.addTeacher(t3);

        Student s1 = new Student("Hakan", "001", "9", tarih, fizik, mat);
        s1.addBlukExamNote(100, 88, 50, 50, 70, 95);
        s1.isPass();

        System.out.println("=======================");

        Student s2 = new Student("Mahmut", "002", "9", tarih, fizik, mat);
        s2.addBlukExamNote(85, 85, 100, 98, 88, 70);
        s2.isPass();


    }
}
