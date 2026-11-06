package ud;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
public final class b implements Iterator {
    public final int f56398a = 0;
    public final int f56399b;
    public final int f56400c;
    public boolean d;
    public int f56401e;

    public b(char c10, char c11, int i7) {
        boolean z9 = false;
        this.f56399b = i7;
        this.f56400c = c11;
        if (i7 <= 0 ? j.f(c10, c11) >= 0 : j.f(c10, c11) <= 0) {
            z9 = true;
        }
        this.d = z9;
        this.f56401e = z9 ? c10 : c11;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f56398a) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    @Override
    public final Object next() {
        switch (this.f56398a) {
            case 0:
                int i7 = this.f56401e;
                if (i7 == this.f56400c) {
                    if (this.d) {
                        this.d = false;
                    } else {
                        throw new NoSuchElementException();
                    }
                } else {
                    this.f56401e = this.f56399b + i7;
                }
                return Character.valueOf((char) i7);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i7 = this.f56401e;
        if (i7 == this.f56400c) {
            if (this.d) {
                this.d = false;
                return i7;
            }
            throw new NoSuchElementException();
        }
        this.f56401e = this.f56399b + i7;
        return i7;
    }

    @Override
    public final void remove() {
        switch (this.f56398a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(int i7, int i10, int i11) {
        this.f56399b = i11;
        this.f56400c = i10;
        boolean z9 = false;
        if (i11 <= 0 ? i7 >= i10 : i7 <= i10) {
            z9 = true;
        }
        this.d = z9;
        this.f56401e = z9 ? i7 : i10;
    }
}
