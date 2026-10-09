package xd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import jd.h;
import ld.i;
import v7.a8;
public final class c implements Iterator, jd.c {
    public int f51111a;
    public Object f51112b;
    public jd.c f51113c;

    public final RuntimeException b() {
        int i10 = this.f51111a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f51111a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void c(Object obj, i iVar) {
        this.f51112b = obj;
        this.f51111a = 3;
        this.f51113c = iVar;
        kd.a aVar = kd.a.f14784a;
    }

    @Override
    public final h getContext() {
        return jd.i.f14129a;
    }

    @Override
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f51111a;
            if (i10 != 0) {
                break;
            }
            this.f51111a = 5;
            jd.c cVar = this.f51113c;
            kotlin.jvm.internal.i.b(cVar);
            this.f51113c = null;
            cVar.resumeWith(hd.i.f11092a);
        }
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            throw b();
        }
        kotlin.jvm.internal.i.b(null);
        throw null;
    }

    @Override
    public final Object next() {
        int i10 = this.f51111a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f51111a = 0;
                    Object obj = this.f51112b;
                    this.f51112b = null;
                    return obj;
                }
                throw b();
            }
            this.f51111a = 1;
            kotlin.jvm.internal.i.b(null);
            throw null;
        } else if (hasNext()) {
            return next();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void resumeWith(Object obj) {
        a8.b(obj);
        this.f51111a = 4;
    }
}
