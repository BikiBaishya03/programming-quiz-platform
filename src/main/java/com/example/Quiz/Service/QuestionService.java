package com.example.Quiz.Service;

import com.example.Quiz.Entity.QuizQuestion;
import com.example.Quiz.Repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    public List<QuizQuestion> getAllQuestion() {
        return questionRepo.findAll();
    }

    public QuizQuestion saveQuestion(QuizQuestion question) {
        questionRepo.save(question);
        return question;
    }
}
