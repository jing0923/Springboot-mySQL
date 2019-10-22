package com.flexon.studentRegistration.studentRegistration.SpringBootArtifacts;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	@Autowired 
	//private StudentDAO studentService;  //change dao to account repo
	private AccountRepository service;
	
	@GetMapping("/getAllUser")
//	public ArrayList<Students> printAllStudent(){
//		return studentService.displayStudents();
//	}
	public List<Students> printAllStudent(){
		return service.findAll();
	}
	@GetMapping("/{studentId}")
//	public Students printOneStudent(@PathVariable(value="studentId") int studentId) throws Exception {
//		return studentService.getInfo(studentId);
//	}
	public Optional<Students> printOneStudent(@PathVariable(value="studentId") int studentId) {
		return service.findById(studentId);
	}
	@PostMapping("/addNewStudent")
	@ResponseStatus(HttpStatus.CREATED)
//	public void addStudent(@RequestBody Students newStudent) {
//		studentService.addNewStudent(newStudent);
//	}
	public void addStudent(@RequestBody Students newStudent) {
		service.save(newStudent);
	}
	@PutMapping("/update/{studentId}")
//	  public void updateStudent(@PathVariable(value="studentId") int studentId, @RequestBody Students newStudent) throws Exception {
//		Students stu = studentService.getInfo(studentId); 
//		stu.setFirstName(newStudent.getFirstName());
//		stu.setLastName(newStudent.getLastName());
//		stu.setDegree(newStudent.getDegree());
//		stu.setContactNumber(newStudent.getContactNumber());
//		stu.setEmailAddress(newStudent.getEmailAddress());
//	}
	  public void updateStudent(@PathVariable(value="studentId") int studentId, @RequestBody Students newStudent) throws Exception {
			if(service.existsById(studentId)) {
				service.deleteById(studentId);
				service.save(newStudent);
			}
			else throw new IllegalArgumentException();
		}
	 @DeleteMapping("/delete/{studentId}")
//	 public void deleteStudent(@PathVariable(value="studentId") int studentId) throws Exception {
//			studentService.deletStudent(studentId); 
//		}
	 public void deleteStudent(@PathVariable(value="studentId") int studentId) throws Exception {
			service.deleteById(studentId);
		}
}
