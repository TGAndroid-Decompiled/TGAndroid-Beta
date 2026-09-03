package s8;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class c0 implements Iterator {
    public static final c0 f44185a;
    public static final c0[] f44186b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f44185a = r02;
        f44186b = new c0[]{r02};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f44186b.clone();
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
