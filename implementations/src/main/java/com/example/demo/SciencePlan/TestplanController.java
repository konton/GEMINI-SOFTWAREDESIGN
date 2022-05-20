package com.example.demo.SciencePlan;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.example.MySciencePlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class TestplanController {
    @Autowired
    private SciencePlanRepository ScienceRepository;
    OCS ocs = new OCS();

    @CrossOrigin
    @GetMapping("/testplanpage")
    public String testingPlanPage(Model model) {


        model.addAttribute("sci", new SciencePlan()); //For receive object
        model.addAttribute("Scienceplan",ocs.getAllSciencePlans()); // For show object
        System.out.println(ocs.getAllSciencePlans());

        return "testSciencePlan";
    }

    @CrossOrigin
    @GetMapping("/testplan")
    public String testPlan(@RequestParam String planno, RedirectAttributes redirectAttrs){

//        System.out.println(sci);
        edu.gemini.app.ocs.model.SciencePlan sci;
        System.out.println(ocs.getAllSciencePlans());
        sci = ocs.getSciencePlanByNo(Integer.parseInt(planno));

        redirectAttrs.addFlashAttribute("Confirm",ocs.testSciencePlan(sci));
        return "redirect:/testplanpage";

    }
}