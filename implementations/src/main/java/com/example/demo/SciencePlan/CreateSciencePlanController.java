package com.example.demo.SciencePlan;

import com.example.demo.User;
import com.example.demo.UserRepository;
import edu.gemini.app.ocs.model.StarSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;


@Controller
public class CreateSciencePlanController {
    @Autowired
    private SciencePlanRepository ScienceRepository;

    @Autowired
    private UserRepository UserRepository;

    @CrossOrigin
    @GetMapping("/Create")
    private  String viewCreatePage(Model model){
        model.addAttribute("SciencePlan", new SciencePlan());
        model.addAttribute("User", UserRepository.findAll());
        return "createSciPlan";
    }
    @CrossOrigin
    @GetMapping("/CreateSci")
    public String createUntestedPlan(@RequestParam String creator,@RequestParam String Collaborator,@RequestParam String submitter,@RequestParam double fundingInUSD,
                          @RequestParam String objectives,@RequestParam StarSystem.CONSTELLATIONS constellation,@RequestParam String startDate,@RequestParam String endDate,@RequestParam  edu.gemini.app.ocs.model.SciencePlan.TELESCOPELOC location,@RequestParam String[] dataProc, RedirectAttributes redirectAttrs) {

            SciencePlan sciencePlan = SetPlan( creator, Collaborator,submitter,  fundingInUSD, objectives, constellation, startDate, endDate, location, dataProc);
            System.out.println(sciencePlan.getStartDate());
            ScienceRepository.save(sciencePlan);

            redirectAttrs.addFlashAttribute("Message","Create Science Plan Successfully");
        return "redirect:/Create";
    }
    private SciencePlan SetPlan(String creator, String Collaborator ,String submitter,double fundingInUSD,
                                 String objectives, StarSystem.CONSTELLATIONS constellation, String startDate,
                                 String endDate,  edu.gemini.app.ocs.model.SciencePlan.TELESCOPELOC location,  String[] dataProc){
        SciencePlan s = new SciencePlan();
        s.setCreator(creator);
        s.setCollaborator(Collaborator);
        s.setSubmitter(submitter);
        s.setFundingInUSD(fundingInUSD);
        s.setObjectives(objectives);
        s.setStarSystem(constellation);
        s.setStartDate(startDate);
        s.setEndDate(endDate);
        s.setTelescopeLocation(location);
        s.setDataProc(setDataProc(dataProc));
        return s;
    }

    private DataProcRequirement setDataProc(String[] dataProc){
        DataProcRequirement data = new DataProcRequirement();
        data.setFileType(dataProc[0]);
        data.setFileQuality(dataProc[1]);
        data.setColorType(dataProc[2]);
        data.setContrast(Float.parseFloat(dataProc[3]));
        data.setBrightness(Float.parseFloat(dataProc[4]));
        data.setSaturation(Float.parseFloat(dataProc[5]));
        data.setHighlights(Float.parseFloat(dataProc[6]));
        data.setExposure(Float.parseFloat(dataProc[7]));
        data.setShadows(Float.parseFloat(dataProc[8]));
        data.setWhites(Float.parseFloat(dataProc[9]));
        data.setBlacks(Float.parseFloat(dataProc[10]));
        data.setLuminance(Float.parseFloat(dataProc[11]));
        data.setHue(Float.parseFloat(dataProc[12]));

        return data;
    }
    @CrossOrigin
    @GetMapping("/allsci")
    public @ResponseBody
    Iterable<com.example.demo.SciencePlan.SciencePlan> getAllSci() {
        // This returns a JSON or XML with the users
        return ScienceRepository.findAll();
    }

}
