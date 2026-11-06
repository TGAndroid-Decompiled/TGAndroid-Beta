package q7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f53931b = new Object();
    public Object f53932a;

    public t(Object obj) {
        this.f53932a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f53932a != f53931b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f53932a;
        Object obj2 = f53931b;
        if (obj != obj2) {
            this.f53932a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
