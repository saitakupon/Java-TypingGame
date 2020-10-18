import module.prepare.*;
import module.run.*;

class Main {
    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        Run.game(Prepare.question());
        double end = System.currentTimeMillis();
        double totalTime = (end - start) / 1000;
        System.out.println(totalTime);
    }
}
