package q7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f56092b = new Object();
    public Object f56093a;

    public t(Object obj) {
        this.f56093a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f56093a != f56092b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f56093a;
        Object obj2 = f56092b;
        if (obj != obj2) {
            this.f56093a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
