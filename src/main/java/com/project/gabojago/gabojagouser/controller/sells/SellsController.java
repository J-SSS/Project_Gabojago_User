package com.project.gabojago.gabojagouser.controller.sells;

import com.project.gabojago.gabojagouser.dto.sells.SellsDto;
import com.project.gabojago.gabojagouser.service.SellsService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/sells")
@Log4j2
public class SellsController {
    private SellsService sellsService;
    @GetMapping("list.do")
    public String list(Model model,
                       @RequestParam(name = "category", required = false) String category){
        List<SellsDto> sells;
        if(category==null){
           sells=sellsService.List();

        }else {
         sells=sellsService.findByCategory(category);
        }
        System.out.println("sells = " + sells);
        model.addAttribute("sells",sells);
        return "/sells/list";
    }



}