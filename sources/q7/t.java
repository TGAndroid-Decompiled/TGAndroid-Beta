package q7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f53932b = new Object();
    public Object f53933a;

    public t(Object obj) {
        this.f53933a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f53933a != f53932b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f53933a;
        Object obj2 = f53932b;
        if (obj != obj2) {
            this.f53933a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
