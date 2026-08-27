package p8;

import java.io.Serializable;
import java.util.ArrayList;

public final class g0 implements o8.i, Serializable {

    public final int f45545a;

    public g0() {
        l.a(2, "expectedValuesPerKey");
        this.f45545a = 2;
    }

    @Override
    public final Object get() {
        return new ArrayList(this.f45545a);
    }
}
