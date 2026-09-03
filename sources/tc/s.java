package tc;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f44715a;
    public Object f44716b;
    public int f44717c;
    public int d;
    public final t e;

    public s(t tVar) {
        this.e = tVar;
        this.f44717c = tVar.d;
        this.d = tVar.f44720c;
    }

    public final boolean a() {
        this.f44715a = 3;
        int i10 = this.f44717c;
        if (i10 == 0) {
            this.f44715a = 2;
        } else {
            t tVar = this.e;
            Object[] objArr = tVar.f44718a;
            int i11 = this.d;
            this.f44716b = objArr[i11];
            this.f44715a = 1;
            this.d = (i11 + 1) % tVar.f44719b;
            this.f44717c = i10 - 1;
        }
        if (this.f44715a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f44715a;
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
        int i10 = this.f44715a;
        if (i10 == 1) {
            this.f44715a = 0;
            return this.f44716b;
        } else if (i10 != 2 && a()) {
            this.f44715a = 0;
            return this.f44716b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
