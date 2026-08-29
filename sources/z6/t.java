package z6;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f50760b = new Object();
    public Object f50761a;

    public t(Object obj) {
        this.f50761a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f50761a != f50760b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f50761a;
        Object obj2 = f50760b;
        if (obj != obj2) {
            this.f50761a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
