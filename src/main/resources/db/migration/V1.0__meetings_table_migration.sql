
CREATE TYPE meetingcategory AS ENUM ('CODEMONKEY','HUB','SHORT','TEAMBUILDING');
CREATE TYPE meetingtype AS ENUM ('LIVE','INPERSON');

CREATE TABLE IF NOT EXISTS meetings (
                                        id SERIAL NOT NULL PRIMARY KEY,
                                        nameofmeeting TEXT NOT NULL,
                                        responsibleperson VARCHAR(50) NOT NULL,
                                        descriptionofmeeting TEXT NOT NULL,
                                        meetingcategory meetingcategory NOT NULL,
                                        meetingtype meetingtype NOT NULL,
                                        startdate TIMESTAMP NOT NULL,
                                        enddate TIMESTAMP NOT NULL
);