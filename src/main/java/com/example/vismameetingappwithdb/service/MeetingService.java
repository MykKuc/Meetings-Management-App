package com.example.vismameetingappwithdb.service;

import com.example.vismameetingappwithdb.entity.Meeting;
import com.example.vismameetingappwithdb.entity.MeetingCategory;
import com.example.vismameetingappwithdb.entity.MeetingType;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MeetingService {

    List<Meeting> findAll();

    List<Meeting> findAllByResponsiblePerson(String responsiblePerson);

    List<Meeting> findAllByMeetingCategory(MeetingCategory meetingCategory);

    List<Meeting> findAllByMeetingType(MeetingType meetingType);

    List<Meeting> findAllByDescriptionOfMeeting(String descriptionOfMeeting);

    void save(Meeting meeting);

}
