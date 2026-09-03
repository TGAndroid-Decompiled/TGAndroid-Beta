package rf;

import j$.util.function.IntUnaryOperator$CC;
import java.util.function.IntUnaryOperator;
public final class h implements IntUnaryOperator {
    public IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
    }

    @Override
    public final int applyAsInt(int i10) {
        if (i10 >= 16777215) {
            return 1;
        }
        return i10 + 1;
    }

    public IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
    }
}
