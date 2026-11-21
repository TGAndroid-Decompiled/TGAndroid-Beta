package q7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f56088b = new Object();
    public Object f56089a;

    public t(Object obj) {
        this.f56089a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f56089a != f56088b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f56089a;
        Object obj2 = f56088b;
        if (obj != obj2) {
            this.f56089a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
