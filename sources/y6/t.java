package y6;

import java.util.NoSuchElementException;

public final class t extends d0 {

    public static final Object f49777b = new Object();

    public Object f49778a;

    public t(Object obj) {
        this.f49778a = obj;
    }

    @Override
    public final boolean hasNext() {
        return this.f49778a != f49777b;
    }

    @Override
    public final Object next() {
        Object obj = this.f49778a;
        Object obj2 = f49777b;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f49778a = obj2;
        return obj;
    }
}
