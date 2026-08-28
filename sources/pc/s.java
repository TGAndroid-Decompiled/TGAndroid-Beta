package pc;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f45543a;
    public Object f45544b;
    public int f45545c;
    public int d;
    public final t f45546e;

    public s(t tVar) {
        this.f45546e = tVar;
        this.f45545c = tVar.d;
        this.d = tVar.f45549c;
    }

    public final boolean a() {
        this.f45543a = 3;
        int i9 = this.f45545c;
        if (i9 == 0) {
            this.f45543a = 2;
        } else {
            t tVar = this.f45546e;
            Object[] objArr = tVar.f45547a;
            int i10 = this.d;
            this.f45544b = objArr[i10];
            this.f45543a = 1;
            this.d = (i10 + 1) % tVar.f45548b;
            this.f45545c = i9 - 1;
        }
        if (this.f45543a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i9 = this.f45543a;
        if (i9 != 0) {
            if (i9 == 1) {
                return true;
            }
            if (i9 == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return a();
    }

    @Override
    public final Object next() {
        int i9 = this.f45543a;
        if (i9 == 1) {
            this.f45543a = 0;
            return this.f45544b;
        } else if (i9 != 2 && a()) {
            this.f45543a = 0;
            return this.f45544b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
