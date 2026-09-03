package s8;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import k7.c7;
public final class t extends u0 implements ListIterator {
    public final int f47169a;
    public int f47170b;
    public final v f47171c;

    public t(v vVar, int i10) {
        int size = vVar.size();
        c7.d(i10, size);
        this.f47169a = size;
        this.f47170b = i10;
        this.f47171c = vVar;
    }

    public final Object a(int i10) {
        return this.f47171c.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f47170b < this.f47169a) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        if (this.f47170b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f47170b;
            this.f47170b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f47170b;
    }

    @Override
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f47170b - 1;
            this.f47170b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f47170b - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
