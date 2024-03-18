package homework;

public class Admin implements Entity{
    private final String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
