package p8;

import java.util.NoSuchElementException;

public final class e0 extends x0 {

    public boolean f45540a;

    public final Object f45541b;

    public e0(Object obj) {
        this.f45541b = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f45540a;
    }

    @Override
    public final Object next() {
        if (this.f45540a) {
            throw new NoSuchElementException();
        }
        this.f45540a = true;
        return this.f45541b;
    }
}
