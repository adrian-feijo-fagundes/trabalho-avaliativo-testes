package org.example;

public class GradeEvaluator {
    public static String eval(Student student) {

        int grade = student.getGrade();

        if (grade > 100) throw new RuntimeException("Número maior que o permitido");
        if (grade < 0) throw new RuntimeException("Número menor que o permitido");

        if (grade >= 90) return "Excelente";
        if (grade >= 75) return "Bom";
        if (grade >= 50) return "Regular";
        if (grade >= 30) return "Insuficiente";

        return "Reprovado";
    }
}
