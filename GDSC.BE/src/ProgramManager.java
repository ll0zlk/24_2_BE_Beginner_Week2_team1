import Activity.Project;
import Activity.Study;
import Events.Events;

import java.util.ArrayList;

public class ProgramManager {
    private static final ArrayList<Person> people=new ArrayList<>();
    private static final ArrayList<Project> projects=new ArrayList<>();
    private static final ArrayList<Study> studies=new ArrayList<>();
    private static final ArrayList<Events> events=new ArrayList<>();


    static public void printPeopleList() {
        System.out.println("<소속된 회원 목록>");
        for (Person person: people) {
            System.out.println("\n");
            person.printPersonInfo();
            System.out.println("----------");
        }
    }

    static public void printStudiesList() {
        System.out.println("<개설된 스터디 목록>");
        for (Study study: studies) {
            study.printStudy();
        }
    }

    public void printProjectsList() {
        System.out.println("<개설된 프로젝트 목록>");
        for (Project project: projects) {
            project.printProject();
        }
    }

    public void printEventsList() {
        System.out.println("<모든 이벤트 목록>");
        for(Events event: events) {
            event.printEvents();
        }
    }

    void printCommunityInformation(){
        System.out.println("소속 인원: "+people.size()+"명");
        System.out.println("계획된 행사: "+events.size()+"명");
    }

}