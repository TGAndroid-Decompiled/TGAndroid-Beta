package q7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f54024b = new Object();
    public Object f54025a;

    public t(Object obj) {
        this.f54025a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f54025a != f54024b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f54025a;
        Object obj2 = f54024b;
        if (obj != obj2) {
            this.f54025a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
