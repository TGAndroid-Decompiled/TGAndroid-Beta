package tc;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f44653a;
    public Object f44654b;
    public int f44655c;
    public int d;
    public final t e;

    public s(t tVar) {
        this.e = tVar;
        this.f44655c = tVar.d;
        this.d = tVar.f44658c;
    }

    public final boolean a() {
        this.f44653a = 3;
        int i10 = this.f44655c;
        if (i10 == 0) {
            this.f44653a = 2;
        } else {
            t tVar = this.e;
            Object[] objArr = tVar.f44656a;
            int i11 = this.d;
            this.f44654b = objArr[i11];
            this.f44653a = 1;
            this.d = (i11 + 1) % tVar.f44657b;
            this.f44655c = i10 - 1;
        }
        if (this.f44653a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f44653a;
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
        int i10 = this.f44653a;
        if (i10 == 1) {
            this.f44653a = 0;
            return this.f44654b;
        } else if (i10 != 2 && a()) {
            this.f44653a = 0;
            return this.f44654b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
