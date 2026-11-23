package ud;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
public final class b implements Iterator {
    public final int f58598a = 0;
    public final int f58599b;
    public final int f58600c;
    public boolean d;
    public int f58601e;

    public b(char c10, char c11, int i7) {
        boolean z10 = false;
        this.f58599b = i7;
        this.f58600c = c11;
        if (i7 <= 0 ? j.f(c10, c11) >= 0 : j.f(c10, c11) <= 0) {
            z10 = true;
        }
        this.d = z10;
        this.f58601e = z10 ? c10 : c11;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f58598a) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    @Override
    public final Object next() {
        switch (this.f58598a) {
            case 0:
                int i7 = this.f58601e;
                if (i7 == this.f58600c) {
                    if (this.d) {
                        this.d = false;
                    } else {
                        throw new NoSuchElementException();
                    }
                } else {
                    this.f58601e = this.f58599b + i7;
                }
                return Character.valueOf((char) i7);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i7 = this.f58601e;
        if (i7 == this.f58600c) {
            if (this.d) {
                this.d = false;
                return i7;
            }
            throw new NoSuchElementException();
        }
        this.f58601e = this.f58599b + i7;
        return i7;
    }

    @Override
    public final void remove() {
        switch (this.f58598a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(int i7, int i10, int i11) {
        this.f58599b = i11;
        this.f58600c = i10;
        boolean z10 = false;
        if (i11 <= 0 ? i7 >= i10 : i7 <= i10) {
            z10 = true;
        }
        this.d = z10;
        this.f58601e = z10 ? i7 : i10;
    }
}
