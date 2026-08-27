package p8;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class f0 implements Iterator {

    public static final f0 f45542a;

    public static final f0[] f45543b;

    static {
        f0 f0Var = new f0("INSTANCE", 0);
        f45542a = f0Var;
        f45543b = new f0[]{f0Var};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f45543b.clone();
    }

    @Override
    public final boolean hasNext() {
        return false;
    }

    @Override
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
