package rc;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f47124a;
    public Object f47125b;
    public int f47126c;
    public int d;
    public final t f47127e;

    public s(t tVar) {
        this.f47127e = tVar;
        this.f47126c = tVar.d;
        this.d = tVar.f47130c;
    }

    public final boolean a() {
        this.f47124a = 3;
        int i10 = this.f47126c;
        if (i10 == 0) {
            this.f47124a = 2;
        } else {
            t tVar = this.f47127e;
            Object[] objArr = tVar.f47128a;
            int i11 = this.d;
            this.f47125b = objArr[i11];
            this.f47124a = 1;
            this.d = (i11 + 1) % tVar.f47129b;
            this.f47126c = i10 - 1;
        }
        if (this.f47124a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f47124a;
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
        int i10 = this.f47124a;
        if (i10 == 1) {
            this.f47124a = 0;
            return this.f47125b;
        } else if (i10 != 2 && a()) {
            this.f47124a = 0;
            return this.f47125b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
