package bowling.entity.score;

import bowling.entity.Pin;

import java.util.Objects;

import static bowling.entity.Pin.MAX_PIN_COUNT;

public class Strike extends Finish {
    private static final String STRIKE_SYMBOL = "X";

    @Override
    public String scoreResult() {
        return STRIKE_SYMBOL;
    }

    @Override
    public ScoreType bowl(Pin fallenPin) {
        if (fallenPin.pin() == MAX_PIN_COUNT) {
            return new Strike();
        }
        return new NormalScore(fallenPin);
    }
}
