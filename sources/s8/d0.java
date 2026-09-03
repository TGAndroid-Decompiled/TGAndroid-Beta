package s8;

import java.io.Serializable;
import java.util.ArrayList;
public final class d0 implements r8.i, Serializable {
    public final int f47130a;

    public d0() {
        l.c(2, "expectedValuesPerKey");
        this.f47130a = 2;
    }

    @Override
    public final Object get() {
        return new ArrayList(this.f47130a);
    }
}
