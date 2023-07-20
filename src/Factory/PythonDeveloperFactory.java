package Factory;

public class PythonDeveloperFactory extends DeveloperFactory {
    @Override
    public Developer createDeveloper(){
       return new PythonDeveloper();
    }
}
