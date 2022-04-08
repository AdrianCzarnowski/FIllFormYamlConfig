package configuration.model;

import java.util.ArrayList;
import java.util.List;

public class Environment {

    private static EnvironmentModel abc;
    private static EnvironmentModel test;

    public static EnvironmentModel getAbc() {
        return abc;
    }

    public static EnvironmentModel getTest() {
        return test;
    }

    public static List<EnvironmentModel> getListOfEnvironments(){
        List<EnvironmentModel> listOfEnvironments = new ArrayList<>();
        listOfEnvironments.add(getAbc());
        listOfEnvironments.add(getTest());
        return listOfEnvironments;
    }




}
