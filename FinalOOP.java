import java.util.ArrayList;

public class FinalOOP {
    public static void main(String[] args) {
        // Employee class

        Employee E1 = new Employee();
        Employee E2 = new Employee();

        // Project Class

        Project P1 = new Project("Web A", "Developing a Web Application");
        Project P2 = new Project("Web B", "Developing a Mobile App");

        // Set Values
        E1.setName("Tom");
        E1.setAge(23);
        E1.setEmpID("0001");
        E1.setPosition("UX/UI");
        E1.AddProject(P1);
        E1.AddProject(P2);

        E2.setName("Tim");
        E2.setAge(27);
        E2.setEmpID("0002");
        E2.setPosition("FrontEnd");
        E2.AddProject(P1);

        // Display Data

        E1.showDetail();
        E2.showDetail();
    }
}

interface Person {
    String getName();

    void setName(String name);

    int getAge();

    void setAge(int age);
}

interface Job {
    String getPosition();

    void setPosition(String position);

    String getEmpID();

    void setEmpID(String ID);
}

class Project {
    private String ProjectName;
    private String Description;

    Project(String ProjectName, String Description) {
        this.ProjectName = ProjectName;
        this.Description = Description;
    }

    public String getProject() {
        return String.format("%s : %s", this.ProjectName, this.Description);
    }
}

class Employee implements Person, Job {
    private String Name;
    private Double Age;
    private String Position;
    private String ID;
    private ArrayList<Project> MyProject;

    public Employee() {
        this.MyProject = new ArrayList<Project>();
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setAge(int age) {
        this.Age = Double.valueOf(age);
    }

    public void setPosition(String position) {
        this.Position = position;
    }

    public void setEmpID(String ID) {
        this.ID = ID;
    }

    public void AddProject(Project newProject) {
        this.MyProject.add(newProject);
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age.intValue();
    }

    public String getPosition() {
        return Position;
    }

    public String getEmpID() {
        return ID;
    }

    public void showDetail() {
        System.out.println("Name  :  " + this.getName());
        System.out.println("Position  :  " + this.getPosition());
        System.out.println("EmpID  :  " + this.getEmpID());
        System.out.println("Project  :  ");

        for (Project project : MyProject) {
            System.out.println("        " + project.getProject());
        }

        System.out.println("******************************************************************************");
    }

}