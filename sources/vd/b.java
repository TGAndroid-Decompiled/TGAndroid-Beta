package vd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class b implements Iterator {
    public final int f49584a = 0;
    public final int f49585b;
    public final int f49586c;
    public boolean d;
    public int f49587e;

    public b(char c10, char c11, int i10) {
        boolean z10 = false;
        this.f49585b = i10;
        this.f49586c = c11;
        if (i10 <= 0 ? c10 >= c11 : c10 < c11 || c10 == c11) {
            z10 = true;
        }
        this.d = z10;
        this.f49587e = z10 ? c10 : c11;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f49584a) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    @Override
    public final Object next() {
        switch (this.f49584a) {
            case 0:
                int i10 = this.f49587e;
                if (i10 == this.f49586c) {
                    if (this.d) {
                        this.d = false;
                    } else {
                        throw new NoSuchElementException();
                    }
                } else {
                    this.f49587e = this.f49585b + i10;
                }
                return Character.valueOf((char) i10);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i10 = this.f49587e;
        if (i10 == this.f49586c) {
            if (this.d) {
                this.d = false;
                return i10;
            }
            throw new NoSuchElementException();
        }
        this.f49587e = this.f49585b + i10;
        return i10;
    }

    @Override
    public final void remove() {
        switch (this.f49584a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(int i10, int i11, int i12) {
        this.f49585b = i12;
        this.f49586c = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.d = z10;
        this.f49587e = z10 ? i10 : i11;
    }
}
