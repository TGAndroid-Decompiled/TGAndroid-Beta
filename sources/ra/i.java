package ra;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class i implements Iterator {
    public k f43412a;
    public k f43413b = null;
    public int f43414c;
    public final l d;
    public final int e;

    public i(l lVar, int i10) {
        this.e = i10;
        this.d = lVar;
        this.f43412a = lVar.f43427f.d;
        this.f43414c = lVar.e;
    }

    public final Object a() {
        return b();
    }

    public final k b() {
        k kVar = this.f43412a;
        l lVar = this.d;
        if (kVar != lVar.f43427f) {
            if (lVar.e == this.f43414c) {
                this.f43412a = kVar.d;
                this.f43413b = kVar;
                return kVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f43412a != this.d.f43427f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f43420f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        k kVar = this.f43413b;
        if (kVar != null) {
            l lVar = this.d;
            lVar.c(kVar, true);
            this.f43413b = null;
            this.f43414c = lVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
