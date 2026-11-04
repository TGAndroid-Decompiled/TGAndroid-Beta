package ui;

import j$.util.function.IntUnaryOperator$CC;
import java.util.function.IntUnaryOperator;
public final class h implements IntUnaryOperator {
    public IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
    }

    @Override
    public final int applyAsInt(int i3) {
        if (i3 >= 16777215) {
            return 1;
        }
        return i3 + 1;
    }

    public IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
    }
}
