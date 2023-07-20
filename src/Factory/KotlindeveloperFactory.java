package Factory;

public class KotlindeveloperFactory extends DeveloperFactory {
    @Override
    public Developer createDeveloper(){
        return new KotlinDeveloper();
    }
}
