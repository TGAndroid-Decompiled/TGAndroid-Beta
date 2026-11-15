package q7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f55473b = new Object();
    public Object f55474a;

    public t(Object obj) {
        this.f55474a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f55474a != f55473b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f55474a;
        Object obj2 = f55473b;
        if (obj != obj2) {
            this.f55474a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
