public class Wolf implements Competitor {

    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean active;

    public Wolf(String name) {
        this.name = name;
        this.maxRunDistance = 700;
        this.maxJumpHeight = 25;
        this.maxSwimDistance = 250;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + "successfully ran");
        } else {
            System.out.println(name + "failed ran");
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(name + "successfully swam");
        } else {
            System.out.println(name + "failed swimming");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + "successfully jump");
        } else {
            System.out.println(name + "failed jump");
            active = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " " + active);
    }
}