package tc;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f48103a;
    public Object f48104b;
    public int f48105c;
    public int d;
    public final t f48106e;

    public s(t tVar) {
        this.f48106e = tVar;
        this.f48105c = tVar.d;
        this.d = tVar.f48109c;
    }

    public final boolean a() {
        this.f48103a = 3;
        int i10 = this.f48105c;
        if (i10 == 0) {
            this.f48103a = 2;
        } else {
            t tVar = this.f48106e;
            Object[] objArr = tVar.f48107a;
            int i11 = this.d;
            this.f48104b = objArr[i11];
            this.f48103a = 1;
            this.d = (i11 + 1) % tVar.f48108b;
            this.f48105c = i10 - 1;
        }
        if (this.f48103a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f48103a;
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
        int i10 = this.f48103a;
        if (i10 == 1) {
            this.f48103a = 0;
            return this.f48104b;
        } else if (i10 != 2 && a()) {
            this.f48103a = 0;
            return this.f48104b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
