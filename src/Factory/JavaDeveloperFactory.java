package Factory;

public class JavaDeveloperFactory extends DeveloperFactory {
    @Override
    public Developer createDeveloper(){
        return new JavaDeveloper();
    }
}
