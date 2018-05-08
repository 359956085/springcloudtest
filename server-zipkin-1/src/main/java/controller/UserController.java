package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fs.pojo.Person;
import com.fs.repository.PersonRepository;

@RestController
public class UserController {
	
	@Autowired
	PersonRepository personRepositorfy;
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public void addUser() {
		Person p = new Person();
		p.setUserId(1);
		p.setUserName("aaa");
		personRepositorfy.save(p);
	}
	
	@ResponseBody
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public Person getUser(Integer userId) {
		return personRepositorfy.findByUserId(userId);
		
	}
}
