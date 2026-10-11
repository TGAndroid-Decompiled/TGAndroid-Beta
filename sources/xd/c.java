package xd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import jd.h;
import ld.i;
import v7.a8;
public final class c implements Iterator, jd.c {
    public int f51234a;
    public Object f51235b;
    public jd.c f51236c;

    public final RuntimeException b() {
        int i10 = this.f51234a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f51234a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void c(Object obj, i iVar) {
        this.f51235b = obj;
        this.f51234a = 3;
        this.f51236c = iVar;
        kd.a aVar = kd.a.f14783a;
    }

    @Override
    public final h getContext() {
        return jd.i.f14128a;
    }

    @Override
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f51234a;
            if (i10 != 0) {
                break;
            }
            this.f51234a = 5;
            jd.c cVar = this.f51236c;
            kotlin.jvm.internal.i.b(cVar);
            this.f51236c = null;
            cVar.resumeWith(hd.i.f11091a);
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
        int i10 = this.f51234a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f51234a = 0;
                    Object obj = this.f51235b;
                    this.f51235b = null;
                    return obj;
                }
                throw b();
            }
            this.f51234a = 1;
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
        this.f51234a = 4;
    }
}
