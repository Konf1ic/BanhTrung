package com.example.car_and_pie.controller;

import com.example.car_and_pie.model.BanhTrung;
import com.example.car_and_pie.service.IBanhTrungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/banhtrung")
public class BanhTrungController {

    @Autowired
    private IBanhTrungService banhTrungService;

    @GetMapping("/list")
    public String showBanhTrungList(Model model) {
        List<BanhTrung> banhTrungList = banhTrungService.getAllBanhTrung();
        model.addAttribute("banhTrungList", banhTrungList);
        return "banhtrung/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("banhTrung", new BanhTrung());
        return "banhtrung/add";
    }

    @PostMapping("/add")
    public String addBanhTrung(@ModelAttribute("banhTrung") BanhTrung banhTrung) {
        banhTrungService.addBanhTrung(banhTrung);
        return "redirect:/banhtrung/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        BanhTrung banhTrung = banhTrungService.getBanhTrungById(id);
        model.addAttribute("banhTrung", banhTrung);
        return "banhtrung/edit";
    }

    @PostMapping("/edit/{id}")
    public String updateBanhTrung(@PathVariable("id") int id, @ModelAttribute("banhTrung") BanhTrung banhTrung) {
        banhTrungService.updateBanhTrung(banhTrung);
        return "redirect:/banhtrung/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteBanhTrung(@PathVariable("id") int id) {
        banhTrungService.deleteBanhTrung(id);
        return "redirect:/banhtrung/list";
    }

    @GetMapping("/detail/{id}")
    public String showBanhTrungDetail(@PathVariable("id") int id, Model model) {
        BanhTrung banhTrung = banhTrungService.getBanhTrungById(id);
        model.addAttribute("banhTrung", banhTrung);
        return "banhtrung/detail";
    }
}