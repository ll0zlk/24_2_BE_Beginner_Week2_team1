package Activity;

import java.util.ArrayList;

public class Study extends Activity {

    public Study(String activity_name, String explanation) {
        super(activity_name, explanation);
    }

    public void printStudy() {
        System.out.println(getActivity_name()+": "+getStatus()+"\n");
    }
}
