package ra;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class i implements Iterator {
    public k f43436a;
    public k f43437b = null;
    public int f43438c;
    public final l d;
    public final int e;

    public i(l lVar, int i10) {
        this.e = i10;
        this.d = lVar;
        this.f43436a = lVar.f43451f.d;
        this.f43438c = lVar.e;
    }

    public final Object a() {
        return b();
    }

    public final k b() {
        k kVar = this.f43436a;
        l lVar = this.d;
        if (kVar != lVar.f43451f) {
            if (lVar.e == this.f43438c) {
                this.f43436a = kVar.d;
                this.f43437b = kVar;
                return kVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f43436a != this.d.f43451f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f43444f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        k kVar = this.f43437b;
        if (kVar != null) {
            l lVar = this.d;
            lVar.c(kVar, true);
            this.f43437b = null;
            this.f43438c = lVar.e;
            return;
        }
        throw new IllegalStateException();
    }
}
