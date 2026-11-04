package v7;

import b8.y;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import x7.j5;
public final class b extends y implements ListIterator {
    public final int f56448b;
    public int f56449c;
    public final d d;

    public b(d dVar, int i3) {
        super(6);
        int size = dVar.size();
        j5.b(i3, size);
        this.f56448b = size;
        this.f56449c = i3;
        this.d = dVar;
    }

    public final Object a(int i3) {
        return this.d.get(i3);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f56449c < this.f56448b) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f56449c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i3 = this.f56449c;
            this.f56449c = i3 + 1;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f56449c;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i3 = this.f56449c - 1;
            this.f56449c = i3;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f56449c - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
