package life.xtc.community.controller;

import life.xtc.community.dto.QuestionDTO;
import life.xtc.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by codedrinker on 2019/5/21.
 */
@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") String id, Model model) {
        Long questionId=Long.parseLong(id);
        QuestionDTO questionDTO = questionService.getById(questionId);
        model.addAttribute("question",questionDTO);
        //累加阅读数
        return "question";
    }
}
