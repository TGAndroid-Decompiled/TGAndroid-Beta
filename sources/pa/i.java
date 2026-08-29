package pa;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class i implements Iterator {
    public k f45684a;
    public k f45685b = null;
    public int f45686c;
    public final l d;
    public final int f45687e;

    public i(l lVar, int i10) {
        this.f45687e = i10;
        this.d = lVar;
        this.f45684a = lVar.f45702f.d;
        this.f45686c = lVar.f45701e;
    }

    public final Object a() {
        return b();
    }

    public final k b() {
        k kVar = this.f45684a;
        l lVar = this.d;
        if (kVar != lVar.f45702f) {
            if (lVar.f45701e == this.f45686c) {
                this.f45684a = kVar.d;
                this.f45685b = kVar;
                return kVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f45684a != this.d.f45702f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.f45687e) {
            case 1:
                return b().f45694f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        k kVar = this.f45685b;
        if (kVar != null) {
            l lVar = this.d;
            lVar.c(kVar, true);
            this.f45685b = null;
            this.f45686c = lVar.f45701e;
            return;
        }
        throw new IllegalStateException();
    }
}
