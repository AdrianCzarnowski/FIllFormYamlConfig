package configuration.model;

import java.util.ArrayList;
import java.util.List;

public class Environment {

    private EnvironmentModel abc;
    private EnvironmentModel test;

    public EnvironmentModel getAbc() {
        return abc;
    }

    public EnvironmentModel getTest() {
        return test;
    }

    public static List<EnvironmentModel> getListOfEnvironments(){
        List<EnvironmentModel> listOfEnvironments = new ArrayList<>();
        listOfEnvironments.add(getAbc());
        listOfEnvironments.add(getTest());
        return listOfEnvironments;
    }




}
