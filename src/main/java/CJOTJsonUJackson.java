

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CJOTJsonUJackson {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        Student student = new Student();

        try {
            mapper.writeValue(new File("student.json"), student);
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
            System.out.println(jsonString);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        }

    }

    private static Student newStudent() {
        Student student = new Student();

        List<String> course = new ArrayList<>();
        course.add("Math");
        course.add("Socila-Science");
        course.add("English");

        Map<String, String> languages = new HashMap<>();
        languages.put("malyalam", "Beginner");
        languages.put("eng", "Intermediate");
        languages.put("Spanish", "Advanced");

        student.setName("Willomson");
        student.setId(202);
        student.setCourse(course);
        student.setLanguages(languages);

        return student;
    }


}



