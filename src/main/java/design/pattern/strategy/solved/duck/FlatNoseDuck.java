package design.pattern.strategy.solved.duck;

import design.pattern.strategy.solved.strategy.fly.Flying;
import design.pattern.strategy.solved.strategy.quak.Quaking;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlatNoseDuck extends Duck {
    private final Logger LOGGER;

    public FlatNoseDuck(Flying flying, Quaking quaking) {
        LOGGER = LoggerFactory.getLogger(this.getClass());
        this.flying = flying;
        this.quaking = quaking;
    }


    public void show() {
        LOGGER.info("Looks like flat nose duck");
    }
}
