package pojos;

import java.util.ArrayList;

public class ElifObjectPojo {
    private int lessonProgramId;
    private String startTime;
    private String stopTime;
    private ArrayList<ElifLessonNamePojo> lessonName;
    private String day;


    public ElifObjectPojo() {
    }


    public ElifObjectPojo(int lessonProgramId, String startTime, String stopTime, ArrayList<ElifLessonNamePojo> lessonName, String day) {
        this.lessonProgramId = lessonProgramId;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.lessonName = lessonName;
        this.day = day;
    }


    public int getLessonProgramId() {
        return lessonProgramId;
    }

    public void setLessonProgramId(int lessonProgramId) {
        this.lessonProgramId = lessonProgramId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public ArrayList<ElifLessonNamePojo> getLessonName() {
        return lessonName;
    }

    public void setLessonName(ArrayList<ElifLessonNamePojo> lessonName) {
        this.lessonName = lessonName;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "ElifObjectPojo{" +
                "lessonProgramId=" + lessonProgramId +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                ", lessonName=" + lessonName +
                ", day='" + day + '\'' +
                '}';
    }
}
