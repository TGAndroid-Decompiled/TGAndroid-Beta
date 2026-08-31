package tc;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f48067a;
    public Object f48068b;
    public int f48069c;
    public int d;
    public final t f48070e;

    public s(t tVar) {
        this.f48070e = tVar;
        this.f48069c = tVar.d;
        this.d = tVar.f48073c;
    }

    public final boolean a() {
        this.f48067a = 3;
        int i10 = this.f48069c;
        if (i10 == 0) {
            this.f48067a = 2;
        } else {
            t tVar = this.f48070e;
            Object[] objArr = tVar.f48071a;
            int i11 = this.d;
            this.f48068b = objArr[i11];
            this.f48067a = 1;
            this.d = (i11 + 1) % tVar.f48072b;
            this.f48069c = i10 - 1;
        }
        if (this.f48067a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f48067a;
        if (i10 != 0) {
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return a();
    }

    @Override
    public final Object next() {
        int i10 = this.f48067a;
        if (i10 == 1) {
            this.f48067a = 0;
            return this.f48068b;
        } else if (i10 != 2 && a()) {
            this.f48067a = 0;
            return this.f48068b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
