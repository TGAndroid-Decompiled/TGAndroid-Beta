package w7;

import a8.i0;
import c8.ed;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class b extends i0 implements ListIterator {
    public final int f57468b;
    public int f57469c;
    public final d d;

    public b(d dVar, int i7) {
        super(7);
        int size = dVar.size();
        ed.b(i7, size);
        this.f57468b = size;
        this.f57469c = i7;
        this.d = dVar;
    }

    public final Object a(int i7) {
        return this.d.get(i7);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f57469c < this.f57468b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f57469c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i7 = this.f57469c;
            this.f57469c = i7 + 1;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f57469c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.f57469c - 1;
            this.f57469c = i7;
            return a(i7);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f57469c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
