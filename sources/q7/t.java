package q7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f56047b = new Object();
    public Object f56048a;

    public t(Object obj) {
        this.f56048a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f56048a != f56047b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f56048a;
        Object obj2 = f56047b;
        if (obj != obj2) {
            this.f56048a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
