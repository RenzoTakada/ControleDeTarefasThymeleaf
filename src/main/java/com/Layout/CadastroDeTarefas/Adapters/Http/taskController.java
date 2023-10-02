package com.Layout.CadastroDeTarefas.Adapters.Http;

import com.Layout.CadastroDeTarefas.Domain.Models.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.swing.plaf.synth.SynthTextAreaUI;

@Controller
public class taskController {


    @GetMapping("/create")
    public String home(){
        return "create";
    }

    @PostMapping("/create")
    public void create(Task request){
        System.out.println("O nome da tarefa é "+ request.getName() +" data da execucao é "+request.getData());
    }
}
