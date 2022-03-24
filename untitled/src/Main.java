public class Main {

    public static void main(String[] args) {
        Course c = new Course(new Cross(600), new Water(4), new Wall(7));
        Team team = new Team("Stars", new Wolf("Zud"), new Cat("Barsik"), new Cat1("Liza"), new Dog("Sharik"));
        c.doIt(team);

        System.out.println("\nWinners:");
        team.passedTheDistance();

        System.out.println("\nResult:");
        team.showResults();
    }
}
