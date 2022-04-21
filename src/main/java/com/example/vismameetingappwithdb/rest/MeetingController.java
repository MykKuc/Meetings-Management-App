package com.example.vismameetingappwithdb.rest;

import com.example.vismameetingappwithdb.entity.Meeting;
import com.example.vismameetingappwithdb.entity.MeetingCategory;
import com.example.vismameetingappwithdb.entity.MeetingType;
import com.example.vismameetingappwithdb.service.MeetingService;
import com.example.vismameetingappwithdb.service.MeetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MeetingController {

    private MeetingService meetingService;

    @Autowired
    public MeetingController(MeetingService meetingService){
        this.meetingService = meetingService;
    }


    @GetMapping("/getmeetings")
    public List<Meeting> findAll (){
        return meetingService.findAll();
    }

    @GetMapping("/filterbyresponsibleperson/{responsiblePerson}")
    public List<Meeting> findAllByResponsiblePerson(@PathVariable String responsiblePerson) {
        return meetingService.findAllByResponsiblePerson(responsiblePerson);
    }

    @GetMapping("/filterbymeetingcategory/{meetingCategory}")
    public List<Meeting> findAllByMeetingCategory (@PathVariable MeetingCategory meetingCategory){
        return meetingService.findAllByMeetingCategory(meetingCategory);
    }

    @GetMapping("/filterbymeetingtype/{meetingType}")
    public List<Meeting> findAllByMeetingType(@PathVariable MeetingType meetingType){
        return meetingService.findAllByMeetingType(meetingType);
    }

    @GetMapping("/filterbymeetingdescription/{descriptionOfMeeting}")
    @ResponseBody
    public List<Meeting> findAllByMeetingDescription(@PathVariable String descriptionOfMeeting){
        return meetingService.findAllByDescriptionOfMeeting(descriptionOfMeeting);
    }

    @PostMapping("/newmeeting")
    public void addMeeting (@RequestBody Meeting theMeeting) {
        meetingService.save(theMeeting);
    }

}
