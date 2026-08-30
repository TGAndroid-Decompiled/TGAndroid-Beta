package s8;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import k7.b7;
public final class t extends u0 implements ListIterator {
    public final int f44153a;
    public int f44154b;
    public final v f44155c;

    public t(v vVar, int i10) {
        int size = vVar.size();
        b7.d(i10, size);
        this.f44153a = size;
        this.f44154b = i10;
        this.f44155c = vVar;
    }

    public final Object a(int i10) {
        return this.f44155c.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f44154b < this.f44153a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f44154b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f44154b;
            this.f44154b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f44154b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f44154b - 1;
            this.f44154b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f44154b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
