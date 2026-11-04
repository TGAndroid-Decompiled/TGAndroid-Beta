package p7;

import java.util.NoSuchElementException;
public final class u extends e0 {
    public static final Object f53407b = new Object();
    public Object f53408a;

    public u(Object obj) {
        this.f53408a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f53408a != f53407b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f53408a;
        Object obj2 = f53407b;
        if (obj != obj2) {
            this.f53408a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
