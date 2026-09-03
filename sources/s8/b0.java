package s8;

import java.util.NoSuchElementException;
public final class b0 extends u0 {
    public boolean f47123a;
    public final Object f47124b;

    public b0(Object obj) {
        this.f47124b = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f47123a;
    }

    @Override
    public final Object next() {
        if (!this.f47123a) {
            this.f47123a = true;
            return this.f47124b;
        }
        throw new NoSuchElementException();
    }
}
