package com.assignment12;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment12Stream {

    public static void main(String[] args) {
        List<Student> studentList = List.of(
        new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8),
        new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2),
       new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3),
        new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80),
       new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70),
       new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70),
       new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70),
        new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80),
        new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85),
       new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82),
        new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83),
        new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4),
        new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6),
        new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8),
        new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4),
        new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4),
        new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        studentList.stream()
                .map(obj -> obj.getEngDepartment())
                .distinct()
                .forEach(System.out::println);

        seperationLine();

        studentList.stream()
                .filter(obj -> obj.getYearOfEnrollment() > 2018)
                .forEach(obj -> System.out.println(obj.getName()));

        seperationLine();

        studentList.stream()
                .filter(obj -> obj.getGender().equalsIgnoreCase("male") && obj.getEngDepartment()
                        .equalsIgnoreCase("Computer Science"))
                .forEach(System.out::println);


        seperationLine();

        var maleFemaleCount = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));

        System.out.println(maleFemaleCount);

        seperationLine();

//        var averageAgeSummary = studentList.stream()
//                .mapToInt(Student::getAge)
//                .summaryStatistics();
//        System.out.println(averageAgeSummary.getSum()/averageAgeSummary.getCount());

        var averageAgeSummary = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));

        System.out.println(averageAgeSummary);


        seperationLine();

        var maxPercentage = studentList.stream()
                .max(Comparator.comparing(Student::getPerTillDate));
        System.out.println(maxPercentage);

        System.out.println("------------------------------");

        var maxPercentage2 = studentList.stream()
                .mapToDouble(Student::getPerTillDate)
                .summaryStatistics();
        System.out.println(maxPercentage2.getMax());


        seperationLine();

        var studentsCountBasedOnDepartments =
                studentList.stream()
                        .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting()));

        System.out.println(studentsCountBasedOnDepartments);

        seperationLine();

        var averagePercentageOfEachDepartments =
                studentList.stream()
                        .collect(Collectors.groupingBy(Student::getEngDepartment,
                                Collectors.averagingDouble(Student::getPerTillDate)));

        System.out.println(averagePercentageOfEachDepartments);

        seperationLine();

        var youngestElectronicStudent =
                studentList.stream()
                        .filter(obj -> obj.getEngDepartment().equalsIgnoreCase("Electronic"))
                        .collect(Collectors.minBy(Comparator.comparing(Student::getAge)));
        System.out.println(youngestElectronicStudent);


        seperationLine();

        var maleFemaleInCS =
                studentList.stream()
                        .filter(obj -> obj.getEngDepartment().equalsIgnoreCase("Computer Science"))
                        .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println(maleFemaleInCS);


        seperationLine();


    }

    private static void seperationLine() {
        System.out.println("==========================================");
    }
}
