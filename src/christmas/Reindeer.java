package christmas;

//Create a new Java class called Reindeer. This should be in the same package as your Santa class.
//        This should have a protected String property of 'name.'
//        Add a constructor that sets this name property when a new Reindeer is created. Display a message that tells you the name of the new Reindeer that has been created.
//        Test your new class in the main method of the Santa class by creating instances of Santa's reindeer.

public class Reindeer {
    protected String name;

    public String getName() {
        return name;
    }

    public Reindeer(String name) {
        this.name = name;
        if (name.equalsIgnoreCase("rudolph")) {
            System.out.println(name + " has a shiny red nose!");
        } else {
            System.out.println("This reindeer is named " + name + ".");
        }
    }
}
