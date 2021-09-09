package open_close;

public class Context {
    private final Strategy strategy;
    // we set the strategy in the constructor
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeTheStrategy() {
        this.strategy.doSomething();
    }
}