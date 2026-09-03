package s8;

import java.util.NoSuchElementException;
public final class b0 extends u0 {
    public boolean f44181a;
    public final Object f44182b;

    public b0(Object obj) {
        this.f44182b = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f44181a;
    }

    @Override
    public final Object next() {
        if (!this.f44181a) {
            this.f44181a = true;
            return this.f44182b;
        }
        throw new NoSuchElementException();
    }
}
