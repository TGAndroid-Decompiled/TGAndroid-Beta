package q8;

import java.io.Serializable;
import java.util.ArrayList;
public final class g0 implements p8.i, Serializable {
    public final int f46452a;

    public g0() {
        l.a(2, "expectedValuesPerKey");
        this.f46452a = 2;
    }

    @Override
    public final Object get() {
        return new ArrayList(this.f46452a);
    }
}
