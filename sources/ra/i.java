package ra;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class i implements Iterator {
    public k f46764a;
    public k f46765b = null;
    public int f46766c;
    public final l d;
    public final int f46767e;

    public i(l lVar, int i10) {
        this.f46767e = i10;
        this.d = lVar;
        this.f46764a = lVar.f46782f.d;
        this.f46766c = lVar.f46781e;
    }

    public final Object a() {
        return b();
    }

    public final k b() {
        k kVar = this.f46764a;
        l lVar = this.d;
        if (kVar != lVar.f46782f) {
            if (lVar.f46781e == this.f46766c) {
                this.f46764a = kVar.d;
                this.f46765b = kVar;
                return kVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        if (this.f46764a != this.d.f46782f) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        switch (this.f46767e) {
            case 1:
                return b().f46774f;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        k kVar = this.f46765b;
        if (kVar != null) {
            l lVar = this.d;
            lVar.c(kVar, true);
            this.f46765b = null;
            this.f46766c = lVar.f46781e;
            return;
        }
        throw new IllegalStateException();
    }
}
