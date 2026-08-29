package q8;

import java.util.NoSuchElementException;
public final class e0 extends x0 {
    public boolean f46447a;
    public final Object f46448b;

    public e0(Object obj) {
        this.f46448b = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f46447a;
    }

    @Override
    public final Object next() {
        if (!this.f46447a) {
            this.f46447a = true;
            return this.f46448b;
        }
        throw new NoSuchElementException();
    }
}
