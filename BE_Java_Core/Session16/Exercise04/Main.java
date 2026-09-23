package vn.edu.rikkei.session16.ex04;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> allStudents = Arrays.asList(
                new Student("SV01", "An", 3.8),
                new Student("SV02", "Bình", 2.5),
                new Student("SV03", "Cường", 3.5),
                new Student("SV04", "Dung", 3.2),
                new Student("SV05", "Hoa", 2.9),
                new Student("SV06", "Hùng", 3.9)
        );
        List<Student> honorStudents = StudentStreamService.getHonorStudents(allStudents);
        System.out.println("+--------------------------------------------------+");
        System.out.println("|           DANH SÁCH KHEN THƯỞNG (GPA >= 3.2)     |");
        System.out.println("+--------------------------------------------------+");

        int rank = 1;
        for (Student s : honorStudents) {
            System.out.printf("| Hạng %d | %-5s | %-12s | GPA: %.2f       |\n",
                    rank++, s.getId(), s.getName(), s.getGpa());
        }

        System.out.println("+--------------------------------------------------+");
    }
}
