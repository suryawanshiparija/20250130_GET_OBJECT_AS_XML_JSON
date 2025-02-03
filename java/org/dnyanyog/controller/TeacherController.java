package org.dnyanyog.controller; 
import org.dnyanyog.dto.Student;
import org.dnyanyog.dto.Teacher;
import org.dnyanyog.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private final TeacherService teacherService = new TeacherService();

    @GetMapping("/name/{ID}")
    public String getTeacherName(@PathVariable String ID) {
        return teacherService.getTeach_Name(ID);
    }

    @GetMapping("/email/{ID}")
    public List<String> getTeacherEmail(@PathVariable String ID) {
        return teacherService.getTeach_Email(ID);
    }
    @GetMapping(path="/teacher",produces={"application/json"})
    public Teacher getTeacher()
    {
    	Teacher T=new Teacher();
    	
    	T.teachname ="ABC";
    	T.teachemail ="sp@gmail.com";
    	T.teachmob ="749994059";    	
    	
    	return T;
    }

    @GetMapping("/mobile/{ID}")
    public String getTeacherMobile(@PathVariable String ID) {
        return teacherService.getTeach_Mob(ID);
    }
}
