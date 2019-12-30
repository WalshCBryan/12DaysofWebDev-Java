package christmas;

public class Reindeer {
    protected String name;

    public Reindeer(String name) {
        this.name = name;
        if (name.equalsIgnoreCase("rudolph")) {
            System.out.println(name + " has a shiny red nose!");
        } else {
            System.out.println("This reindeer is named " + name);
        }
    }
}
