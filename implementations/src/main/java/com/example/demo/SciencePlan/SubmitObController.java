package com.example.demo.SciencePlan;


import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.SciencePlan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SubmitObController {

    OCS ocs = new OCS();
    @CrossOrigin
    @GetMapping("/submitobpage")
    public String getobpage(Model model){

        model.addAttribute("tested", ocs.getAllSciencePlans());
        System.out.println(ocs.getAllSciencePlans());

        return "SubmitOb";
    }

    @CrossOrigin
    @GetMapping("/submittob")
    public String submittob(String planno, RedirectAttributes redirectAttrs){
        ocs.updateSciencePlanStatus(Integer.parseInt(planno), SciencePlan.STATUS.VALIDATED);
        redirectAttrs.addFlashAttribute("Message","** Sumitted sciencePlan to Observer **");
        return "redirect:/submitobpage";
    }

}
