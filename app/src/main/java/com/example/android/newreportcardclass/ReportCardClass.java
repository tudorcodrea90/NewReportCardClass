package com.example.android.newreportcardclass;

import java.util.ArrayList;

public class ReportCardClass {

        /** ArrayList storing values */
        private ArrayList<Double> Grades = new ArrayList<Double>();

        /** ArrayList storing subjects */
        private ArrayList<String> Subjects = new ArrayList<String>();

        /** Final grade */
        private double FinalGrade;

        /** String with all grades */
        private String allGrades;

        /**
         * Create a new ReportCard object.
         *
         * @param mathsGrade is the grade for Maths
         * @param historyGrade is the grade for History
         * @param geographyGrade is the grade for Geography
         * @param physicsGrade is the grade for Physics
         * @param englishGrade is the grade for English
         * @param latinGrade is the grade for Latin
         */

        public ReportCardClass(double mathsGrade, double historyGrade, double geographyGrade, double
        physicsGrade, double englishGrade, double latinGrade) {

            Subjects.add(0, "Maths");
            Subjects.add(1, "History");
            Subjects.add(2, "Geography");
            Subjects.add(3, "Physics");
            Subjects.add(4, "English");
            Subjects.add(5, "Latin");

            Grades.add(0, mathsGrade);
            Grades.add(1, historyGrade);
            Grades.add(2, geographyGrade);
            Grades.add(3, physicsGrade);
            Grades.add(4, englishGrade);
            Grades.add(5, latinGrade);
        }


        /** Set the grade for Maths */
    public void setMathsGrade(double grade) {
        Grades.set(0, grade);
    }

    /** Set the grade for History */
    public void setHistoryGrade(double grade) {
        Grades.set(1, grade);
    }

    /** Set the grade for Geography */
    public void setGeographyGrade(double grade) {
        Grades.set(2, grade);
    }

    /** Set the grade for Physics */
    public void setPhysicsGrade(double grade) {
        Grades.set(3, grade);
    }

    /** Set the grade for English */
    public void setEnglishGrade(double grade) {
        Grades.set(4, grade);
    }

    /** Set the grade for Latin */
    public void setLatinGrade(double grade) {
        Grades.set(5, grade);
    }

    /** Get the grade for Maths */
    public double getMathsGrade() {
        double grade = Grades.get(0);
        return grade;
    }

    /** Get the grade for History */
    public double getHistoryGrade() {
        double grade = Grades.get(1);
        return grade;
    }

    /** Get the grade for Geography */
    public double getGeographyGrade() {
        double grade = Grades.get(2);
        return grade;
    }

    /** Get the grade for Physics */
    public double getPhysicsGrade() {
        double grade = Grades.get(3);
        return grade;
    }

    /** Get the grade for English */
    public double getEnglishGrade() {
        double grade = Grades.get(4);
        return grade;
    }

    /** Get the grade for Latin */
    public double getLatinGrade() {
        double grade = Grades.get(5);
        return grade;
    }

    /** Get the final grade by calculating it */
    public double getFinalGrade() {
        FinalGrade = 0.0;
        for (int i = 0; i < Grades.size(); i++){
            double grade = Grades.get(i);
            FinalGrade = FinalGrade + grade;
        }
        FinalGrade = FinalGrade / Grades.size();
        return FinalGrade;
    }

    @Override
    public String toString() {
        allGrades = "";
        for (int i = 0; i<Grades.size(); i++){
            Double grade = Grades.get(i);
            String subject = Subjects.get(i);
            allGrades = allGrades + subject + ": " + grade + "\n";
        }
        allGrades = allGrades + "Final Grade: " + FinalGrade;
        return allGrades;
    }
}

