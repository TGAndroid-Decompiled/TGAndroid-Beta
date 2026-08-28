package x6;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f49060b = new Object();
    public Object f49061a;

    public t(Object obj) {
        this.f49061a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f49061a != f49060b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f49061a;
        Object obj2 = f49060b;
        if (obj != obj2) {
            this.f49061a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
