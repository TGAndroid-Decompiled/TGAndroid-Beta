package q7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f54036b = new Object();
    public Object f54037a;

    public t(Object obj) {
        this.f54037a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f54037a != f54036b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f54037a;
        Object obj2 = f54036b;
        if (obj != obj2) {
            this.f54037a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
