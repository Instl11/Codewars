import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersRecursionTest {

    @Test
    void showSequenceBuilder() {
        SumOfNumbersRecursion.showSequenceBuilder(100000);
    }

    @Test
    void showSequenceStream() {
        SumOfNumbersRecursion.showSequenceStream(100000);
    }

    @Test
    void showSequencePlus() {
        SumOfNumbersRecursion.showSequenceSimplePlus(100000);
    }
}