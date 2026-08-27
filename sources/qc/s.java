package qc;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class s implements Iterator {

    public int f46213a;

    public Object f46214b;

    public int f46215c;
    public int d;

    public final t f46216e;

    public s(t tVar) {
        this.f46216e = tVar;
        this.f46215c = tVar.d;
        this.d = tVar.f46219c;
    }

    public final boolean a() {
        this.f46213a = 3;
        int i10 = this.f46215c;
        if (i10 == 0) {
            this.f46213a = 2;
        } else {
            t tVar = this.f46216e;
            Object[] objArr = tVar.f46217a;
            int i11 = this.d;
            this.f46214b = objArr[i11];
            this.f46213a = 1;
            this.d = (i11 + 1) % tVar.f46218b;
            this.f46215c = i10 - 1;
        }
        return this.f46213a == 1;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f46213a;
        if (i10 == 0) {
            return a();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override
    public final Object next() {
        int i10 = this.f46213a;
        if (i10 == 1) {
            this.f46213a = 0;
            return this.f46214b;
        }
        if (i10 == 2 || !a()) {
            throw new NoSuchElementException();
        }
        this.f46213a = 0;
        return this.f46214b;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
