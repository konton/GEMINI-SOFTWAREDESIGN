package com.example.demo.SciencePlan;


import edu.gemini.app.ocs.model.StarSystem;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Entity
public class SciencePlan {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int planNo;

    private String creator;
    private String submitter;
    private String collaborator;
    private double fundingInUSD;
    private String objectives;
    private StarSystem.CONSTELLATIONS starSystem;
    private Date startDate;
    private Date endDate;
    private edu.gemini.app.ocs.model.SciencePlan.TELESCOPELOC telescopeLocation;
    @OneToOne(cascade = CascadeType.ALL)
    private DataProcRequirement DataProcRequirement;

    public String getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(String collaborator) {
        this.collaborator = collaborator;
    }





    public StarSystem.CONSTELLATIONS getStarSystem() {
        return starSystem;
    }

    public void setStarSystem(StarSystem.CONSTELLATIONS starSystem) {
        this.starSystem = starSystem;
    }

    public edu.gemini.app.ocs.model.SciencePlan.TELESCOPELOC getTelescopeLocation() {
        return telescopeLocation;
    }

    public void setTelescopeLocation(edu.gemini.app.ocs.model.SciencePlan.TELESCOPELOC telescopeLocation) {
        this.telescopeLocation = telescopeLocation;
    }

    public com.example.demo.SciencePlan.DataProcRequirement getDataProc() {
        return DataProcRequirement;
    }

    public void setDataProc(com.example.demo.SciencePlan.DataProcRequirement DataProcRequirement) {
        this.DataProcRequirement = DataProcRequirement;
    }

    public int getPlanNo() {
        return planNo;
    }

    public void setPlanNo(int planNo) {
        this.planNo = planNo;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public double getFundingInUSD() {
        return fundingInUSD;
    }

    public void setFundingInUSD(double fundingInUSD) {
        this.fundingInUSD = fundingInUSD;
    }

    public String getObjectives() {
        return objectives;
    }

    public void setObjectives(String objectives) {
        this.objectives = objectives;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        String temp = startDate;
        String temp2="";
        String[]  e= temp.split("-",4);
        for(int x=e.length-1;x>=0;x--){

            temp2+= e[x];
            if(x!=0){
                temp2+="/";
            }

        }
        System.out.println(temp2);
        try {
            this.startDate = (new SimpleDateFormat("dd/MM/yyyy")).parse(temp2);
            System.out.println("TESTISUS");
            System.out.println(this.startDate);
        } catch (ParseException var3) {
            var3.printStackTrace();
        }
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        String temp = endDate;
        String temp2="";
        String[]  e= temp.split("-",4);
        for(int x=e.length-1;x>=0;x--){

            temp2+= e[x];
            if(x!=0){
                temp2+="/";
            }

        }
        try {
            this.endDate = (new SimpleDateFormat("dd/MM/yyyy")).parse(temp2);
        } catch (ParseException var3) {
            var3.printStackTrace();
        }

    }


}
