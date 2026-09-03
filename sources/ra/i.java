package ra;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class i implements Iterator {
    public k f46795a;
    public k f46796b = null;
    public int f46797c;
    public final l d;
    public final int f46798e;

    public i(l lVar, int i10) {
        this.f46798e = i10;
        this.d = lVar;
        this.f46795a = lVar.f46813f.d;
        this.f46797c = lVar.f46812e;
    }

    public final Object a() {
        return b();
    }

    public final k b() {
        k kVar = this.f46795a;
        l lVar = this.d;
        if (kVar != lVar.f46813f) {
            if (lVar.f46812e == this.f46797c) {
                this.f46795a = kVar.d;
                this.f46796b = kVar;
                return kVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f46795a != this.d.f46813f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.f46798e) {
            case 1:
                return b().f46805f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        k kVar = this.f46796b;
        if (kVar != null) {
            l lVar = this.d;
            lVar.c(kVar, true);
            this.f46796b = null;
            this.f46797c = lVar.f46812e;
            return;
        }
        throw new IllegalStateException();
    }
}
