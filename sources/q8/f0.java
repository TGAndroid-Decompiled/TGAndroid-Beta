package q8;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class f0 implements Iterator {
    public static final f0 f46449a;
    public static final f0[] f46450b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46449a = r02;
        f46450b = new f0[]{r02};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f46450b.clone();
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
