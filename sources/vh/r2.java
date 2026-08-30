package vh;

import j$.util.function.BiFunction$CC;
import java.util.function.BiFunction;
import java.util.function.Function;
public final class r2 implements BiFunction {
    public BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj, Object obj2) {
        return Integer.valueOf(((Integer) obj2).intValue() + ((Integer) obj).intValue());
    }
}
