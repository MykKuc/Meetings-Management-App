package com.example.vismameetingappwithdb.entity;

import javax.persistence.*;
import java.time.LocalDateTime;


//@Temporal only support java.util.Date and .Calendar
// Here is the solution https://thorben-janssen.com/persist-localdate-localdatetime-jpa/
/*
Pasirodo tiesiog reikejo &stringtype=unspecified prideti prie URL.

 */

@Entity
@Table(name = "meetings")
public class Meeting {
    @Column(name = "id")
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nameofmeeting")
    private String nameOfMeeting;

    @Column(name = "responsibleperson")
    private String responsiblePerson;

    @Column(name = "descriptionofmeeting")
    private String descriptionOfMeeting;

    @Column(name = "meetingcategory")
    @Enumerated(EnumType.STRING)
    private MeetingCategory meetingCategory;

    @Column(name = "meetingtype")
    @Enumerated(EnumType.STRING)
    private MeetingType meetingType;

    @Column(name = "startdate")
    private LocalDateTime startDate;

    @Column(name = "enddate")
    private LocalDateTime endDate;

    public Meeting() {}

    public Meeting(Integer id, String nameOfMeeting, String responsiblePerson, String descriptionOfMeeting, MeetingCategory meetingCategory, MeetingType meetingType, LocalDateTime startDate, LocalDateTime endDate) {
        this.id = id;
        this.nameOfMeeting = nameOfMeeting;
        this.responsiblePerson = responsiblePerson;
        this.descriptionOfMeeting = descriptionOfMeeting;
        this.meetingCategory = meetingCategory;
        this.meetingType = meetingType;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfMeeting() {
        return nameOfMeeting;
    }

    public void setNameOfMeeting(String nameOfMeeting) {
        this.nameOfMeeting = nameOfMeeting;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public String getDescriptionOfMeeting() {
        return descriptionOfMeeting;
    }

    public void setDescriptionOfMeeting(String descriptionOfMeeting) {
        this.descriptionOfMeeting = descriptionOfMeeting;
    }

    public MeetingCategory getMeetingCategory() {
        return meetingCategory;
    }

    public void setMeetingCategory(MeetingCategory meetingCategory) {
        this.meetingCategory = meetingCategory;
    }

    public MeetingType getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(MeetingType meetingType) {
        this.meetingType = meetingType;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "id=" + id +
                ", nameOfMeeting='" + nameOfMeeting + '\'' +
                ", responsiblePerson='" + responsiblePerson + '\'' +
                ", descriptionOfMeeting='" + descriptionOfMeeting + '\'' +
                ", meetingCategory=" + meetingCategory +
                ", meetingType=" + meetingType +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
