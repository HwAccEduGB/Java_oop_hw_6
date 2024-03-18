package homework;

public class User implements Entity{
    private final String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
