package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
public class HomeController {

    // In-memory storage
    private List<Student> studentsList = new ArrayList<>();

    // 1. VIEW ALL
    @GetMapping("/")
    public String showDashboard(Model model) {
        model.addAttribute("allStudents", studentsList);
        return "index"; // templates/index.html
    }

    // 2. ADD FORM
    @GetMapping("/addForm")
    public String addForm(Model model) {
        model.addAttribute("student", new Student());
        return "add_student"; // templates/add_student.html
    }

    // 3. SAVE (Add & Update handle pannum)
    @PostMapping("/save")
    public String save(@ModelAttribute("student") Student student) {
        // Check if student exists for update
        studentsList.removeIf(s -> s.getAdno() == student.getAdno());
        studentsList.add(student);
        return "redirect:/";
    }

    // 4. EDIT FORM
    @GetMapping("/edit/{adno}")
    public String editForm(@PathVariable int adno, Model model) {
        Student student = studentsList.stream()
                .filter(s -> s.getAdno() == adno)
                .findFirst()
                .orElse(null);
        model.addAttribute("student", student);
        return "update_student"; // templates/update_student.html
    }

    // 5. DELETE
    @GetMapping("/delete/{adno}")
    public String delete(@PathVariable int adno) {
        studentsList.removeIf(s -> s.getAdno() == adno);
        return "redirect:/";
    }
}