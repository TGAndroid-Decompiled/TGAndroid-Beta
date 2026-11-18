package ud;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
public final class b implements Iterator {
    public final int f58587a = 0;
    public final int f58588b;
    public final int f58589c;
    public boolean d;
    public int f58590e;

    public b(char c10, char c11, int i7) {
        boolean z10 = false;
        this.f58588b = i7;
        this.f58589c = c11;
        if (i7 <= 0 ? j.f(c10, c11) >= 0 : j.f(c10, c11) <= 0) {
            z10 = true;
        }
        this.d = z10;
        this.f58590e = z10 ? c10 : c11;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f58587a) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    @Override
    public final Object next() {
        switch (this.f58587a) {
            case 0:
                int i7 = this.f58590e;
                if (i7 == this.f58589c) {
                    if (this.d) {
                        this.d = false;
                    } else {
                        throw new NoSuchElementException();
                    }
                } else {
                    this.f58590e = this.f58588b + i7;
                }
                return Character.valueOf((char) i7);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i7 = this.f58590e;
        if (i7 == this.f58589c) {
            if (this.d) {
                this.d = false;
                return i7;
            }
            throw new NoSuchElementException();
        }
        this.f58590e = this.f58588b + i7;
        return i7;
    }

    @Override
    public final void remove() {
        switch (this.f58587a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(int i7, int i10, int i11) {
        this.f58588b = i11;
        this.f58589c = i10;
        boolean z10 = false;
        if (i11 <= 0 ? i7 >= i10 : i7 <= i10) {
            z10 = true;
        }
        this.d = z10;
        this.f58590e = z10 ? i7 : i10;
    }
}
