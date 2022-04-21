package com.example.vismameetingappwithdb.dao;

import com.example.vismameetingappwithdb.entity.Meeting;
import com.example.vismameetingappwithdb.entity.MeetingCategory;
import com.example.vismameetingappwithdb.entity.MeetingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

//How to findAll in a column where there is specific word
// Cia Hibernate problema del to Contains. @Param("")

@Repository
public interface MeetingRepository extends JpaRepository<Meeting,Integer>{

    List<Meeting> findAllByResponsiblePerson(String responsiblePerson);

    List<Meeting> findAllByMeetingCategory(MeetingCategory meetingCategory);

    List<Meeting> findAllByMeetingType(MeetingType meetingType);

    List<Meeting> findAllByDescriptionOfMeetingContaining(@Param("descriptionOfMeeting") String descriptionOfMeeting);

}
