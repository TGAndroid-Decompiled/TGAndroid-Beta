package s8;

import java.util.NoSuchElementException;
public final class b0 extends u0 {
    public boolean f44116a;
    public final Object f44117b;

    public b0(Object obj) {
        this.f44117b = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f44116a;
    }

    @Override
    public final Object next() {
        if (!this.f44116a) {
            this.f44116a = true;
            return this.f44117b;
        }
        throw new NoSuchElementException();
    }
}
