package s8;

import java.util.NoSuchElementException;
public final class b0 extends u0 {
    public boolean f47092a;
    public final Object f47093b;

    public b0(Object obj) {
        this.f47093b = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f47092a;
    }

    @Override
    public final Object next() {
        if (!this.f47092a) {
            this.f47092a = true;
            return this.f47093b;
        }
        throw new NoSuchElementException();
    }
}
