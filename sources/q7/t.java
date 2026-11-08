package q7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f54025b = new Object();
    public Object f54026a;

    public t(Object obj) {
        this.f54026a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f54026a != f54025b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f54026a;
        Object obj2 = f54025b;
        if (obj != obj2) {
            this.f54026a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
