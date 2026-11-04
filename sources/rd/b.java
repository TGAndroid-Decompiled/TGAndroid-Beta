package rd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
public final class b implements Iterator {
    public final int f54493a = 0;
    public final int f54494b;
    public final int f54495c;
    public boolean d;
    public int f54496e;

    public b(char c2, char c10, int i3) {
        boolean z10 = false;
        this.f54494b = i3;
        this.f54495c = c10;
        if (i3 <= 0 ? j.f(c2, c10) >= 0 : j.f(c2, c10) <= 0) {
            z10 = true;
        }
        this.d = z10;
        this.f54496e = z10 ? c2 : c10;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f54493a) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    @Override
    public final Object next() {
        switch (this.f54493a) {
            case 0:
                int i3 = this.f54496e;
                if (i3 == this.f54495c) {
                    if (this.d) {
                        this.d = false;
                    } else {
                        throw new NoSuchElementException();
                    }
                } else {
                    this.f54496e = this.f54494b + i3;
                }
                return Character.valueOf((char) i3);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i3 = this.f54496e;
        if (i3 == this.f54495c) {
            if (this.d) {
                this.d = false;
                return i3;
            }
            throw new NoSuchElementException();
        }
        this.f54496e = this.f54494b + i3;
        return i3;
    }

    @Override
    public final void remove() {
        switch (this.f54493a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(int i3, int i10, int i11) {
        this.f54494b = i11;
        this.f54495c = i10;
        boolean z10 = false;
        if (i11 <= 0 ? i3 >= i10 : i3 <= i10) {
            z10 = true;
        }
        this.d = z10;
        this.f54496e = z10 ? i3 : i10;
    }
}
