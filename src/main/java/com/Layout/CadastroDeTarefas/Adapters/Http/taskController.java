package com.Layout.CadastroDeTarefas.Adapters.Http;

import com.Layout.CadastroDeTarefas.Domain.Models.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.List;

@Controller
public class taskController {
    List<Task> tasks = new ArrayList<>();
    @GetMapping("/create")
    public String home(){
        return "create";
    }

    @PostMapping("/create")
    public String create(Task request){
        request.setId(tasks.size()+1L);
        tasks.add(new Task(request.getId(),request.getName(),request.getData()));

        return "redirect:/List";
    }

    @GetMapping("/List")
    public ModelAndView List(){
        var mv = new ModelAndView("List");
        mv.addObject("tasks",tasks);
        return mv;
    }
}
