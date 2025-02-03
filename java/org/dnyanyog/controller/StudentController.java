package org.dnyanyog.controller; 

import org.dnyanyog.dto.Student;
import org.dnyanyog.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService = new StudentService();

    @GetMapping("/name/{ID}")
    public String getStudentName(@PathVariable String ID) {
        return studentService.getStud_Name(ID);
    }

    @GetMapping("/email/{ID}")
    public List<String> getStudentEmail(@PathVariable String ID) {
        return studentService.getStud_Email(ID);
    }
    
    @GetMapping(path="/student",produces={"application/json"})
    public Student getStudent()
    {
    	Student std=new Student();
    	std.Stud_Name ="Parija";
    	std.Stud_Email ="sp@gmail.com";
    	std.Stud_Mob ="749994059";    	
    	
    	return std;
    }

    @GetMapping("/mobile/{ID}")
    public String getStudentMobile(@PathVariable String ID) {
        return studentService.getStud_Mob(ID);
    }
}
