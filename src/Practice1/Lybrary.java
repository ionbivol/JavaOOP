package Practice1;

public class Lybrary {

    private String name;

    public Lybrary(String name){
        this.name = name;



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lybrary{" +
                "name='" + name + '\'' +
                '}';
    }
}


