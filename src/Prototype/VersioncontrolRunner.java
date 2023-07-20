package Prototype;

public interface VersioncontrolRunner {
    public static void main(String[] args) {
        var project= new Project(1,"first","code");
        var projectFactory = new ProjectFactory(project);
        var projectClone = projectFactory.cloneProject();
        System.out.println(projectClone);
    }
}
