package q7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f53907b = new Object();
    public Object f53908a;

    public t(Object obj) {
        this.f53908a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f53908a != f53907b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f53908a;
        Object obj2 = f53907b;
        if (obj != obj2) {
            this.f53908a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
