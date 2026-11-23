package q7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f56057b = new Object();
    public Object f56058a;

    public t(Object obj) {
        this.f56058a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f56058a != f56057b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f56058a;
        Object obj2 = f56057b;
        if (obj != obj2) {
            this.f56058a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
