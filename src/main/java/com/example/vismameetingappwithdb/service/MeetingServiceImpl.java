package com.example.vismameetingappwithdb.service;

import com.example.vismameetingappwithdb.dao.MeetingRepository;
import com.example.vismameetingappwithdb.entity.Meeting;
import com.example.vismameetingappwithdb.entity.MeetingCategory;
import com.example.vismameetingappwithdb.entity.MeetingType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MeetingServiceImpl implements MeetingService{

    public MeetingRepository meetingRepository;

    @Autowired
    public MeetingServiceImpl (MeetingRepository meetingRepository){
        this.meetingRepository = meetingRepository;
    }

    @Override
    public List<Meeting> findAll() {
        return meetingRepository.findAll();
    }

    @Override
    public List<Meeting> findAllByResponsiblePerson(String responsiblePerson) {
        return meetingRepository.findAllByResponsiblePerson(responsiblePerson);
    }

    @Override
    public List<Meeting> findAllByMeetingCategory(MeetingCategory meetingCategory) {
        return meetingRepository.findAllByMeetingCategory(meetingCategory);
    }

    @Override
    public List<Meeting> findAllByMeetingType(MeetingType meetingType) {
        return meetingRepository.findAllByMeetingType(meetingType);
    }

    @Override
    @Transactional
    public List<Meeting> findAllByDescriptionOfMeeting(String descriptionOfMeeting) {
        return meetingRepository.findAllByDescriptionOfMeetingContaining(descriptionOfMeeting);
    }

    @Override
    public void save(Meeting meeting) {
        meetingRepository.save(meeting);
    }

}
