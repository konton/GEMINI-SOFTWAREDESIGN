package com.example.demo.SciencePlan;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.DataProcRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@Controller
public class SubmitController {

    @Autowired
    private SciencePlanRepository ScienceRepository;

    @CrossOrigin
    @GetMapping("/submitplanpage")
    private String submitPlanpage(Model model) {

        model.addAttribute("Scienceplan",ScienceRepository.findAll());
        return "submitSciencePlan";
    }

    @CrossOrigin
    @GetMapping("/submitplan")
    private  String  submitSciencePlan(@RequestParam String planno, RedirectAttributes redirectAttrs){

        Optional<SciencePlan> sci = ScienceRepository.findById(Integer.parseInt(planno));
        edu.gemini.app.ocs.model.SciencePlan Oscsci = parseOcs(sci);
        OCS ocs = new OCS();

        System.out.println(ocs.getAllSciencePlans());
        redirectAttrs.addFlashAttribute("Confirm",ocs.submitSciencePlan(Oscsci));
        return "redirect:/submitplanpage";
    }
    private edu.gemini.app.ocs.model.SciencePlan parseOcs(Optional<SciencePlan> sci){
        edu.gemini.app.ocs.model.SciencePlan Ocsci = new edu.gemini.app.ocs.model.SciencePlan();
        Ocsci.setCreator(sci.get().getCreator());
        Ocsci.setSubmitter(sci.get().getSubmitter());
        Ocsci.setFundingInUSD(sci.get().getFundingInUSD());
        Ocsci.setObjectives(sci.get().getObjectives());
        Ocsci.setStarSystem(sci.get().getStarSystem());
        Ocsci.setStartDate(sci.get().getStartDate());
        Ocsci.setEndDate(sci.get().getEndDate());
        Ocsci.setTelescopeLocation(sci.get().getTelescopeLocation());
        Ocsci.setDataProcRequirements(parseData(sci.get().getDataProc())); // สร้าง Func มาSET DATA PROC
        return Ocsci;
    }
    private DataProcRequirement parseData(com.example.demo.SciencePlan.DataProcRequirement dataProc){
        DataProcRequirement dataProcRequirement = new DataProcRequirement();
        dataProcRequirement.setFileType(dataProc.getFileType());
        dataProcRequirement.setFileQuality(dataProc.getFileQuality());
        dataProcRequirement.setColorType(dataProc.getColorType());
        dataProcRequirement.setContrast(dataProc.getContrast());
        dataProcRequirement.setBrightness(dataProc.getBrightness());
        dataProcRequirement.setSaturation(dataProc.getSaturation());
        dataProcRequirement.setHighlights(dataProc.getHighlights());
        dataProcRequirement.setExposure(dataProc.getExposure());
        dataProcRequirement.setShadows(dataProc.getShadows());
        dataProcRequirement.setWhites(dataProc.getWhites());
        dataProcRequirement.setBlacks(dataProc.getBlacks());
        dataProcRequirement.setLuminance(dataProc.getLuminance());
        dataProcRequirement.setHue(dataProc.getHue());
        return dataProcRequirement;
    }



}