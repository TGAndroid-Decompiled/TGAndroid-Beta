package q7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f56170b = new Object();
    public Object f56171a;

    public t(Object obj) {
        this.f56171a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f56171a != f56170b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f56171a;
        Object obj2 = f56170b;
        if (obj != obj2) {
            this.f56171a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
