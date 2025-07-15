package com.example.Quiz.Controller;

import com.example.Quiz.DTO.loginRequest;
import com.example.Quiz.Entity.QuizQuestion;
import com.example.Quiz.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class loginController {

    @Autowired
    QuestionService questionService;

    private String USERNAME = "user";
    private String PASSWORD = "pass";

    @PostMapping("/login")
    public String login(@RequestBody loginRequest loginrequest){
        if(loginrequest.getUsername().equals(USERNAME) && loginrequest.getPassword().equals(PASSWORD)){
            return "Login Successful";
        }
        else{
            return "Invalid usernaem or Password";
        }
    }

    @GetMapping("/questions")
    public List<QuizQuestion> getquestion(){
        return questionService.getAllQuestion();
    }

    @PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
    public QuizQuestion saveQuestion(@RequestBody QuizQuestion question) {
        return questionService.saveQuestion(question);
    }

}
