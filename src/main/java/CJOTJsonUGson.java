import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CJOTJsonUGson {

    public static void main(String[] args) {
        Gson gson = new Gson();
        Student student = newStudent();
        String jsonString = gson.toJson(student);
        System.out.println(jsonString);
    }

    private static Student newStudent() {
        Student student = new Student();

        List<String> course = new ArrayList<>();
        course.add("Toc");
        course.add("Geography");
        course.add("ADA");

        Map<String, String> languages = new HashMap<>();
        languages.put("English", "Beginner");
        languages.put("Hindi", "Advance");
        languages.put("Spanish", "Advanced");

        student.setName("David");
        student.setId(30);
        student.setCourse(course);
        student.setLanguages(languages);

        return student;
    }
}
