package u7;

import a8.y;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class b extends y implements ListIterator {
    public final int f49594b;
    public int f49595c;
    public final d d;

    public b(d dVar, int i10) {
        super(5);
        int size = dVar.size();
        w7.m.b(i10, size);
        this.f49594b = size;
        this.f49595c = i10;
        this.d = dVar;
    }

    public final Object a(int i10) {
        return this.d.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f49595c < this.f49594b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f49595c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f49595c;
            this.f49595c = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f49595c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f49595c - 1;
            this.f49595c = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f49595c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
